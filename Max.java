public class Max {
    public static void main (String args[])
    {
        //Finding the max element of the array
        int arr[]={2,3,4,5,1};
        int max,i;
        max=arr[0];
        for (i=0; i<arr.length; i++)
        {
            if (arr[i]>max)
            max=arr[i];
        }
        System.out.println("The max is "+max);

    }

    
}
