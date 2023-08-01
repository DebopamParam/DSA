package com.param;

import java.util.ArrayList;
import java.util.Scanner;

public class Two_D_ArrayList {


    public static void main(String[] args) {

        //Declaring 2D ArrayList
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        System.out.println("Enter the number of List : ");

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        //Initializing ArrayList
        for (int i = 0; i < n; i++) {
            list.add(new ArrayList<Integer>());
        }

        //Giving input
        for (ArrayList<Integer> integers : list) {
            for (int j = 0; j < 3; j++) {
                integers.add(in.nextInt());
            }
        }

        //Output
        System.out.println(list);

    }

}
