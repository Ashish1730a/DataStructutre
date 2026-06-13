public class ReverseArray {
    public static void main(String[] args) {
       int  Array [] = {20,40,50,60,70,80,90};
       for (int i = 0; i < Array.length; i++) {
        System.out.print(Array[i]+" ");
       }
       System.out.println("Printing an Array in Reverse order");
       for (int i = Array.length-1; i >= 0; i--) {
        System.out.print(Array[i]+" ");
       }
    }
}
