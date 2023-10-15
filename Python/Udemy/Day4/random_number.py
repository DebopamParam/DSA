import random as r

#Random is a Module with predefined functions in it

# To generate an integer number between [100,200]
num1 = r.randint(100,200)
print(num1)

# To generate a float in between [0,1} : 1 excluded   0.000.... - 0.999...
num2 = r.random()
print(num2)

#To generate a float between [0,5} : 0.000... - 4.999...
num3 = r.random()*5
print(num3)

#To generate a float between [100,200} : 100.000... - 199.999...
num4 = 100 + ( r.random() * (200-100) )
print(num4)