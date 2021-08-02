public class Bubblesort
{
    void bubble_sort(int arr[])
    {
        int n =arr.length;
        for (int i=0; i<n-1;i++)
        {
            for (int j=0; j<n-i-1;j++)
            {
                if(arr[j] > arr[j+1])
                {
                    //swap arr[j+1] and arr[j]
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    void print_array(int arr[])
    {
    int n=arr.length;
    for (int i=0; i<n; i++)
    {
        System.out.print(arr[i]+" ");
    }
}      
    public static void main (String args[])
    {
        Bubblesort ob = new Bubblesort();
        int arr[]={8,1,6,7,5};
        ob.bubble_sort(arr);
        System.out.println("The sorted array : ");
        ob.print_array(arr);
    }
}

