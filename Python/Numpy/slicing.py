import numpy as np

# arr1 = np.array([1, 2, 3, 4, 5, 6, 7, 8, 9])
# print(arr1[:])  # AlL items
# print(arr1[2:5])  # 2 to 4
# print(arr1[1::2])  # 1 to last in steps 2
# print(arr1[-9:-2])  # -9 to -3

# 2D Arrays -> count starts from 0
arr2 = np.array(
    [
        [70, 12, 10, 29, 79, 98, 78, 80, 69, 3],
        [87, 97, 6, 73, 3, 97, 86, 18, 56, 14],
        [63, 38, 82, 3, 4, 96, 10, 4, 43, 20],
        [98, 38, 9, 13, 52, 76, 22, 52, 14, 74],
        [37, 52, 11, 3, 68, 32, 46, 6, 31, 29],
    ]
)

# Extract 2nd row(index 1) and 3rd item(index 2)
print(arr2[1, 2])  # same as arr2[1][2]
print(arr2[:, :])  # 1st slice is for row & 2nd slice is for col
print()
print(arr2[2:4, ::-1])
