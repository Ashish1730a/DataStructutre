import java.util.Scanner;
public class PS2 {
    public static void main(String[] args) {
        byte m1, m2, m3,m4,m5;
        Scanner sc = new Scanner(System.in);


     System.out.println("Enter your marks in Phyics");
     m1 = sc.nextByte();
     System.out.println("Enter your marks in Chemistry");
     m2 = sc.nextByte();
     System.out.println("Enter your marks in Math");
     m3 = sc.nextByte();
     System.out.println("Enter your marks in Hindi");
     m4 = sc.nextByte();
        float avg = (m1+m2+m3)/3.0f;
     if (avg>=40 && m1>=33 && m2>=33 && m3>=33 && m4>=33 && m5>=33) {
        System.out.println("Your Overall percentage is :"+ avg);
        System.out.println("Conguratulations, You have been promoted ");
     }
     else{
        System.out.println("Sorry, You have not been promoted ! Please try again");
     }
    }
}
