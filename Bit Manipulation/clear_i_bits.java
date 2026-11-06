

public class clear_i_bits {
    public static int clear_I_Bits(int n, int i){
        int bitMask = (-1)<<i;
        return n & bitMask;
    }
    public static void main(String[] args) {
        System.out.println(clear_I_Bits(15, 2));
    }
}
