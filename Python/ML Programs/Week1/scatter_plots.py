import numpy as np
import matplotlib.pyplot as plt

x_train = np.array([1000, 1500])  # Size in sq ft
y_train = np.array([60, 100])  # Price in Lakhs

print(x_train.shape)  # returns a tuple of dimension

# See a Data point
# Here each corresponding index of x_train & y_train represents a a data point (x_i,y_i)

for i in range(len(x_train)):
    print(f"x^({i}),y^({i}) = ({x_train[i]},{y_train[i]})")

# Plot the data points
plt.scatter(x_train, y_train, marker="d", cmap="b", s=30)
plt.title("Housing Prices")
plt.xlabel("size in sq feet")
plt.ylabel("price in lakh rupees")
plt.show()
