

public class OPPS {
    public static void main(String[] args) {
        Pan p1 = new Pan(); //Create a pan object called p1
        p1.setColor("Blue");
        System.out.println(p1.color);
        p1.setTip(4);
        System.out.println(p1.tip);
    }
}


class Pan {
    String color;
    int tip;

    void setColor(String newColor){
        color = newColor;
    }

    void setTip(int newTip){
        tip = newTip;
    }
}
