package RECURSION;

public class SumOfFirst_n_natural_numbers {
    static int sumRec(int n){
        if(n==1){
            return 1; 
        }
        return n+ sumRec(n-1);
    }
    public static void main(String[] args) {
        int a = sumRec(3);
        System.out.println(a);
    
    }
}
