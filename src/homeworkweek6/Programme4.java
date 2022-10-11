package homeworkweek6;

public class Programme4
{
    //instance variables
    String a="Palak";
    String b="Chothani";
    //Static variables
    static short x=10000;
    static short y=20000;

    public static void main(String[] args)
    {
      Programme4 p=new Programme4();
        p.method1();//Calling instance method from static method by creating object
        method2();
    }
    //instance variable
    public void method1()
    {
        //instance area
        System.out.println(a);
        System.out.println(b);
        System.out.println(x);
        System.out.println(y);
    }
    //static method
    public static void method2() {


        //static area
        Programme4 p1 = new Programme4();
        System.out.println(p1.a); //Calling instance variable from static method by creating object
        System.out.println(p1.b);
        System.out.println(Programme4.x);//Calling by class
        System.out.println(y);//Calling directly

    }
}
