package abstraction;

public class Daughter extends Parent{

    public Daughter(int child_age) {
        super(child_age);
    }

    @Override
    void career(String career) {
        System.out.println("Daugter chose to be "+ career);
    }

    @Override
    void partner(String partner_name) {
        System.out.println("Daughter chose " + partner_name);
    }
}
