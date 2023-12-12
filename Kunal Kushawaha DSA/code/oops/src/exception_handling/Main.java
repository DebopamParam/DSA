package exception_handling;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        div(5,0);
        customException();
    }

    static void div(int a, int b) {
        try {
            int ans = a / b;
            System.out.println(ans);
        } catch (Exception e) {
//            throw new RuntimeException(e);
            System.out.println(e);
        } finally {
            System.out.println("It will run anyway");
        }
    }

    static void customException() {
        String name;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your name: ");
        name = in.nextLine();
        try {
            if (name.equals("Param")) {
                throw new CustomException("My name is param. Give your name something else");
            }
        } catch (CustomException e) {
            System.out.println(e.getMessage());
        }

    }
}
