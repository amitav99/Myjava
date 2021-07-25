public class Linear {
    static public int linear_search(int arr[], int key)
    {
        for (int i=0; i<arr.length;i++)
        {
            if (arr[i]==key)
            {
                return i+1;
            }
        }
        return -1;
    }

    public static void main (String args[])
    {
        int ar[]={3,4,7,8,6};
        int key = 2;
        System.out.println(key +" found at index "+ linear_search(ar, key));
    }
    
}
