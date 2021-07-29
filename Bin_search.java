public class Bin_search {
    public static void main (String args[])
    {
        int arr[]={1,2,4,5,6,8,9};
        int key=1;
        int n = arr.length-1;
        int low = 0, high = n-1;
        
        while(low<high)
        {
            int mid = (low+high)/2;
            if (key==arr[mid])
            {
                System.out.println("found");
                break;
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
    }
    
}
