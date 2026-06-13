 class Overriding {
    void get()
    {
        System.out.println("Base class");

    }
}
class Override extends Overriding{
    void get()
    {
        System.out.println("Child class");
    }
    void display(){
        get();
    }

}
public class Test{

    public static void main(String[] args) {
        Override ov = new Override();
        ov.display();
    }
}
