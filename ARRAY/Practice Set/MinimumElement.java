public class MinimumElement {
    public static void main(String[] args) {
        int ash[] = {20,4055,55,33,77,5569,856,1458,2};
        int max = Integer.MIN_VALUE;
        for (int i : ash) {
            if (i>max){ 
            max = i;
            }
        }
        System.out.println(max);
    }
}
