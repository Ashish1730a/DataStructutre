

class Base{
    int x;
    public int getX(){
        return x;

    }
    public void setX(int x){
        System.out.println("I am in Base class and set x");
        this.x = x;
    }
}


class Derived2 extends Base{
    int y;
    public int getY(){
        return y;
    }
    public void sety(int y){
        System.out.println("I am in derived class and set y");
        this.y = y;
    }
}
public class Ashish {
    public static void main(String[] args) {
        Base a = new Base();
        a.setX(45);
        System.out.println(a.getX());

        Derived2 d = new Derived2();
        d.sety(98);
        System.out.println(d.getY());
    }
}
