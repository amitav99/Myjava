public class Insertionsort {
    public void sort(int arr[])
    {
        int n = arr.length;
        for (int i=1; i<n; i++)
        {
            int j=i-1;
            int key=arr[i];
            while (j>-1 && arr[j]>key )
            {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }

    }
    public void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }

    }
    public static void main (String args[])
    {
        Insertionsort ob = new Insertionsort();
        int arr[]={4,12,1,3};
        ob.sort(arr);
        System.out.println("The sorted array is : ");
        ob.printArray(arr);
    }
}
