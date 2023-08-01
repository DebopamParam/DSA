package com.demo;

import java.util.Scanner;

import static java.lang.System.exit;

public class Demo {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        switch (n) {
            case 1, 2, 3, 4, 5 -> System.out.println("Weekdays");
            case 6, 7 -> System.out.println("Weekends");
            default -> System.out.println("Hafte me 7 hi din hote hain Bhai 😂");
        }

    }
}
