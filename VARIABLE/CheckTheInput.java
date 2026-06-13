import java.util.Scanner;
public class CheckTheInput {
    public static void main(String[] args) {
        System.out.println("Taking the input from the user");
        Scanner sc= new Scanner(System.in);
        boolean c = sc.hasNextInt();
        System.out.println(c);
    }

    
}
