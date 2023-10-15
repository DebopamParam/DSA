package practice;

import java.util.Scanner;

public class Amichotajaan {
    public static void main(String[] args) {
        Scanner cj = new Scanner(System.in);
//        System.out.println("Give the number:- ");
//        int n =cj.nextInt();
//        System.out.println("Enter the digit to find occurance :- ");
//        int o =cj.nextInt();
//        int count=0;
//        while(n!=0){
//            int rem=n%10;
//            if(rem==o){
//                count++;
//            }
//            n=n/10;
//        }
//        System.out.println("The digit "+o+" has occured "+count+" many times");


//        System.out.println("Enter the digit for reverse:-");
//        int dig =cj.nextInt();
//        int rev=0;
//        while(dig!=0){
//            int rem=dig%10;
//            rev=rev*10+rem;
//            dig=dig/10;
//
//        }
//        System.out.println(" reverse:- "+rev);



        while (true){
            System.out.println("Enter operations \n +,_,*,/,%:- \nEnter x to exit");
            char op=cj.next().trim().charAt(0);
            if (op=='+'||op=='-'||op=='*'||op=='/'||op=='%'){
                System.out.println("you have choosen "+op);
                System.out.println("Enter two no.s");
                float a = cj.nextFloat();
                float b = cj.nextFloat();
                float res=0.0f;
                if(op=='+'){
                     res=a+b;
                }
                if(op=='-'){
                     res=a-b;
                }
                if(op=='*'){
                     res=a*b;
                }
                if(op=='/'){
                     res=a/b;
                }
                if(op=='%'){
                     res=a%b;
                }
                System.out.println("result is "+res);
            } else if (op=='x'||op=='X') {
                System.exit(0);
            }
            else {
                System.out.println("Enter a valid input!");
            }

        }
    }
}
