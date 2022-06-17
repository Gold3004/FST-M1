# Activity 12
# Recursive Adder
# Calculate the sum of numbers from 0 to 10 using recursive function

# Define function to calculate sum
def calculateSum(num):
    if num:
        # Recursive function call
        return num + calculateSum(num - 1)
    else:
        return 0

# Call calculateSum() function
number = input("Enter a number: ")
num = int(number)
print("You want sum numbers from 0 to " + number)
res = calculateSum(num)

print(res)
# Print result
print("Sum of numbers from 0 to ", num, " is ", res)
