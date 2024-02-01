
def print_99():
    x = 99  # new local variable inside the scope of print_11
    print(x)  # will print the local variable x = 11


def print_x_outside():
    print(x)  # will print the global variable x (not defined yet)


x = 10  # global variable x = 10


def main():
    def print_x_inside():
        print(x)  # will print the variable x in the scope of main (not defined yet)

    x = 11  # variable x = 11 in the scope of main
    print_99()  # print 99
    print_x_inside()  # print 11

    x = 12  # new binding for the variable x
    print_x_outside()  # print 10
    print_99()  # print 99
    print_x_inside()  # print 12


main()
