public class BUTTERFLY {
    public static void BUTTERFLY(int n){
        //for outer loop
        //1st half code
        for(int i=1;i<=n;i++){
            //for inner lopp
            //star *
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            //spaces = 2*(n-i)
            for(int j=1;j<=2*(n-i);j++){
                System.out.print("  ");
            }
            //for star
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        //2nd half code
        for(int i=n;i>=1;i--){
            //for inner lopp
            //star *
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            //spaces = 2*(n-i)
            for(int j=1;j<=2*(n-i);j++){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        BUTTERFLY(9);
    }
}
