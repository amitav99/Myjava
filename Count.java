import java.util.*;

public class Count
{
    public static void main(String args[])
    {
        int c=0, n;
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number to count the number  of digits");
        n=sc.nextInt();
        while(n>0)
        {
           // rem = n%10;
            n=n/10;
            c++;
         }
         System.out.println(c );
    
    }
}
