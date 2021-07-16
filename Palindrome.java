import java.util.Scanner;
public class Palindrome{
    public static void main(String[] args) {
    int num, n, rem, rev=0;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number to check for palindrome ");
    num=sc.nextInt();
    n=num;
    while(n>0) 
    {
        rem = n%10;
        rev = rev*10+rem;
        n = n/10;
    }
    System.out.println("when reversed the number is " + rev);
    if (rev==num)
    {
        System.out.println("The number is palindrome");
    }
    else{
        System.out.println("The number you entered is not a palindrome number ");
    }
    }
}

    