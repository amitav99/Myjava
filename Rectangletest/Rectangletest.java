package Rectangletest;

class Rectangleget_set {

    private int length;
    private int breadth;

    public double  area()
    {
        return length*breadth;
    }
    public double perimeter()
    {
        return 2*(length+breadth);

    }
    public boolean isSquare()
    {
        if (length==breadth)
        {
            return true;
        }
        else 
        {
            return false;
        }
    }
}
public class Rectangletest
{
public static void main (String args[])
    {
        Rectangle ob =new Rectangle ();
        ob.length=10;
        ob.breadth=15;
        System.out.println("Area "+ ob.area());
        System.out.println("Perimeter "+ ob.perimeter() );
        System.out.println("Is it a square :"+ ob.isSquare() );
    }
}

