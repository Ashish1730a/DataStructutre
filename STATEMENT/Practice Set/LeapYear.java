import java.util.*;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the year");
        int year = sc.nextInt();
        
        if(year==0){
            System.out.println("Yes! It's leap year");
        }
        else{
            System.out.println("It's not a leap year");
        }
         

    }
}
