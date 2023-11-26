package Interfaces.nested_Interface;

public class Demo {
    public static void main(String[] args) {
        A obj = new A();
        System.out.println(obj.ifEven(8));
    }
}

class Outer {
    interface Inner {
        boolean ifEven(int num);
    }
}

class A implements Outer.Inner {

    @Override
    public boolean ifEven(int num) {
        return (num & 1) != 1;
    }
}