import unittest
import sys
from tests.test_stats_path import TestStatsPath

if __name__ == '__main__':
    suite = unittest.TestLoader().loadTestsFromTestCase(TestStatsPath)
    result = unittest.TextTestRunner(stream=sys.stdout, verbosity=2).run(suite)
    if result.wasSuccessful():
        print("TEST_EXECUTION_SUCCESS")
    else:
        print("TEST_EXECUTION_FAILURE")
