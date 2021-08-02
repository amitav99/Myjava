public class Bubblesort
{
    int  binarysearch(int arr[], int key, int low, int high)
    {
     while (low<=high)
        {
            int mid=(low+high)/2;
            if (key==arr[mid])
            {
                return mid;
            }
            else if (key<arr[mid])
            {
                high=mid-1;
            }
            else
            {
                low= mid+1;
            }
        }
        return -1;
    }
    public static void main (String args[])
    {
        Bubblesort ob = new Bubblesort();
        int arr[]={3,5,6,7,8};
        int key=7;
        int n =arr.length;
        int low=0;
        int high=n-1;
        int result =ob.binarysearch(arr, key, low, high);
        int add=result+1;
        if (result==-1)
        {
            System.out.println("not found");
        }
        else
        {
            
            System.out.println("found at "+ add);
        }
    }
}
