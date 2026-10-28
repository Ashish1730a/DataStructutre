import java.util.*;
public class StringPractice {
    public static void printLettter(String str){
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i)+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        // String Ashish;
        // Ashish=sc.nextLine();
        // System.out.print(Ashish.length());

        String Name="Ashish";
        String last="Solanki";
        String Fullname= Name+" "+last;
        printLettter(Fullname);
    
    }
}
