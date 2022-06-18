# Activity_24
# Parameterization Using pytest:
# Creating a new test file, fixture named wallet() that initializes the variable 'amount' as 0
# Create a test with the following parameters, that performs the following scenario with the parameters
#     My wallet initially has 0,
#     I add {earned} units of cash to the wallet,
#     I spend {spent} units of cash, and
#     I should have {expected} units of cash remaining after the two transactions
import pytest
# Set up the paremeterized test method
@pytest.mark.parametrize("earned, spent, expected", [ (30, 10, 20), (20, 2, 18), ])
def test_transactions(wallet_amount, earned, spent, expected):
    # Add money to your wallet
    wallet_amount += earned

    # Subtract amount from wallet
    wallet_amount -= spent

    # Assertion
    assert wallet_amount == expected