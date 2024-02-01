import numpy as np

arr = np.array([-1, -2, -3, -4, 5, 6, 7, 8, 9])

# Absolute value of all items in array
arr = np.abs(arr)  # np.abs() and np.absolute() does the same task
print(arr)

# Square root of all items in the array
root_arr = np.sqrt(arr)
# making all the items upto 3rd decimal places
root_arr = np.round(root_arr, 3)
print(root_arr)

# Exponentials of each number -->  e^(item)
exp_arr = np.exp(arr)
exp_arr = np.round(exp_arr, 3)
print(exp_arr)
