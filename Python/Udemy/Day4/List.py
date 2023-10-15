''' 
*********************** Major Takeaways *************************

Docs : https://www.geeksforgeeks.org/python-lists/
List Methods : https://docs.python.org/3/tutorial/datastructures.html

NOTES : random.choice(sequence)
        The choice() function takes only one parameter. It takes a non-empty sequence, which is a required parameter
        and the sequence could be a list, a tuple, a string, a range of numbers, etc.
        
'''

import random as r

names_string = input("Give me everybody's names, separated by a comma. ")
names = names_string.split(", ")

n = len(names)-1

pick = names[r.randint(0,n)]

print(f"{pick} is going to buy the meal today!")

# Using choice() function

print(f"{r.choice(names)} is going to buy the meal today!")