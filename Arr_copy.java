public class Arr_copy {
    public static void main(String args[])
    {
        int arr[]={1,2,3,4,5};
        int b[]=new int  [10];
        //substituting the value of arr in b
        for (int i=0; i<arr.length; i++)
        {
            b[i]=arr[i];
        }
        //printing the array b
        for (int i=0; i<arr.length;i++)
        {
        System.out.print(b[i]+" ");
        }
        //reversing the array b
        System.out.println(" ");
        for (int i=arr.length-1;i>=0;i--)
        {
            System.out.print(b[i]+" ");
        }
    }
}
