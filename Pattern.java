public class Pattern {
    public static void main(String args[]) 
    {
        int i,j,count=0;
        for (i=0; i<5; i++)
        {
            for(j=0;j<5;j++)
            {
            count++;
            System.out.format("%02d ",count );
            }
            System.out.println(" ");
        }

        
    }
}