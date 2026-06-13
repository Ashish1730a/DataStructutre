import java.util.Scanner;
public class MultiplyTwoNum {
    public static void main(String[] args) {
        System.out.println("Taking input from the user");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num1");
        int a = sc.nextInt();
        System.out.println("Enter the num2");
        int b = sc.nextInt();
        int multi = a*b;
        System.out.println("The multiply of the number is :");
        System.out.println(multi);
    }
}
