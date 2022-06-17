# Activity_14
# Using Recursion: Write a program that asks the user how many Fibonacci numbers to generate and then
# generates them. Hint: The Fibonacci sequence is a sequence of numbers where the next number in the sequence is the
# sum of the previous two numbers in the sequence. The sequence looks like this: 1, 1, 2, 3, 5, 8, 13, …

def fibonacci(number):
    if number <= 1:
        return number
    else:
        return(fibonacci(number-1) + fibonacci(number-2))

nterms = int(input("Enter a number: "))

if nterms <= 0:
    print("Please enter a positive number")
else:
    print("Fibonacci Sequence: ")
    for i in range(nterms):
        print(fibonacci(i))