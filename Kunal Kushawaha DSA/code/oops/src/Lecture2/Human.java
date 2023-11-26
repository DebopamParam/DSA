package Lecture2;

public class Human {
    String name;
    int age;
    boolean isMarried;

    static int population = 0;

    public Human() {
    }

    public Human(String name, int age, boolean isMarried) {
        this.name = name;
        this.age = age;
        this.isMarried = isMarried;
        Human.population += 1;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", isMarried=" + isMarried +
                '}';
    }
}
