import java.util.*;

public class Factorial 
{
    public static void main(String args[])
    {
        int i, fac=1;
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number to find factorial");
        int n = sc.nextInt();
        for (i=1;i<=n;i++)
        {
            fac=fac*i;
        }
        System.out.println(fac);

    }
}
