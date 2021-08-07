public class Circle {
    public int  r;
    public float getArea()
    {
    return  (22/7)*r*r; 
    }
    public int  getPerimeter()
    {
    return 2*(22/7)*r;
    }
    public static void main (String args[])
    {
    Circle ob =new Circle();
    Circle ob1 =new Circle();
    ob.r =7;
    ob1.r =14;
    System.out.println("area "+ ob.getArea());
    System.out.println("perimeter "+ ob.getPerimeter());
    System.out.println();
    System.out.println("area1 "+ ob1.getArea());
    System.out.println("perimeter1 "+ ob1.getPerimeter());

    }
}
