users = {
    "_param_here_": {
        "first": "Debopam",
        "last": "Chowdhury",
        "age": 23,
    },
    "chasing_chaitra": {
        "first": "Chaitra",
        "last": "Adiga",
        "age": 21,
    },
}

for user_name, user_info in users.items():
    print(f"Username : {user_name}")
    full_name = user_info["first"] + user_info["last"]
    age = user_info["age"]
    print(f"Fullname : {full_name}")
    print(f"Age : {age}", end="\n\n")
