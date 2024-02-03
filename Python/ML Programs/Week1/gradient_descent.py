import math, copy
import numpy as np
import matplotlib.pyplot as plt


# Functions
def compute_cost(x, y, w, b):

    m = x.shape[0]
    cost = 0
    for i in range(m):
        f_wb = w * x[i] + b
        cost += (f_wb - y[i]) ** 2
    cost = (1 / (2 * m)) * cost
    return cost


def f_wb(x, i, w, b):
    return w * x[i] + b


def compute_gradient(x, y, w, b):
    m = x.shape[0]
    dj_dw = 0
    dj_db = 0

    for i in range(m):
        dj_dw += (f_wb(x, i, w, b) - y[i]) * (x[i])
        dj_db += f_wb(x, i, w, b) - y[i]
    dj_db = dj_db / m
    dj_dw = dj_dw / m
    return (dj_dw, dj_db)


# MAIN

# load our dataset
x_train = np.array([1.0, 2.0])  # features
y_train = np.array([300.0, 500.0])  # target value

print(compute_gradient(x_train, y_train, 100, 80))
