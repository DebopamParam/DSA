players = ["param", "priash", "anoy", "anik", "antu", "riad"]

# Slicing through the list
print(players[1:5])  # [1,5)

# in steps
print(players[::2])
print()


# Slicing in the range of a for loop
for player in players[1:5]:
    print(player, end="\t\t")


# Copying a Slice  (DEEP COPY)
first_3_players = players[0:3]
print(first_3_players)

last_3_players = players[-3:]
print(last_3_players)
