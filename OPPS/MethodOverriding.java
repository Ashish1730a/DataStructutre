public class MethodOverriding {
    public static void main(String[] args) {
        Cat puccy = new Cat();
        puccy.eat();
    }
}

class Animal{
    void eat(){
        System.out.println("Eats Anything");
    }
}

class Cat extends Animal{
    void eat(){
        System.out.println("drink milk");
    }
}
