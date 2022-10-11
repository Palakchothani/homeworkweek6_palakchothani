package homeworkweek6;

import java.util.Scanner;

//return type without parameter
public class Programme13
{
    public static void main(String[] args)
    {
        Programme13 p=new Programme13();
        double result=p.average();
        System.out.println(result); //calling instance method by creating object
    }
    public double average()
    {
       Scanner scan=new Scanner(System.in);
        System.out.println("Enter num 1:-");
        int x=scan.nextInt();
        System.out.println("Enter num 2:-");
        int y=scan.nextInt();
        System.out.println("Enter num 3:-");
        int z=scan.nextInt();
        double average=(x+y+z)/3;
        return average;
    }
}

