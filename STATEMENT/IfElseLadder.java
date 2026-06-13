import java.util.*;
public class IfElseLadder {
    public static void main(String[] args) {
        int age;
        System.out.println("Enter the your age");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();
        if (age>56) {
            System.out.println("You are experienced");
            
        }
        else if (age>46) {
            System.out.println("You are semi-experienced");
        }
        else if (age>36) {
            System.out.println("You are semi-experienced");
        }
        else{
            System.out.println("you are not semi-experienced");
        }
    }
}
