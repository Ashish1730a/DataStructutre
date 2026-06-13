package LOOPS.PracticeSet;


public class Sum_of_numbers_occuring_in_the_multiplication_table_of_8 {
    public static void main(String[] args) {
        int n=8;
        int sum = 0;
        for(int i=1;i<=10;i++){
            sum += n*i;
        }
        System.out.println(sum);
    }
}
