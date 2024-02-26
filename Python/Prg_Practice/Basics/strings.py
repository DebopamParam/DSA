# #Changing Cases
from traitlets import Integer


name = "debopam chowdhury"
print(name.lower())
print(name.upper())

print("\n")

# formatted output using Title Case
print(f"My name is {name.title()}")

# Stripping WhiteSpaces
str1 = "       Hello World        "
# Strip left whitespace
print(str1.lstrip())
# Strip right whitespace
print(str1.rstrip())
# Strip Both
print(str1.strip())

# Removing Prefixes
full_url = "http://www.google.com"
short_url = full_url.removeprefix("http://")
print(short_url)

# Replacing a sub-string
s = "abc-xyz-123-789-ABC-XYZ"
print(s.replace("xyz", ""))
# https://note.nkmk.me/en/python-str-remove-strip/

# Rounding off Floats
pi = 3.1415237
print(round(pi, 4))

# When we divide a two integers, the result will be a float
print(4 / 2)  # result -> 2.0

# If we want to store it as an integer, we have to do floor division ( // )
print(5 // 2)  # The decimal points will be ignored
# result -> 2 (Integer)

# Multiple Assignments
x, y, z = 1, 2, 3
print(x, y, z)

# Swapping two numbers
x, y = y, x
print(x, y, z)

# Constants are written in all CAPS
MAX_CAPACITY = 100_000_000

