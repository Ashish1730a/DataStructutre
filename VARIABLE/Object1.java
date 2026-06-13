 class Mahesh{
    int x;             //Non static member varible
    int y;              //Non static member varible
    void fun1(){        //Non static member Function
        System.out.println("fun1");

    }
    void fun2(){
      System.out.println("fun2");  
    }
}
class Object1 {
    public static void main(String[] args) {
    m1 = new Mahesh();
     m1.x=5;
      System.out.println("Hello");
      System.out.println(m1.y);
    }
}
