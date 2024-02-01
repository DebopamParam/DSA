import numpy as np

arr = np.array([1, 2, 3, 4, 5, 6, 7, 8])
# Shallow Copy
arr_shallow = arr.view()
# Deep Copy
arr_deep = arr.copy()
print("Shallow array : ", arr_shallow)
print("Deep array : ", arr_deep)

# See the changes section

arr[0] = 999
print("Shallow array : ", arr_shallow)
print("Deep array : ", arr_deep)
