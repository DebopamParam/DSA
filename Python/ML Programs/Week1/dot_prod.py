import decimal
import numpy as np


# Random vector with float
a = np.random.uniform(50, 101, size=10)
b = np.random.uniform(50, 101, size=10)

a = np.round(a, 2)
b = np.round(b, 2)
print(a)
print(b)

print(np.dot(a, b))
