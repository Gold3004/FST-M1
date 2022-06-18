# Activity_23
# Fixtures Using pytest:
# Create a new test file and Create a fixture that initializes a list containing numbers from 0-10.
# Using a test method for asserting that the sum of the list is 55
# Once confirmed sum is 55, the test passes, and moves the fixture into the conftest.py file and rerun the test.
import pytest

# Creating fixture
# @pytest.fixture
# def num_list():
#     # Create list
#     list = [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11]
#
#     # Alternatively
#     # list = list(range(11))
#
#     return list

# Write test method
def test_sum(num_list):

    # Initialize sum
    sum = 0

    # Add number in the list
    for n in num_list:
        sum += n

    # Assertion
    assert sum == 55