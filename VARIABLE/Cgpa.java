import java.util.Scanner;
public class Cgpa {
    public static void main(String[] args) {
        System.out.println("Taking input from the user");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of first subject");
        int subject1 = sc.nextInt();
        System.out.println("Enter the number of second subject");
        int subject2 = sc.nextInt();
        System.out.println("Enter the number of third subject");
        int subject3 = sc.nextInt();
        float Cgpa = (subject1+subject2+subject3)/30;
        System.out.println("The CGPA of three subject");
        System.out.println(Cgpa);

    }
}
