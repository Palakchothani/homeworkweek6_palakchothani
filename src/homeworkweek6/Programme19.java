package homeworkweek6;

import java.util.Scanner;

public class Programme19
{
    public static void main(String[] args)
    {
        Programme19 p=new Programme19();
        p.conversion();
    }
    public void conversion()
    {
        String s1,s2;
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the String:-");
        s1=s.nextLine();
        s2=s1.toLowerCase();
        System.out.println("Above sentence in lower case");

        System.out.println(s2);
    }
}
