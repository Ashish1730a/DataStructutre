public class HollowRect {
    public static void HollwRect(int n){
        //for outer loop
        for(int i=1;i<=n;i++){
            //for space
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            //for stars
            for(int j=1;j<=n;j++){
                if(i==1||i==n||j==1||j==n){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        HollwRect(5);
    }
}
