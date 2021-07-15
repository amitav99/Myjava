import java.util.*;

import javax.security.auth.x500.X500Principal;
public class Arithmetic_operations {
    public static void main(String args[])
    {
         Scanner sc = new Scanner (System.in);
        System.out.println("=====");
        System.out.println("Menu");
        System.out.println("ADD");
        System.out.println("SUB");
        System.out.println("MUL");
        System.out.println("DIV");

        System.out.println("Enter the operation to be carried");
        String op = sc.nextLine();
        op=op.toUpperCase();
        System.out.println("Enter the numbers");
        int x= sc.nextInt();
        int y= sc.nextInt();

        switch (op){
            case "ADD":
            System.out.println("sum is "+ (x+y));
            break;
            case "SUB":
            System.out.println("difference is "+ (x-y));
            break;
            case "MUL":
            System.out.println("product is "+ (x*y));
            break;
            case "DIV":
            System.out.println("dividend is "+ (x/y));
            break;
            default:
            System.out.println("INVALID INPUT");
            break;
            
        }


    




        
    }
    
}
