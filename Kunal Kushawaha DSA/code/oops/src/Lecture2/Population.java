package Lecture2;

public class Population {
    public static void main(String[] args) {
        System.out.println(Human.population);
        Human[] person = new Human[5];
        for (int i = 0; i < 5; i++) {
             person[i] = new Human("Param",i+18,false);
        }
        for(Human p : person)
        {
            System.out.println(p);
        }
        System.out.println(Human.population);
    }
}
