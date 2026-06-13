package METHODS;

public class MethodOverloading {
    static void Ashish(){
        System.out.println("Good morning bro!");
    }
    static void Ashish(int a){
        System.out.println(" Good morning "+ a + " bro!");
    }
    static void Ashish(int a, int b){
        System.out.println(" Good morning "+ a + " bro!");
        System.out.println(" Good morning "+ b + " bro!");
    }
    public static void main(String[] args) {
        Ashish();
        Ashish(400);
        Ashish(400,500);
    }
}
