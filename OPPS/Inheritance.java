public class Inheritance {
    public static void main(String[] args) {
        fish s1 = new fish();
        s1.eat();
    }
}

class Animal{
    String color;

    void eat(){
        System.out.println("eats");
    }

    void breath(){
        System.out.println("breaths");
    }
}

class fish extends Animal{
    int fings;

    void swim(){
        System.out.println("fish is swiming");
    }
}