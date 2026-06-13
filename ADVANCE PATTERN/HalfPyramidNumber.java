public class HalfPyramidNumber {
    public static void HalfPyramidNumber(int n){
        //for outer loop
        for(int i=1;i<=n;i++){
            //for inner loop
            for(int j=1;j<=n-i+1;j++){
                System.out.print(" "+ j);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        HalfPyramidNumber(15);
    }
}
