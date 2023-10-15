# https://app.codingrooms.com/w/btYcaJNKFQCP


# Major Takeaways : str.lower()  -> to convert to Lowercase
#                   str.count('a') -> count the no. of occurences of character 'a' in the String 


# 🚨 Don't change the code below 👇
print("Welcome to the Love Calculator!")
name1 = input("What is your name? \n")
name2 = input("What is their name? \n")
# 🚨 Don't change the code above 👆

#Write your code below this line 👇

for_true = 0
for i in range (0,4):
    for_true += name1.lower().count("true"[i])
    for_true += name2.lower().count("true"[i])

for_love = 0
for i in range (0,4):
    for_love += name1.lower().count("love"[i])
    for_love += name2.lower().count("love"[i])

score = str(for_true) + str(for_love)
score = int(score)

if score<10 or score>90:
    print(f"Your score is {score}, you go together like coke and mentos.")
elif score>=40 and score<=50:
    print(f"Your score is {score}, you are alright together.")
else:
    print(f"Your score is {score}.")# 🚨 Don't change the code below 👇
print("Welcome to the Love Calculator!")
name1 = input("What is your name? \n")
name2 = input("What is their name? \n")
# 🚨 Don't change the code above 👆

#Write your code below this line 👇

for_true = 0
for i in range (0,4):
    for_true += name1.lower().count("true"[i])
    for_true += name2.lower().count("true"[i])

for_love = 0
for i in range (0,4):
    for_love += name1.lower().count("love"[i])
    for_love += name2.lower().count("love"[i])

score = str(for_true) + str(for_love)
score = int(score)

if score<10 or score>90:
    print(f"Your score is {score}, you go together like coke and mentos.")
elif score>=40 and score<=50:
    print(f"Your score is {score}, you are alright together.")
else:
    print(f"Your score is {score}.")