# TypeCasting test

print("************************** 1 ********************************")

print(int(6.66666))
# o/p : 6        -> Does not round it off to 7


print("*************************** 2 *******************************")

print(round(6.66666666))
# o/p : 7 -> Does round it off to 7
print(round(6.66666666, 3))
# o/p : 6.667    -> Does round it off to 3 decimal places

print("*************************** 3 *******************************")

# Floor Division
print(11 // 3)  # 11/3 = 3.66
# o/p : 3        -> Cuts off the Decimal places without rounding off

print("*************************** 4 ******************************")

# Formatted String ( f String )
name = " Debopam Chowdhury. "
age = 20
height = 1.79
isFit = True

print(
    f"Hello my name is {name}. My age is {age}. I am {height} meters tall. I am fit to play Cricket : {isFit}"
)
