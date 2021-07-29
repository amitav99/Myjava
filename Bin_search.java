public class Bin_search {


    public static int bin_search(int arr[], int key, int low, int high)
    {
        while(low<high)
        {
            int mid = (low+high)/2;
            if (key==arr[mid])
            {
                return mid;
            }
            else if (key>arr[mid])
            {
                low=mid+1;
            }
            else 
            {
                high=mid-1;
            }
    
        }
        return -1;
    }
          
    
    public static void main (String args[])
    {
        int arr[]={1,2,4,5,6,8,9};
        int key=99;
        int n = arr.length-1;
        int low = 0, high = n-1;
       int bin_search = bin_search(arr,key,low, high);
        if (bin_search == -1)
        {
            System.out.println("The element is not present");
        }
        else
        {
            System.out.println("The element present");  
        }
    }
    
}

