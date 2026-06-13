package RECURSION;
class Square{
    int w; 
    int l;
    public int area(){
        return w*l;
    }
    public int perimeter(){
        return 2*(l+w);
    }
}
public class RetangleRepeat {
    public static void main(String[] args) {
        Square sq = new Square();
        sq.w = 5;
        sq.l = 8;
        System.out.println(sq.area());
        System.out.println(sq.perimeter());
    }
}
