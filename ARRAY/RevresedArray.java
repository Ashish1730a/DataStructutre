public class RevresedArray {
    public static void Reveresed(int number[]){
     int start =0; int last= number.length-1;
        while(start<last){
        int temp = number[last];
        number[last] = number[start];
        number[start] = temp;
        start++;
        last--;
    }
}
    public static void main(String[] args) {
        int number[]={20,40,60,80,100,120,140};
        Reveresed(number);
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i]+" ");
        }
    }
}
