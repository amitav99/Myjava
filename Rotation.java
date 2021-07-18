public class Rotation {
    public static void main (String args[])
    {
        int i ;
        int arr[]={1,2,3,4,5}; 
        int temp =arr[0];

        for (int x : arr)
        System.out.print(x +" ");
        
        for (i=1; i<arr.length; i++)
        {
             arr[i-1]=arr[i];
        }
        arr[arr.length-1]=temp;

        System.out.println(" ");
        System.out.println("Array after rotation is : ");

        for (int x : arr)
        System.out.print(x+" ");
    }
}
