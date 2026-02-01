
import requests
import json

def verify_filter():
    url = "http://127.0.0.1:8000/api/v1/sqls"
    params = {
        "limit": 5,
        "sql_id": "insert"
    }
    
    try:
        response = requests.get(url, params=params)
        print(f"Status Code: {response.status_code}")
        
        if response.status_code == 200:
            data = response.json()
            print(f"Count: {len(data)}")
            for item in data:
                print(f"ID: {item.get('id')}, Logical: {item.get('logical_name')}")
        else:
            print(f"Error: {response.text}")
            
    except Exception as e:
        print(f"Exception: {e}")

if __name__ == "__main__":
    verify_filter()
