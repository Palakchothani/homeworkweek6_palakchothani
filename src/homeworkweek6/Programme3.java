package homeworkweek6;

public class Programme3
{
    double a = 20; //instance variable
    static int b=40; //Static variable

    public static void main(String[] args)
    {
        Programme3 p=new Programme3();
        p.method1(); //Calling instance method by using object
        method2(); //Directly calling static method from main method as it is static

    }
    public void method1() //instance method
    {
        //Instance area
        //Can access instance variable  by creating object
        Programme3 p=new Programme3();
        System.out.println(p.a);
        System.out.println(b);
    }
    public static void method2() //static method
    {
        //Static area
        //Can access static method directly or by using class
        Programme3 p1 = new Programme3();
        System.out.println(p1.a);//Calling instance variable using object from static method
        System.out.println(b);//Calling directly
    }
}
