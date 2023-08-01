package com.param;

import javax.lang.model.element.Element;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class ArrayL {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>(10);
        System.out.println("Enter elements : ");
        for (int i = 0; i < 5; i++) {
            list.add(i+1);
        }

        System.out.println(list);

        list.add(2,23);

        System.out.println(list);

        System.out.println(list.get(3));

        System.out.println(list.indexOf(5));

//        replacing a value
        int index = list.indexOf(5);
        list.set(index,69);
        System.out.println(list);

//        Removing an Element
        list.remove(Integer.valueOf(69));
        System.out.println(list);

//        Sorting

        list.sort(Comparator.naturalOrder());
        System.out.println(list);






    }

}
