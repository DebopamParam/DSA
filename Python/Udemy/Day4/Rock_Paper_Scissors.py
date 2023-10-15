import random
import os

rock = """
    _______
---'   ____)
      (_____)
      (_____)
      (____)
---.__(___)
"""

paper = """
    _______
---'   ____)____
          ______)
          _______)
         _______)
---.__________)
"""

scissors = """
    _______
---'   ____)____
          ______)
       __________)
      (____)
---.__(___)
"""

# Write your code below this line 👇

moves = [rock, paper, scissors]
# choices = ["Rock" 0 , "Paper" 1 , "Scissors" 2 ]'

while True:
    print("***************************** NEW GAME *******************************")

    your_choice = input("Enter \n1 for Rock \n2 for Paper \n3 for Scissors \nChoice: ")

    if your_choice != "1" and your_choice != "2" and your_choice != "3":
        print("********** 3 Hi Option hai Sale ***********")
        print("********** Right Option Daalo ***********")
        continue

    your_choice = int(your_choice) - 1

    computer_choice = random.randint(0, 2)

    print("You : ")
    print(moves[your_choice])
    print("Computer : ")
    print(moves[computer_choice])
    print("********** Results ***********")
    print("↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓")

    if your_choice == computer_choice:
        print("********** DRAW **************")
    elif (
        (your_choice == 0 and computer_choice == 2)
        or (your_choice == 1 and computer_choice == 0)
        or (your_choice == 2 and computer_choice == 1)
    ):
        print("********** YOU WIN **************")
    else:
        print("********** COMPUTER WINS **************")

    ch = input("\nNew Game: Any Key \nExit: 69 \nChoice: ")
    if ch == "69":
        break
    os.system("cls")
