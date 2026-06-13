package LOOPS;

public class While {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);
        System.out.println(3);
        System.out.println("For using loop");

        int i=1;
        while(i<=3){
            System.out.println(i);
            i++;
        }
        System.out.println("Finish Running while loop");
        while (true) {
            System.out.println("I am infinite while loop!");
        }
    }
}
