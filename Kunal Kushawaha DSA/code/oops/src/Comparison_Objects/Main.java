package Comparison_Objects;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Student param = new Student(30, 81.2f);
        Student chaitra = new Student(26, 89.2f);
        Student aditi = new Student(6, 82.2f);
        Student ahzam = new Student(10, 99.2f);
        Student adarsh = new Student(1, 29.2f);

        Student[] list = {param, chaitra, adarsh, aditi, ahzam};

        System.out.println(Arrays.toString(list));

        Arrays.sort(list, (o1, o2) -> {
            int diff = (int)(o1.marks - o2.marks);
            return diff;
        });

        System.out.println(Arrays.toString(list));
    }
}
