import java.util.Scanner;
public class SumThreeNum {
    public static void main(String[] args) {
        System.out.println("Taking input from the users");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first num");
       int num1 = sc.nextInt();
       System.out.println("Enter the Second num");
       int num2 = sc.nextInt();
       System.out.println("Enter the third num");
       int num3 = sc.nextInt();
       int sum = (num1+num2+num3);
       System.out.println("Sum of three number is :");
       System.out.println(sum);

    }
}
