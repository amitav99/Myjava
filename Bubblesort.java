public class Bubblesort {
    public static void main (String args[])
    {
        int arr[]={3,5,6,7,8};
        int key=7;
        int n =arr.length;
        int high=n-1, low=0;
        
        while (low<=high)
        {
            int mid=(low+high)/2;
            if (mid==key)
            {
                System.out.println("found");
            }
            else if(key > mid) 
            {
                
            }
        }
    }
    
}
