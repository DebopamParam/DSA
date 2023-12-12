package deepCopy_shallowCopy;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        int[] arr = {1,2,3,4,5};
        Human param = new Human("Param",22,arr);
        Human debopam = param.clone();

        System.out.println(debopam);
        System.out.println(param);
        System.out.println();

        debopam.arr[0]=999;
        debopam.name = "Debopam";
        System.out.println(param);
        System.out.println(debopam);
    }
}
