import java.util.*;

public class Armstrong {
    public static void main(String[] args) {
    int num, n, rem, sum=0 ;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number to check for armstrong : ");
    num = sc.nextInt();
    n=num;
    while (n>0)
    {
        rem=n%10;
        sum=sum+(rem*rem*rem);
        n=n/10;
    }
    if (num==sum)
    {
        System.out.println("Armstrong number");
    }
    else{
        System.out.println("Not a armstrong number");
    }
}
}
