package Lecture2.SingletonClass;

public class Main {
    public static void main(String[] args) {

        SingleTon obj1 = SingleTon.getInstance();
        SingleTon obj2 = SingleTon.getInstance();
        SingleTon obj3 = SingleTon.getInstance();
        // All three reference variables are pointing towards the same object

        obj1.count += 1;
        System.out.println(obj1.count);
        obj2.count += 2;
        System.out.println(obj2.count);
        obj3.count += 4;
        System.out.println(obj3.count);
    }
}
