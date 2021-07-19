public class Method_max
{
int max(int x, int y)
    {
        if (x>y)
            return x;
        else
            return y;
    }
    
public static void main (String args[]) {
    
    int a=5, b=10, c;

    Method_max ob= new Method_max();
    c=ob.max(a,b);

    System.out.println(c);
    
}
}