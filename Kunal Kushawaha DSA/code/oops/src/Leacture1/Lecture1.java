package Leacture1;

public class Lecture1 {
    public static void main(String[] args) throws Exception {
        Student param = new Student("Debopam ", 30);
        param.greet();
        Student chaitra = new Student("Chaitra ", 26);
        chaitra.greet();

        Obj_destroyed obj = new Obj_destroyed();
        obj.perform_task();
        obj.close();
    }
}

class Student {
    String name = "No Input";
    int roll = 0;

    Student() {
    }

    Student(String name, int roll) {
        // name -> Local Variable
        //this.name -> Obj. variable
        this.name = name;
        this.roll = roll;
    }

    Student(Student obj) {
        this.name = obj.name;
        this.roll = obj.roll;
    }

    void greet() // name is Local Variable
    {
        System.out.println(this.name + "Says hello. "); // This.name is instance/Object Variable
    }
}
// Doing a task when an object is Destroyed

class Obj_destroyed implements AutoCloseable{
    Obj_destroyed()
    {
        System.out.println("Object is created.");
    }

    void perform_task()
    {
        System.out.println("Task performed");
    }

    @Override
    public void close() throws Exception {
        System.out.println("Object Destroyed");
    }
}