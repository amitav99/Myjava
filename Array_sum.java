import java.util.*;
public class Array_sum {
    public static void main (String args[]){
        int i,sum=0, key;
        int A[]={1,2,3,4,5};
        Scanner sc= new Scanner (System.in);
        for(i=0; i<A.length; i++)
        {
            sum=sum + A[i];
            System.out.print(A[i]+" ");
            
        }
        
    System.out.println(" ");
    System.out.println("the sum is "+sum);

    System.out.println("Enter the element to be searched");
    key=sc.nextInt();
        for(i=0; i<A.length; i++)
        {
            if (A[i]==key)
            {
            System.out.println("Found at "+ A[i]);
            System.exit(0);
            }
        }
            System.out.println("Not Found");

    }
}
    