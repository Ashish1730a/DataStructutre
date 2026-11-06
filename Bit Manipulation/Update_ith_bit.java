
public class Update_ith_bit {
    public static int Set_ithBit(int n, int i){
        int bitMask=1<<i;
        return n | bitMask;
    }

    public static int clear_ithBit(int n, int i){
        int bitMask = ~(1<<i);
        return n & bitMask;
    }

    public static int update_ithBit(int n, int i, int newBit){
        if(newBit == 0){
            return clear_ithBit(n, i);
        }else{
            return Set_ithBit(n, i);
        }
    }
    public static void main(String[] args) {
        System.out.println(update_ithBit(10, 2, 1));
    }
}
