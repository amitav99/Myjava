public class Bin_search {
    
    public static int result;

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
        int arr[]={1, 2,3, 4, 5, 6, 8, 9, 10, 14, 16, 19, 22, 23, 25, 26 ,27 ,29 ,31 ,34 ,35, 36, 38, 39, 40, 45, 46, 48, 50, 51, 52, 57, 59, 60, 61, 63, 67, 68, 69, 71, 75, 76, 77, 79, 81, 82, 83, 86, 87, 88, 90, 92, 93, 94, 95, 96, 98, 99, 100};
        int key=52;
        int n = arr.length-1;
        int low = 0, high = n-1;
         result = bin_search(arr,key,low, high);
        if (result == -1)
        {
            System.out.println("The element is not present");
        }
        else
        {
            System.out.println("The element present"+ mid);  
        }
    }
    
}

