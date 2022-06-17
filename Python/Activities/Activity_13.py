# Activity_13
# Adding List Numbers
# Accept a list of elements from user, print the sum of all elements/numbers

# Custom function to calculate sum
def calculate_sum(numbers):
    sum = 0
    for number in numbers:
        sum += int(number)
    return sum

# Enter values for tuple
List_size = input("enter the size of the List: ")

# Iterate through size of the tuple to get numbers
for num in List_size:
    numList = tuple(input("Enter a sequence of " + List_size + " comma separated values for the List: ").split(","))

# Call the calculate_sum() function with numList as argument
result = calculate_sum(numList)

# Print result with message
print("The sum of all the elements is: " + str(result))