# Activity_05
# Prints the multiplication table (from 1 to 10) of a number entered by user.

# Takes a number as input from user
number = int(input("Input a number: "))

# uses for loop to iterate 10 times to print multiplication table for user entered number
for i in range(1,11):
    print(number, ' x ', i, ' = ', number*i)