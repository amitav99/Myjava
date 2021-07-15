import java.util.*;

public class Digits
{
    public static void main(String args[])
    {
        int i=1, rem, n;
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number ");
        n=sc.nextInt();
        while(n>0)
        {
            rem = n%10;
            n=n/10;
        
            System.out.println( rem );

        }
    
    }
}

