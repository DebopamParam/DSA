import numpy as np

list1 = [1, 2, 3, 4, 5]
np1 = np.array(list1)
print(np1)

# Using list comprehension to take input in a list
list1 = [int(input(f"Enter the {i+1} th number : ")) for i in range(0, 10)]
print(list1)
