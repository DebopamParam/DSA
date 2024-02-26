def greet(fn):
    """Takes a function as an argument"""

    def mfx(*args, **kwargs):
        print("Good Morning")
        return fn(*args, **kwargs)

    return mfx


def add(a, b):
    return a + b

# MAIN

# greet(add) -> mfx returns a fun that is defined as mfx. ok?
# this function is then calls itself with the args (4,5)
# greet(add)(4,5) == mfx(4,5)

m = greet(add)(4, 5)
print(m)