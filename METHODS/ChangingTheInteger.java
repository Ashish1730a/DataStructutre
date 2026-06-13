package METHODS;

public class ChangingTheInteger {
    static void change(int a){
        a =98;
    }
    public static void main(String[] args) {
        int  marks[] = {52,74,65,86,77};
        // Case 1: Changing the Integer
        int x =45;
        change(x);
        System.out.println("The value of x after running change is " + x);
    }
}


