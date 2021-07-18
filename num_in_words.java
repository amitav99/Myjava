import java.util.Scanner;
public class num_in_words {
    public static void main(String[] args) {
    int n,num,rem;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter any number to print in words ");
    num=sc.nextInt();
    String str=""; 
    n = num;
    while (n>0)
    {
        rem=n%10;
        n=n/10;
        str=str+rem;
    }
    System.out.println(str);
    char c;
    for (int i=str.length()-1;i>=0;i--)
    {
        c=str.charAt(i);
        switch(c)
        {
        case '0':
        
         System.err.print("zero ");
         break;
        
        case '1':
        System.err.print("One ");
        break;
        case '2':
        System.err.print("Two ");
        break;
        case '3':
        System.err.print("Three ");
        break;
        case '4':
        System.err.print("Four ");
        break;
        case '5':
        System.err.print("Five ");
        break;
        case '6':
        System.err.print("Six ");
        break;
        case '7':
        System.err.print("Seven ");
        break;
        case '8':
        System.err.print("Eight ");
        break;
        case '9':
        System.err.print("Nine ");
        break;
    }
}
}
}

