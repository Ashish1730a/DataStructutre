package INHERITANCE;
class Base{
    int x;
    
    public int getX(){
        return x;
    }

    public void setX(int x){
        System.out.println("I am in base and setting X now");
        this.x = x;
    }


    void printMe(){
       System.out.println("I ama constructor"); 
    }
}

class Derived extends Base{
   int y;
   public int getY(){
    return y;
}

public void setY(int y){
    System.out.println("I am in derived and setting Y now");
    this.y = y;
}

}
public class Inheritance {
    public static void main(String[] args) {
        // Creating an object of derived class 
        Derived d = new Derived();
        d.setY(4);
        System.out.println(d.getY());

        // Creating an object of Base class 
        Base b = new Base();
        b.setX(45);
        System.out.println(b.getX());
    }
}
