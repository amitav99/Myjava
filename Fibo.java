import java.util.*;
public class Fibo
{
    public static void main (String args[])
    {
        int a=0, b=1, i, n, temp,c=0;
        Scanner sc =new Scanner(System.in);
        System.out.println("How many terms");
        n=sc.nextInt();
        System.out.print(a +" "+b+" " );
        for (i=0; i<n-2; i++)
        {
            c =a+b;
            a=b;
            b=c;
            System.out.print ( c +" ");
        }
        

    }
}
