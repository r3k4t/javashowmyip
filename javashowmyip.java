import java.net.*;
import java.io.*;


public class ShowMyIP{
 
    public static void main(String args[]) throws Exception{
    System.out.println("====================================");
    System.out.println("        Java Show My IP ")            ;
    System.out.println("====================================");
    System.out.println("Author : Rahat Khan Tusar(rkt)")      ;
    System.out.println("Github : https://github.com/r3k4t")   ;
    System.out.println("====================================");
    System.out.println("Your IP Address is :");
    URL showmyip = new URL("https://ipinfo.io/ip");
    BufferedReader in = new BufferedReader(new InputStreamReader(showmyip.openStream()));
    String ip = in.readLine();
    System.out.println(ip);
    }
}
