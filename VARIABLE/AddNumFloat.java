import java.util.Scanner;
public class AddNumFloat {
   public static void main(String[] args) {
    System.out.println("Take the number as a input");
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number1");
    float a = sc.nextFloat();
    System.out.println("Enter the number2");
    float b= sc.nextFloat();
    float sum = a+b;
    System.out.println("print the sum of number is :");
    System.out.println(sum);

   }
    
}
