package Lecture3.Super;

public class Parent {

    Double weight = 10.0;
    protected Double l;
    Double b;
    Double h;

    public Parent() {
        this.l = -1.0;
        this.b = -1.0;
        this.h = -1.0;
    }

    public Parent(Double l, Double b, Double h) {
        this.l = l;
        this.b = b;
        this.h = h;
    }

    public Parent(Parent other) {
        this.l = other.l;
        this.b = other.b;
        this.h = other.h;
        this.weight = other.weight;
    }
}
