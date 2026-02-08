
import sys
import os

# Add the server directory to sys.path
sys.path.append(r'd:\workspaces\davis\ai-code-analyzer\server')

from csa.services.java_analysis.part4 import _parse_single_file_wrapper

# Check signature
import inspect
sig = inspect.signature(_parse_single_file_wrapper)
print(f"Signature: {sig}")

if 'skip_dto_source' in sig.parameters and 'skip_dto_methods' in sig.parameters:
    print("SUCCESS: skip_dto_source and skip_dto_methods present in signature")
else:
    print("FAILURE: Missing parameters in signature")

# Simulate usage in ThreadPoolExecutor (just the call construction)
try:
    # We won't actually run it because it needs a real file and dependencies, but we can check if the call *would* work syntactically
    # by binding arguments to the signature
    bound = sig.bind("dummy.java", "test_project", {}, False, skip_dto_source=True, skip_dto_methods=True)
    print("SUCCESS: Arguments bind correctly")
except TypeError as e:
    print(f"FAILURE: Argument binding failed: {e}")
