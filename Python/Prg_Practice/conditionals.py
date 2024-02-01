requested_toppings = ["mushrooms", "jalapenos"]
available_toppings = ["pepperoni", "mushrooms", "green peppers", "onions", "olives"]

# Check if there is any topping is requested
if requested_toppings:
    # if it enters the if statement, it the requested toppings list is not empty
    for topping in requested_toppings:
        if topping not in available_toppings:
            print(f"{topping} not available at the moment. Please add something else")
        else:
            print(f"Adding {topping} for you")

digits = [1, 2, 3, 4, 5, 6, 7, 8, 9]
for digit in range(1, 10):
    if digit == 1:
        print(f"{digit}st", end="\t")
    elif digit == 2:
        print(f"{digit}nd", end="\t")
    elif digit == 3:
        print(f"{digit}rd", end="\t")
    else:
        print(f"{digit}th", end="\t")
