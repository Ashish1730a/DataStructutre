package LOOPS.PracticeSet;


public class Find_Factorial {
    public static void main(String[] args) {
        int n=5;
       // what is factorial n=n*n-1*n-2....1
       //5!=5*4*3*2*1
       int i =1;
       int factorial=1;
       while (i<=n) {
        factorial*=i;
        i++;
       }
       System.out.println(factorial);
    }
}
