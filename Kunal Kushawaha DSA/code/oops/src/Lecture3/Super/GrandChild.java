package Lecture3.Super;

public class GrandChild extends Child {
    String name ;
    GrandChild(Double l, Double b, Double h, Double weight , String name)
    {
        super(l,b,h,weight);
        this.name = name;
    }
}
