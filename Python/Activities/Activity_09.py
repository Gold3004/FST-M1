# Activity_09
# Combining Lists
# Given a two list of numbers this program creates a new list such that
# New list contains only odd numbers from the first list and then even numbers from the second list.

# Given lists
listOne = [10, 20, 23, 11, 17]
listTwo = [13, 43, 24, 36, 12]

# Print the lists
print("First List ", listOne)
print("Second List ", listTwo)

# Declare a even and odd list to contain the result from listone and listtwo
evenList = []
oddList = []

# Iterate through first list to get odd elements
for num in listOne:
    if (num % 2 != 0):
        evenList.append(num)

# Iterate through first list to get even elements
for num in listTwo:
    if (num % 2 == 0):
        oddList.append(num)

# Print result
print("Even List is:")
print(evenList)
print("Odd List is:")
print(oddList)
