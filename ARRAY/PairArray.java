public class PairArray {
    public static void Pair(int number[]){
        int tp=0;
        for(int i=0;i<number.length;i++){
            int curr= number[i];
            for(int j=i+1;j<number.length;j++){
                System.out.print("("+ curr +"," +number[j]  +")");
                tp++;
            }
            System.out.println();
        }
        System.out.println("Total number of pairs "+tp);
    }    
    public static void main(String[] args) {
        int number[]={20,40,60,80,200,25};
        Pair(number);
    }    
}
