package Lecture2;


public class Nested_Class{
    public static void main(String[] args) {
        /*
            To create an instance of InnerClass
            We cannot get InnerClass() constructor without creating a OuterClass instance.
            Thus we can say InnerClass is Dependent on OuterClass
            •  OuterClass.InnerClass i = new InnerClass(); --> will throw an error.
            We can have two solutions.
            Solution 1 :
                    make the InnerClass static, hence independent of OuterClass.
                    OuterClass.InnerClass i = new InnerClass(); --> will work.
            Solution 2 :
                    Create an object of OuterClass first
          */

        OuterClass outer = new OuterClass();

        OuterClass.InnerClass inner = new OuterClass.InnerClass();
        outer.outerMethod();
        inner.innerMethod();

    }
}

class OuterClass {
    static int outer = 2 ;
    void outerMethod()
    {
        System.out.println("Outer Class " + outer);
    }
    static class InnerClass{
        static int outer = 0 ;
        void innerMethod()
        {
            System.out.println("Inner Class " + outer);
        }
    }
}
