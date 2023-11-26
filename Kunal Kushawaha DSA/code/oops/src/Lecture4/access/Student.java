package Lecture4.access;

public class Student {
    protected int no_of_sub;
    protected String name;
    private String[] sub_names;

    public Student() {

    }

    protected Student(int no_of_sub, String name) {
        this.no_of_sub = no_of_sub;
        this.name = name;
        this.sub_names = new String[no_of_sub];
    }

    public int getNo_of_sub() {
        return no_of_sub;
    }

    public void setNo_of_sub(int no_of_sub) {
        this.no_of_sub = no_of_sub;
    }

    public String getName() {
        return name;
    }
}
