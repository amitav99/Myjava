public class Deletion {
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

        //left shifting the elements of the array do delete/overwrite the position in the array

        for (int i=1;i<n;i++)
        {
        arr[i]=arr[i+1];
        }
        
        //printing the new array

        for (int i=0; i<=n-2;i++)
        {
            System.out.print(arr[i] +" ");
        }
    }

    
}
