package patterns;

public class using_recursion {

    static void pattern1(int row , int col)
    {
        if(row==0)
        {
            return;
        }
        if(col<row)
        {
            System.out.print("* ");
            pattern1(row,++col);
        }
        else
        {
            System.out.println();
            pattern1(--row,0);
        }
    }

    static void pattern2(int row , int col)
    {
        if(row==0)
        {
            return;
        }
        if(col<row)
        {
            pattern2(row,++col);
            System.out.print("* ");
        }
        else
        {
            pattern2(--row,0);
            System.out.println();
        }
    }
    public static void main(String[] args) {
//        pattern1(4,0);
        pattern2(4,0);
    }
}
