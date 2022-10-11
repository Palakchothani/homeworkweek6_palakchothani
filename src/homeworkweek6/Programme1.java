package homeworkweek6;

public class Programme1
{
    int a=10; //instance variable
    int b=20; //instance variable

    public static void main(String[] args) {

        Programme1 p=new Programme1();
        p.myMethod();


    }
    //instance method
    public void myMethod()
    {
        Programme1 p=new Programme1();
        System.out.println(p.a);
        System.out.println(p.b);
    }
}
