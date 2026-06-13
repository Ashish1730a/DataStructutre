import java.util.Scanner;
public class ConvertKilometerMiles {
    public static void main(String[] args) {
        System.out.println("Convert kilometer into miles");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of kilometer you want change into miles");
        double kilometer = sc.nextDouble();
        double miles = (kilometer * 0.62137119);
        System.out.println("Print the miles");
        System.out.println(miles);

    }
}
