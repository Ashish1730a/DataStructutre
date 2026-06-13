

public class AllPrimeNumerInRange {
    public static void isPrime(int n){
        for(int i=0;i<=n;i++){
            if (n%i==0) {
                System.out.println("not prime");
            }
            else{
                System.out.println("prime");
            }
    public static void primeInRange(int n){
        for(int i=2;i<=n;i++){
            if(isPrime(i))
            System.out.println(i+" ");
    
        }
    }
    System.out.println();
    }
    public static void main(String[] args) {
     primeInRange(20);   
    }
}
