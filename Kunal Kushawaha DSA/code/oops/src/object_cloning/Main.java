package object_cloning;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human param = new Human("Param", 22);
        Human debopam = param.clone();
        System.out.println(debopam.name + " " + debopam.age);
    }
}
