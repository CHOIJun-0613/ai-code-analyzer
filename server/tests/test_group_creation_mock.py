
print("Starting test script...")
import unittest
import sys
import os

# Add the server directory to sys.path to allow importing app modules
current_dir = os.path.dirname(os.path.abspath(__file__))
server_dir = os.path.dirname(current_dir)
sys.path.append(server_dir)

from unittest.mock import MagicMock, patch
from app.services.user_service import UserService
from app.models.user import Group, GroupCreate, Permission

class TestGroupCreation(unittest.TestCase):

    @patch('app.services.user_service.get_db')
    def test_create_group_duplicate(self, mock_get_db):
        # Mock DB session and result
        mock_driver = MagicMock()
        mock_session = MagicMock()
        mock_get_db.return_value = mock_driver
        mock_driver.session.return_value.__enter__.return_value = mock_session

        # First call to get_group_by_id returns an existing group
        # Mocking the session.run().single() to return a record
        mock_record_existing = MagicMock()
        mock_record_existing.__getitem__.side_effect = lambda key: {"id": "TestGroup", "name": "TestGroup", "permissions": []}[key]
        mock_record_existing.get.side_effect = lambda key, default=None: {"permissions": []}.get(key, default)
        
        # We need to control the sequence of session.run calls.
        # 1. get_group_by_id calls run()
        
        # Configure the mock to return the existing record when queried
        mock_result = MagicMock()
        mock_result.single.return_value = {"g": {"id": "TestGroup", "name": "TestGroup", "permissions": []}}
        mock_session.run.return_value = mock_result

        # Call create_group and expect ValueError
        with self.assertRaises(ValueError) as context:
            UserService.create_group("TestGroup", ["manage_users"])
        
        self.assertIn("Group with name 'TestGroup' already exists", str(context.exception))

    @patch('app.services.user_service.get_db')
    def test_create_group_success(self, mock_get_db):
        # Mock DB session and result
        mock_driver = MagicMock()
        mock_session = MagicMock()
        mock_get_db.return_value = mock_driver
        mock_driver.session.return_value.__enter__.return_value = mock_session

        # First call to get_group_by_id returns None (active check)
        # Second call to create group returns the new group
        
        # We use side_effect to return different results for consecutive calls to run()
        # However, run() returns a Result object which has single().
        
        # Result 1: get_group_by_id -> returns empty result
        mock_result_1 = MagicMock()
        mock_result_1.single.return_value = None
        
        # Result 2: create query -> returns new group
        mock_result_2 = MagicMock()
        mock_result_2.single.return_value = {"g": {"id": "NewGroup", "name": "NewGroup", "permissions": ["manage_users"]}}

        mock_session.run.side_effect = [mock_result_1, mock_result_2]

        new_group = UserService.create_group("NewGroup", ["manage_users"])
        
        self.assertEqual(new_group.name, "NewGroup")
        self.assertEqual(new_group.id, "NewGroup")

if __name__ == '__main__':
    unittest.main()
