import java.util.*;
public class Protocol {
    public static void main(String args[]) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a url");
    String url= sc.nextLine();

    String proto =url.substring(0, url.indexOf(":"));
    if (proto.equals("http"))
    System.out.println("Hyper Text Transfer Protocol");
    else if (proto.equals("ftp"))
    System.out.println("File transfer Protocol");

    String ext = url.substring(url.lastIndexOf(".")+1);
    if (ext.equals("com"))
    System.out.println("commercial");
    else if (ext.equals("org"))
    System.out.println("organisation");
    else if (ext.equals("net"))
    System.out.println("network");
    


        
    }
    
}
