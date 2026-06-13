
import java.util.Scanner;
public class PS4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String website = sc.next();
        if(website.endsWith("org")){
            System.out.println("This is an Organizational Website");
        }
        else if(website.endsWith(".com")){
            System.out.println("This is a Commercial Website");
        }
        else if(website.endsWith(".in")){
            System.out.println("This is a Indian Website");
        }
    }
}
