import java.util.*;
public class Web_domain {
    public static void main (String args[])
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the website");
        String domain = sc.nextLine();
        String ext = domain.substring(domain.lastIndexOf(".")+1);
        System.out.println(ext);
        
        switch(ext)
        {
            case "com":
            System.out.println("Commercial website");
            break;
            case "org":
            System.out.println("Organisational website");
            break;
            case "gov":
            System.out.println("Government website");
            break;
            case "net":
            System.out.println("Network website");
            break;

        }





    }
    
}
