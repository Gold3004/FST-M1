# Activity 8
# List Checker
# Given a list of numbers, returns True if first and last number of a list is same.

# Given list of numbers
numList = list(input("Enter a sequence of comma separated values: ").split(", "))
print("Given list is ", numList)

# Get first element in list
firstElement = numList[0]
# Get last element in list
lastElement = numList[-1]

# Check if first and last element are equal
if (firstElement == lastElement):
    print(True)
else:
    print(False)