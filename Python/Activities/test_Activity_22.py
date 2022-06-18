# Activity_22
# Subsets Using pytest: Appling the marker 'activity' to the last 2 test methods.
# Running tests based on substring
# Running tests based using the 'activity' marker.
import pytest

def test_Addition():
    num1 = 10
    num2 = 15
    num3 = num1 + num2  # add num1,num2 and store on num3
    assert num3 == 15

def test_Subtraction():
    num1 = 10
    num2 = 15
    num3 = num2 - num1  # subtract  num2 from num1 and store on num3
    assert num3 == 5  # check if result is 5


@pytest.mark.activity22
def test_Multiplication():
    num1 = 10
    num2 = 5
    num3 = num1 * num2  # multiply num1 & num2 and store on num3
    assert num3 == 55  # chk if result is 50


@pytest.mark.activity22
def test_Division():
    num1 = 15
    num2 = 15

    num3 = num1 / num2
    assert num3 == 1
