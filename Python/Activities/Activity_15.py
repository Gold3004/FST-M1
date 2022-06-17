# Activity_15
# Handling Errors
# Python program that throws a NameError and Handles the error so it doesn't halt execution.

try:
    print(x)
except NameError:
    print("x hasn't been defined yet.")