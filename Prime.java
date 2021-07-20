public class Prime{
    static boolean isprime(int n){
        if (n<=1)
            return false;
        for (int i=2; i<=n/2;i++)
            if (n%i==0)
            return false;
        return true;
            
        }
        
    public static void main(String args[]) 
    {
    if (isprime(11))
    {
        System.out.println("prime");
    }
    else
    {
        System.out.println("not prime");
    }


    }
        
}

