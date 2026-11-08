public class swapNumbers {
    public static void SwapTwoNumber(int a, int b){
        System.out.println("The value of  A " + a);
        System.out.println("The value of B " + b);

        a=a^b;
        b=a^b;
        a=a^b;
        

        System.out.println("The value of  A " + a);
        System.out.println("The value of B " + b);
    }
    public static void main(String[] args) {
        SwapTwoNumber(12, 53);
    }
}
