public class Quicksort {
    public void sort(int arr[], int n)
    {
        
     
    }
    public void printArray(int arr[], int n)
    {
        for (int i=0; i<n; i++)
        {
            System.out.print(arr[i] +" ");
        }
    }
    
    public static void main (String args[]) 
    {
        Quicksort ob = new Quicksort();
        int arr[]= {5,1,3,4,2};
        int n=arr.length;
        ob.sort (arr);
        System.out.println("The array is : ");
        ob.printArray(arr);

    }
    
}
