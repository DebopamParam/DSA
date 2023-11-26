package Lecture2;

public class StaticBlock {
    static int a = 5;
    static int b;

    /*
     Static block/variables will be RUN EXACTLY ONCE when the Class is called or mentioned for the first time
     or an instance of the class is created & the class loader loads the class into the processor.
    */
    static {
        System.out.println("I am inside static block");
        b = a * 5;
    }

    public static void main(String[] args) {
        System.out.println(StaticBlock.a + " " + StaticBlock.b);
        StaticBlock.b += 9;
        System.out.println(StaticBlock.a + " " + StaticBlock.b);
    }
}
