public class Insertionsort {
    public void sort(int arr[])
    {
        int n = arr.length;
        for (int i=1; i<n; i++)
        {
            int key = arr[i];
            int j = arr[i-1];
            while(i>0 && 
        }

    }
    public void printArray(int arr[])
    {
        int n = arr.length ;
        for (int i=0; i<n; i++)
        {
            System.out.print (arr[i]+" ");
        }


    }
    public static void main (String args[])
    {
        Insertionsort ob= new Insertionsort();
        int arr = {9,5,23,8};
        ob.sort(arr);
        System.out.println ("The sorted array(Insertion sort) is : ");
        ob.printArray(arr);
    }
    
}
