import numpy as np

# Beginner
arr_1d = np.array([1, 2, 3, 4, 5, 6])
arr_2d = arr_1d.reshape(2, 3)
print(arr_2d, end="\n\n")

# Convert a row vector to a column vector
row_vector = np.array([1, 2, 3, 4, 5, 6])
column_vector = row_vector.reshape(-1, 1)
print("Row to Column Vector")
print(column_vector, end="\n\n")

# Convert a column vector to a row vector
column_vector = np.array([[1], [2], [3], [4], [5], [6]])
row_vector = column_vector.reshape(1, -1)
print("Column to Row Vector")
print(row_vector, end="\n\n")

# Intermediate
arr_1d = np.array([1, 2, 3, 4, 5, 6, 7, 8])
arr_3d = arr_1d.reshape((2, 2, 2))
print("Creating two 2D arrays from one 1D array")
print(arr_3d, end="\n\n")

# Advanced
arr_1d = np.array([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12])
print(
    """arr_2d = arr_1d.reshape(3, -1): This line reshapes the 1-dimensional array into a 2-dimensional array.
     The reshape function takes two arguments: the number of rows and the number of columns of the new array.
    In this case, the number of rows is specified as 3. 
    The -1 for the number of columns tells numpy to calculate the appropriate number of 
    columns based on the number of elements in the array and the number of rows. 
    Since there are 12 elements and 3 rows, numpy calculates that there should be 4 columns."""
)
arr_2d = arr_1d.reshape(3, -1)
print(arr_2d)
