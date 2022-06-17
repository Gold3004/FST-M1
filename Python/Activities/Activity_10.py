# Activity_10
# Tuple Number Checker
# Given a tuple of numbers, iterate through it and print only those numbers which are divisible by 5

# Enter values for tuple
tuple_size = input("enter the size of the tuple : ")

# Iterate through size of the tuple to get numbers
for num in tuple_size:
    num_tuple = tuple(input("Enter a sequence of comma separated values for the tuple: ").split(","))

print("Given list is ", num_tuple)

# Print elements that are divisible by 5
print("Numbers that are divisible by 5 are : ")
for num in num_tuple:
    if (int(num) % 5 == 0):
        print(num)
