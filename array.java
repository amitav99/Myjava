import java.util.*;
public class array {
    public static void main (String args[]){
        int i,j;
        int A[]=new int[5];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the five elements of the array : ");
        for (i=0;i<A.length;i++)
        {
        A[i]=sc.nextInt();
        }
        System.out.println("The five elements of the array  are : ");
        for (i=0;i<A.length;i++)
        System.out.print(A[i]+" ");

    }
    
}