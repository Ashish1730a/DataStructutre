public class Abstraction {
    public static void main(String[] args) {
        horse sc = new horse();
        
        System.out.println(sc.color);
        sc.changeColor();
        sc.walk();

        Chicken chikki = new Chicken();
        chikki.eat();
        chikki.walk();

    }
}

abstract class Animal {
    String color;
    Animal (){
        color = "brown";
    }
    void eat() {
        System.out.println("animal eats");
    }

    abstract void walk();
}

class horse extends Animal {
    void changeColor() {
        color = "dark brown";
        System.out.println(color);
    }
    void walk() {
        System.out.println("walks on 4 legs");
    }
}

class Chicken extends Animal {

    void changeColor() {
        color = "Yellow";
    }
    void walk() {
        System.out.println("walk on 2 legs");
    }
}
