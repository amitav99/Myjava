import java.util.*;

public class Sumof_n
{
    public static void main(String args[])
    {
        int i, n, sum=0;
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number to find the sum");
        n=sc.nextInt();
        for (i=0;i<n;i++)
        sum=sum+i;
        System.out.println(sum);


    }
}