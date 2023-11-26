package Lecture3.Super;

public class Child extends Parent{
    Double weight = 0.0;

    public Child(Double weight) {
        this.weight = weight;
    }

    public Child(Double l, Double b, Double h, Double weight) {
        super(l, b, h);
        this.weight = weight;
    }

    public Child(Child other)
    {
        super(other);
        this.weight = other.weight;
    }

    public Double getParentWeight()
    {
        return super.weight;
    }
}
