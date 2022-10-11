package homeworkweek6;

import java.util.Scanner;

//return type with no parameter
public class Programme15
{
    public static void main(String[] args)
    {
        Programme15 p=new Programme15();
        int result= p.swap();
    }
    public int  swap(){
        int num1;
        int num2;
        int swap;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter first value:-" );
        num1= scan.nextInt();
        System.out.println("Enter second value:-");
        num2=scan.nextInt();
        System.out.println("Values before swapping");
        System.out.println(num1);
        System.out.println(num2);
        swap=num1;
        num1=num2;
        num2=swap;
        System.out.println("Values after swapping");
        System.out.println(num1);
        System.out.println(num2);
        return swap;
    }
}
