# https://replit.com/@codewithharry/49-Day49-File-IO#main.py

# --------------------------- 1 -----------------------------

# def greet(fn):
#     """Takes a function as an argument"""

#     def mfx(*args, **kwargs):
#         print("Good Morning")
#         return fn(*args, **kwargs)

#     return mfx


# def add(a, b):
#     return a + b

# # MAIN

# # greet(add) -> mfx returns a fun that is defined as mfx. ok?
# # this function is then calls itself with the args (4,5)
# # greet(add)(4,5) == mfx(4,5)

# m = greet(add)(4, 5)
# print(m)

# --------------------------- 2 -----------------------------


# Now do to do it using -> Annotations
# We will use ---- this
# Comment the previous and use this ↓↓↓↓


def greet(fn):
    """Takes a function as an argument"""

    def mfx(*args, **kwargs):
        print("Good Morning")
        return fn(*args, **kwargs)

    return mfx


@greet
def add(a, b):
    return a + b


# add(3,2) -> greet(fn) ke andar jayega -> return karega - mfx(*args,**kwargs)
#                                                               ↑         ↑
#                                                             tuple      dict
# fir mfx() will run with the attributes (3,2) and do as it says
# Thus, when we Decorate, add() it is modified with @greet, it is decorated
# as greet() wants
print(add(3, 2))
