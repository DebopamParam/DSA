import numpy as np
import matplotlib.pyplot as plt

# House sizes in square feet
x_train = np.array([1000, 1500, 2000, 2500, 3000])

# Prices in dollars
y_train = np.array([150000, 225000, 300000, 375000, 450000])

# Define weight & bias
weight = 150
bias = 100

# Getting the size of x_train and y_train (where x_train == y_train)
m = x_train.shape[0]  # cuz 1D tuple

# f_wb = w + x[i]*b
f_wb = np.zeros(m)  # initializing an array that will store the points of the line-plot

# Calculating the f_wb points
for i in range(m):
    f_wb[i] = weight * x_train[i] + bias

# The plot values are successfully stored

# Let us plot the graph
plt.plot(x_train, f_wb, c="b", label="Our prediction")
plt.scatter(x_train, y_train, c="r", label="Actual value")

plt.title("House Price Prediction")
plt.xlabel("Size in sq ft")
plt.ylabel("Price in USD")
plt.legend()
plt.show()
