responses = {}

# Polling done?
polling_done = False

while not polling_done:
    name = input("What is your name : ")
    food = input("what is your favourite food? : ")
    responses[name] = food

    # Ask if done
    ask = input("\nDo you want to add more ? : y/n")
    if ask.lower() == "n":
        polling_done = True

print("\n")
for name, food in responses.items():
    print(f"\n{name} likes -> {food}\n")
