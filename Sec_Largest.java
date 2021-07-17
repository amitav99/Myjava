public class Sec_Largest
{
    public static void main (String args[])
    {
        int i, max1, max2;
        int arr[] = {9, 5, 13, 5, 7, 45};
        max1= max2 = arr[0];
        for (i=0; i<arr.length; i++)
        {
            if (arr[i]>max1)
            {
                max2=max1;
                max1=arr[i];
            }
            else if (arr[i]>max2)
            {
                max2=arr[i];
            }
        }
        System.out.println(max2);
        
    }
}