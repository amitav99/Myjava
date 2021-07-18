public class Array_insertion {
    public static void main(String args[])
    {
        int arr[] =new int [10];
        arr[0]=1;arr[1]=2;arr[2]=3;arr[3]=4;arr[4]=5;arr[5]=6;arr[6]=7;
        int n =7;

        //printing the actual array

        for (int i=0; i<n;i++)
        {
        System.out.print(arr[i]+ " ");
        }
        System.out.println(" ");
        //initializing a value and declaring the index.
        int x=15;
        int index=3;
        //right shifting the elements of the array the vacate space in the index(3) position
        for (int i=n;i>index;i--)
        {
        arr[i]=arr[i-1];
        }
        arr[index]=x;
        //printing the new array
        for (int i=0; i<=n;i++)
        {
            System.out.print(arr[i] +" ");
        }
    }

    
}