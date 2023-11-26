package abstraction;

public class Son extends Parent{

    // Inherits child_age variable from parent
    public Son(int child_age) {
        super(child_age); // Will initialize the child_age variable using parent class's constructor
    }

    @Override
    void career(String career) {
        System.out.println("Son chose to be " + career);
    }

    @Override
    void partner(String partner_name) {
        System.out.println("Son loves "+ partner_name);
    }
}
