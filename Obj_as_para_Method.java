public class Obj_as_para_Method
{
    static void change(int a[], int index, int value)
    {
        a[index] = value;
        
    }
    public static void main (String args[])
    {
        int arr[]={2,3,4,5,6};
        change (arr, 2, 20);

        for (int x : arr)
        {
            System.out.print(x+", ");
        }

    }
}