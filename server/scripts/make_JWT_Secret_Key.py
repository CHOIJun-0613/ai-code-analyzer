import secrets

def generate_secret_key():
    """
    Generates a secure 32-byte hex string for use as a JWT secret key.
    """
    return secrets.token_hex(32)

if __name__ == "__main__":
    key = generate_secret_key()
    print("-" * 60)
    print(f"Generated Secret Key: {key}")
    print("-" * 60)
    print("Please add this key to your .env file as SECRET_KEY:")
    print(f"SECRET_KEY={key}")
    print("-" * 60)
