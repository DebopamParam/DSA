fav_lang = {
    "chaitra": "java",
    "param": "python",
    "ashish": "html",
    "aditi": "java",
    "khushi": "c++",
}

for key in fav_lang.keys():  # keys is the default value
    print(key)
for value in fav_lang.values():
    print(value)

# Using conditionals to check if a value is present in the dictionary
if "dart" not in fav_lang.values():
    print("Koyi flutter developer nhi h kya")

# Iterate through the sorted() key-value pairs
for item in sorted(fav_lang.keys()):
    print(item.title())

# ignore duplicate items ( set(dictionary) )
for key, value in set(fav_lang.items()):
    print(f"Key: {key} -> Value: {value}")
