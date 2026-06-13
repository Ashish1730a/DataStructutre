import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        System.out.println("Taking the input from the user");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number1");
        int a= sc.nextInt();
        System.out.println("Enter the number2");
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println("The sum of these number is");
        System.out.println(sum);
    }
}
