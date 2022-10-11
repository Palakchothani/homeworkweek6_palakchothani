package homeworkweek6;

public class Programme2 {

    //static variable
    static String a="Palak";
    static String b="Chothani";

    public static void main(String[] args)
    {
      myMethod();
    }
     //static area
    public static void myMethod()
    {
        System.out.println(a);//calling static variable directly
        System.out.println(Programme2.b);//calling static variable by class name
    }
}
