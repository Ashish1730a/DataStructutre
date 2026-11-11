public class MultiLevelInheritance {
    public static void main(String[] args) {
        Dog s1 = new Dog();
        s1.color = "Red";
        s1.legs = 4;
        s1.eat();
        System.out.println(s1.legs);
        System.out.println(s1.color);
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

class Mammal extends Animal{
    int legs;
}

class Dog extends Mammal{
    String breed;
}