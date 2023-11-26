package abstraction;

public class Main {
    public static void main(String[] args) {
        Son son = new Son(22);
        System.out.println(son.child_age);
        son.career("Engineer");
        son.partner("Chaitra");

        Daughter daughter = new Daughter(24);
        System.out.println(daughter.child_age);
        daughter.career("Chef");
        daughter.partner("(Yet to be Decided)");
    }
}
