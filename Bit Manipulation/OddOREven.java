
public class OddOREven {
    public static void oddOreven(int a){
        int bitmask = 1;
        if((a & bitmask) == 1){
            System.out.println("Number is ODD");
        } else {
            System.out.println("Number is Even");
        }
    }
    public static void main(String[] args) {
        int a=4;
        oddOreven(a);
    }
}
