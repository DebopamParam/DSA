print("     Welcome to Tip Calculator       ")

bill = float(input("What was the total bill ?     : "))

# Ask for the percentage tip you want to give to the Waiter

percent = int(input("What is the percentage tip you want to give to the Waiter : "))

# Tip = total bill * (percentage/100)

tip = bill * percent / 100

# Ask How many people are splitting the bill ?

no_of_people = int(input("How many people are splitting the bill ?           : "))

# Each Person need to pay
my_portion = (bill + tip) / no_of_people

print(f"Each should pay : ${round(my_portion,2)}")
