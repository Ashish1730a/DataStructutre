package METHODS;

public class VariableArguments{
    // static int sum(int a, int b){
    //     return a+b;
    // }
    // static int sum(int a, int b, int c){
    //     return a+b+c;
    // }
    static int sum(int x, int ...arr){
    //   Available as int [] arr;
        int result=x;
        for (int a : arr){
        result += a;
        }
    return result;
    }
    public static void main(String[] args) {
        System.out.println("Welcome to Varargs Tutorial");
        System.out.println("The sum of 4 and 54 is " + sum(4,54));
        System.out.println("The sum of 4 ,8 and 54 is " + sum(4,54,8));
    }
}
