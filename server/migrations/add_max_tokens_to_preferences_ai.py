"""
Add max_tokens to User.preferences_ai

This migration adds the max_tokens field to all User nodes' preferences_ai property.
If a user doesn't have preferences_ai, it will create a default one.
"""
import os
import json
from neo4j import GraphDatabase


def migrate():
    """
    Add max_tokens to User.preferences_ai
    """
    uri = os.getenv("NEO4J_URI", "bolt://localhost:7687")
    user = os.getenv("NEO4J_USER", "neo4j")
    password = os.getenv("NEO4J_PASSWORD")
    database = os.getenv("NEO4J_DATABASE", "neo4j")

    if not password:
        print("❌ Error: NEO4J_PASSWORD environment variable is not set")
        return

    driver = GraphDatabase.driver(uri, auth=(user, password))

    try:
        with driver.session(database=database) as session:
            # 1. preferences_ai가 있는 사용자 업데이트
            print("Step 1: Updating users with existing preferences_ai...")
            result = session.run("""
                MATCH (u:User)
                WHERE u.preferences_ai IS NOT NULL
                RETURN u.id as user_id, u.preferences_ai as prefs
            """)

            updated_count = 0
            skipped_count = 0

            for record in result:
                user_id = record["user_id"]
                prefs_str = record["prefs"]

                try:
                    prefs = json.loads(prefs_str)

                    # max_tokens가 없으면 추가
                    if "max_tokens" not in prefs:
                        prefs["max_tokens"] = 8192

                        # 업데이트
                        session.run("""
                            MATCH (u:User {id: $user_id})
                            SET u.preferences_ai = $prefs
                        """, user_id=user_id, prefs=json.dumps(prefs))

                        print(f"✅ Updated user {user_id}: added max_tokens=8192")
                        updated_count += 1
                    else:
                        print(f"⏭️  Skipped user {user_id}: max_tokens already exists")
                        skipped_count += 1
                except json.JSONDecodeError:
                    print(f"⚠️  Warning: Invalid JSON for user {user_id}")

            print(f"\nStep 1 Summary: {updated_count} updated, {skipped_count} skipped")

            # 2. preferences_ai가 없는 사용자에게 기본값 설정
            print("\nStep 2: Setting default preferences_ai for users without it...")
            default_prefs = {
                "use_analysis": True,
                "ai_provider": "google",
                "model_name": "gemini-2.0-flash",
                "max_tokens": 8192,
                "concurrent_ai_requests": 15,
                "ai_enrichment_batch_size": 50
            }

            result = session.run("""
                MATCH (u:User)
                WHERE u.preferences_ai IS NULL
                SET u.preferences_ai = $default_prefs
                RETURN count(u) as count
            """, default_prefs=json.dumps(default_prefs))

            record = result.single()
            if record:
                count = record["count"]
                print(f"✅ Set default preferences_ai for {count} users")

            print("\n✅ Migration completed successfully")

    except Exception as e:
        print(f"❌ Migration failed: {e}")
        raise
    finally:
        driver.close()


def rollback():
    """
    Remove max_tokens from User.preferences_ai (Rollback)
    """
    uri = os.getenv("NEO4J_URI", "bolt://localhost:7687")
    user = os.getenv("NEO4J_USER", "neo4j")
    password = os.getenv("NEO4J_PASSWORD")
    database = os.getenv("NEO4J_DATABASE", "neo4j")

    if not password:
        print("❌ Error: NEO4J_PASSWORD environment variable is not set")
        return

    driver = GraphDatabase.driver(uri, auth=(user, password))

    try:
        with driver.session(database=database) as session:
            print("Rolling back: Removing max_tokens from preferences_ai...")
            result = session.run("""
                MATCH (u:User)
                WHERE u.preferences_ai IS NOT NULL
                RETURN u.id as user_id, u.preferences_ai as prefs
            """)

            rollback_count = 0

            for record in result:
                user_id = record["user_id"]
                prefs_str = record["prefs"]

                try:
                    prefs = json.loads(prefs_str)

                    # max_tokens 제거
                    if "max_tokens" in prefs:
                        del prefs["max_tokens"]

                        session.run("""
                            MATCH (u:User {id: $user_id})
                            SET u.preferences_ai = $prefs
                        """, user_id=user_id, prefs=json.dumps(prefs))

                        print(f"✅ Rolled back user {user_id}: removed max_tokens")
                        rollback_count += 1
                except json.JSONDecodeError:
                    print(f"⚠️  Warning: Invalid JSON for user {user_id}")

            print(f"\n✅ Rollback completed successfully: {rollback_count} users")

    except Exception as e:
        print(f"❌ Rollback failed: {e}")
        raise
    finally:
        driver.close()


if __name__ == "__main__":
    import sys

    if len(sys.argv) > 1 and sys.argv[1] == "rollback":
        rollback()
    else:
        migrate()
