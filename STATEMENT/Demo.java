public class Demo {
    int a= 10;
    static int b= 20;
    public static void main(String[] args) {
        Demo x =new Demo();
        x.a =100;
        x.b =200;
        Demo y = new Demo();
        System.out.println(y.a);
        System.out.println(y.b);

    }
}
