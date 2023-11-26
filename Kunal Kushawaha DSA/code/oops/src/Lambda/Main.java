package Lambda;

public class Main {
    public static void main(String[] args) {

        int num1 = 5, num2 = 3;

        Calculate sum = (a, b) -> {
            return a + b;
        };
        Calculate sub = (a, b) -> {
            return a - b;
        };
        Calculate mul = (a, b) -> {
            return a * b;
        };
        Calculate dev = (a, b) -> {
            return a / b;
        };
        
        System.out.println(sum.cal(num1, num2));
        System.out.println(sub.cal(num1, num2));
        System.out.println(dev.cal(num1, num2));
        System.out.println(mul.cal(num1, num2));
    }
}

interface Calculate {
    int cal(int a, int b);
}