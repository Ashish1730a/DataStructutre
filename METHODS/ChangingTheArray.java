package METHODS;

public class ChangingTheArray {
    static void change(int [] arr){
        arr[0] = 98;
    }
    public static void main(String[] args) {
        int  marks[] = {52,74,65,86,77};
        change(marks);
        System.out.println("The value of x after running change is " + marks[0]);
    }
}
