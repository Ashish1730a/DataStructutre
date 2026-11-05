
public class Set_ith_bit {
    public static int Set_ithBit(int n, int i){
        int bitMask=1<<i;
        return n | bitMask;
    }
    public static void main(String[] args) {
        System.out.println(Set_ithBit(10, 2));
    }    
}
