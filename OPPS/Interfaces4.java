public class Interfaces4 {
    public static void main(String[] args) {
        camel c = new camel();
        c.moves(); 
    }   
}

interface ChessPlayer{
    void moves();
}

class Queen implements ChessPlayer{
    public void moves(){
        System.out.println("Queen move right");
    }
}

class hathi implements  ChessPlayer{
    public void moves(){
        System.out.println("hath move left");
    }
}

class ghoda implements ChessPlayer{
    public void moves(){
        System.out.println("ghoda move Up");
    }
}

class camel implements ChessPlayer{
    public void moves(){
        System.out.println("camel move down");
    }
}
