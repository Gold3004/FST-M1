# Activity_11
# Fruit Shop
# Create a Python dictionary that contains a bunch of fruits and their prices.
# check if a certain fruit is available or not at the Fruit shop

fruit_shop = {
    "apple": 10,
    "banana": 15,
    "orange": 8,
    "peache": 15
}

fruit_you_want = input("What are you looking for? ").lower()

if fruit_you_want not in fruit_shop:
    print(fruit_you_want + " is not available, try at next shop")
else:
    print(fruit_you_want + " is available")