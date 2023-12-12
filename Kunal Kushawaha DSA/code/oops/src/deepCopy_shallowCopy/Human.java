package deepCopy_shallowCopy;

import java.util.Arrays;

public class Human implements Cloneable {
    String name; // Object
    int age; // Primitive
    int[] arr; // Object

    public Human(String name, int age, int[] arr) {
        this.name = name;
        this.age = age;
        this.arr = arr;
    }

    public Human clone() throws CloneNotSupportedException {
        // This creates a Shallow Copy
        Human clone = (Human) super.clone();

        //This creates Deep copy
        clone.arr = this.arr.clone();

        /* OR WE CAN USE THIS ↓↓↓  .  ALL CREATES DEEP COPY */
        //  clone.arr = new int[this.arr.length];
        //  System.arraycopy(this.arr, 0, clone.arr, 0, this.arr.length);


        /*
         Although String is non-Primitive, it is not required to Deep copy. Because String is Immutable. Therefore, if we try to assign
         a new String object to "clone.name", it will automatically create a new String object, not override the previous one
        */

        // clone.name = new String(this.name);    NOT REQUIRED

        return clone;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", arr=" + Arrays.toString(arr) +
                '}';
    }
}
