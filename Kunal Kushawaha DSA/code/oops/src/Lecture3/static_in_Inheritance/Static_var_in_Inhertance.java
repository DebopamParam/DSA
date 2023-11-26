package Lecture3.static_in_Inheritance;

public class Static_var_in_Inhertance {
    public static void main(String[] args) {
        Child.age += 5; // Incrementing static variable of Son
        System.out.println(Parent.age); // Prints 15

        Parent.print(); // Calls static method of Parent
        Child.print(); // Calls static method of Son

        Child child = new Child();
        child.print(); // Calls Son's instance method
    }
}

class Parent {
    static int age = 10;
    static void print() {
        System.out.println("I am Parent");
    }
}

class Child extends Parent {
    // Static variable age is shared between Parent and Son
    static void print() {
        System.out.println("I am Son");
    }
}