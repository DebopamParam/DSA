aliens = []


def addAlien():
    color = input("Enter the color : ")
    points = input("Enter the points : ")
    alien = {"color": color, "points": points}
    aliens.append(alien)
    print(f"{len(aliens)} aliens added successfully.")


# MAIN
while True:
    choice = input("Do you want to add an alien? y/n : ")
    if choice.lower() == "y":
        addAlien()
    elif choice.lower() == "n":
        break
    else:
        print("Press y/n you andha manus \n\n")

print(aliens, end="\n\n")
# Adding new key-value pairs in alien1 dictionary
aliens[0]["x_position"] = 10
aliens[0]["y_position"] = 33
print(aliens[0], end="\n\n")

# Deleting key-value pairs in alien1 dictionary
del aliens[0]["x_position"]
del aliens[0]["y_position"]
print(aliens[0], end="\n\n")

# Using .get() to access the data (To avoid exception)
size_0 = aliens[0].get("size", "No size attribute assigned")
print(size_0)

# Accessing both key-value in a for loop
i = 0
for alien in aliens:
    i += 1
    print(f"Alien {i} : ")
    for key, value in alien.items():
        print(key, " ", value)
    print("\n")
