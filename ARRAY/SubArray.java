public class SubArray {
    public static void subarray(int number[]){
        for (int i = 0; i < number.length; i++) {
            int start = number[i];
            for (int j = i+1; j < number.length; j++) {
                int end = number[j];
                for (int j2 = start; j2 <= end; j2++) { //print the subarray
                    System.out.print(number[j2]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int number[]={2,4,6,8,10};
        subarray(number);
    }
}
