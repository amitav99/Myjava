public class Selectionsort{

    //the selection sorting technique

    void sort(int arr[])
    {
        int n = arr.length;
        //for unsorted subarray
        for(int i=0; i<n-1; i++)
        {
            int min=i;
            for (int j=i+1; j<n; j++)
            {
                if ( arr[j] < arr[min] )
                {
                 min = j;
                }
            }
 
        //swaping the value of the  least term
        int temp=arr[min];
        arr[min]=arr[i];
        arr[i]=temp;
        }
    }

    //printing the array

    void printArray(int arr[])
    {
        int n=arr.length;
        for (int i=0; i<n; i++)
        {
            System.out.print(arr[i]+" ");
        }
       
    }

     //the main function 

    public static void main (String args[])
    {
    Selectionsort ob =new Selectionsort();
    int arr[]={9,2, 8, 5,7};
    ob.sort(arr);
    System.out.println("The sorted array is :");
    ob.printArray(arr);
    }
}