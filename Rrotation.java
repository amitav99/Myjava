public class Rrotation {
    public static void main (String args[])
    {
        int i, first;
        
        int arr[]={1,2,3,4,5};

        for (int x:arr)
        {
            System.out.print( x +" ");
        }
        System.out.println("");

        first= arr[arr.length-1];

        for(i=arr.length-1; i>0; i--)
        {
            arr[i]=arr[i-1];
        }
        arr[0]=first;

        for (int x:arr)
        {
            System.out.print( x +" ");
        }

    }
}