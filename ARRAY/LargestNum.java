import java.util.*;
public class LargestNum {
    public static int LargestNum(int num[]){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < num.length; i++) {
            if (largest<num[i]) {
                largest=num[i];
            }
            if (smallest>num[i]){
                smallest=num[i];
            }
        }
        System.out.println("The smallest array"+" "+ smallest);
        return largest;
    }
    public static void main(String[] args) {
        int num[]={2,4,8,12,47,2,4,65,75,15};
        System.out.println(LargestNum(num));
        
    }
}
