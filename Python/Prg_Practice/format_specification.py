# Fixed point number, with 2 decimal places
print(f"{123.4567:.2f}")  # Output: 123.46

# Fixed point number, no decimal places
print(f"{123.4567:.0f}")  # Output: 123

# Scientific notation, with 2 decimal places
print(f"{123.4567:.2e}")  # Output: 1.23e+02

# Percentage, with no decimal places
print(f"{0.4567:.0%}")  # Output: 46%

# Integer padding with zeros
print(f"{123:05d}")  # Output: 00123

# Hexadecimal representation
print(f"{123:x}")  # Output: 7b

# Octal representation
print(f"{123:o}")  # Output: 173

# Binary representation
print(f"{123:b}")  # Output: 1111011
