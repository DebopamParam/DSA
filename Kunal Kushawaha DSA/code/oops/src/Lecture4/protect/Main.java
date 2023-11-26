package Lecture4.protect;

import Lecture4.access.Student;

public class Main {
    public static void main(String[] args) {

        Child child = new Child();;
        Parent parent = new Parent();
        Parent obj = new Child();
        System.out.println(obj.getClass());
    }
}
