package abstraction;

public abstract class Parent {
    protected int child_age;

    public Parent() {
    }
    public Parent(int child_age) {
        this.child_age = child_age;
    }

    abstract void career(String career);

    abstract void partner(String partner_name);
}
