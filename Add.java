import java.util.Scanner;

import java.util.Scanner;
public class Add {
    public static void main(String[] args) {
    int a,b,c, d, m;
    Scanner sc = new Scanner(System.in); // for taking user input
    System.out.println("Enter any two numbers to add : "); // the additon of two number
    a=sc.nextInt();
    b=sc.nextInt();
    c=a+b;//adding
    d =a-b;
    m= a*b;
    System.out.println("The sum is "+c);//printing sum
    System.out.println("The difference is "+ d);
    System.out.println("The product is "+m);

    }
    
}
