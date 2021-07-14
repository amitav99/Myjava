import java.util.*;
class Radix {
    public static void main (String args[])

    {
    String num;
Scanner sc = new Scanner(System.in);
System.out.println("enter a number : ");
num=sc.nextLine();

if (num.matches("[01]+"))
{
    System.out.println("Binary Radix=2");
}
 else if (num.matches("[0-7]+"))
    {
    System.out.println("Octal Radix=8");
}
else if (num.matches("[0-9]+"))
    {
    System.out.println("Decimal Radix=10");
}
else if (num.matches("[0-9A-F]+"))
    {
    System.out.println("Hexa-Decimal Radix=16");
}
else {
    System.out.println("This is not a number");
}
}
}