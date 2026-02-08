# Quick test to verify header access
from fastapi import FastAPI, Request

app = FastAPI()

@app.get("/test")
async def test(request: Request):
    # Test different ways to access headers
    print(f"Headers dict: {dict(request.headers)}")
    print(f"get('accept-language'): {request.headers.get('accept-language')}")
    print(f"get('Accept-Language'): {request.headers.get('Accept-Language')}")
    return {"ok": True}

if __name__ == "__main__":
    import uvicorn
    uvicorn.run(app, host="127.0.0.1", port=8001)
