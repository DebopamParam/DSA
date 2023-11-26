package Lecture3.Super;

public class Main {
    public static void main(String[] args) {
        Child child = new Child(1.1, 2.2, 3.3, 4.4);
//        Parent parent = new Parent();
//        System.out.println(parent.l);
//        System.out.println(child.getParentWeight());

        Child child2 = new Child(child);

        GrandChild gc = new GrandChild(1.1, 2.2, 3.3, 4.4, "param");

    }
}
