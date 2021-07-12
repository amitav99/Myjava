import java.util.*;
public class Area{
    public static void main(String[] args) {
    int height, base;
    float area;
    Scanner sc =new Scanner (System.in);
    System.out.println("Enter the base and3 height of the triangle : ");
    height = sc.nextInt();
    base = sc.nextInt();
    area = (base *height)/2;
    System.out.println("The area of the trinagle is : " + area);

        
    }
}