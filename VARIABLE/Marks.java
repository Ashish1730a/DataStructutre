import java.util.Scanner;
public class Marks {
    public static void main(String[] args) {
        System.out.println("Taking input from the input from user");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of english");
        int english = sc.nextInt();
        System.out.println("Enter the number of phyics");
        int phyics = sc.nextInt();
        System.out.println("Enter the number of math");
        int math = sc.nextInt();
        System.out.println("Enter the number of chemistry");
        int chemistry = sc.nextInt();
        System.out.println("Enter the number of hindi");
        int hindi = sc.nextInt();
        int sum = (english+hindi+math+chemistry+phyics);
        float percentage = (sum*100/500);
        System.out.println(percentage);

    }
}
