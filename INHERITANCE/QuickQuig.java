package INHERITANCE;
class Animal{
    int x;
    public int getX(){
        return x;
    }
    public void setX(int bark){
        System.out.println("Animal is loyal more then human");
        this.x = bark;
    }
}

class Dog extends Animal{
    int y;
    public int getY(){
        return y;
    }

    public void setY(int y){
        System.out.println("Where is your black dog");
        this.y = y;
    }
}
public class QuickQuig {
    public static void main(String[] args) {
        Animal d = new Animal();
        d.setX(8);
        System.out.println(d.getX());

        Dog a = new Dog();
        a.setY(18);
        System.out.println(a.getY());

        
    }
}
