# bicycles = ["BMX", "Hero", "Redline", "Desi Khatara"]
# #             0       1        2            3
# #            -4      -3       -2           -1

# print(bicycles[::-1])

# # Adding elements to the list
# bicycles.append("LadyBird")

# print(bicycles)

# # Insert in an index
# bicycles.insert(2, ["Param"])
# print(bicycles)

# # Deleting an item on the list
# del bicycles[2]
# print(bicycles)

# # pop() the item in the last index
# x = bicycles.pop()
# print(x)

# # Sort the list and store it to a separate list
# lst = [5, 2, 9, 1, 8, 3]
# x = sorted(lst)
# print(x)

# # Popping last item from the list
# last_item = lst.pop()
# print(last_item)

# # popping item from an index
# first_item = lst.pop(0)
# print(first_item)

# # Removing an item by value
# lst = [4, 6, 7, 1, 2, 3, 9, 8, 7, 0, 4, 6]
# lst.remove(4)
# print(lst)


# # Define the dimensions of the 2D list
# rows = 2
# cols = 5

# # Create the 2D list using list comprehension
# matrix = [[col for col in range(cols)] for row in range(rows)]

# print(matrix)

# # Temporarily sort a list
# lst = [5, 3, 6, 7, 2]
# print(sorted(lst, reverse=True))

# lst.reverse()
# print(lst)

lst = list(range(1, 11, 2))
lst_compr = [[col for col in range(1, 10)] for row in range(1, 11, 2)]

print(lst_compr[2])
