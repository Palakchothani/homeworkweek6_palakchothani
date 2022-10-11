package homeworkweek6;

public class AreaTriangle
{
    public static void main(String[] args)
    {
        AreaTriangle a=new AreaTriangle();
        a.method(10,8); //Calling instance method by object
    }
    public void method(int b,int h)
    {
        double area=b/2*h;
        System.out.println(area);
    }
}
