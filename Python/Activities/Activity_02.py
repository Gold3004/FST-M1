# Activity_02
# program takes an number from user as input and depending on the provied number,
# print if the number is an even or odd number.
num = int(input("Enter a number: "))
mod = num % 2
if mod > 0:
    print("You picked an odd number.")
else:
    print("You picked an even number.")
