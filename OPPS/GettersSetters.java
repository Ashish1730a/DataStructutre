
public class GettersSetters {
    public static void main(String[] args) {
        Pan p1 = new Pan(); //Create a pan object called p1
        p1.setColor("Blue");
        System.out.println(p1.getColor());
        p1.setTip(4);
        System.out.println(p1.getTip());


    }
}


class Pan {
    private String color;
    private int tip;

    String getColor(){
        return this.color;
    }

    void setColor(String newColor){
        color = newColor;
    }

    int getTip(){
        return this.tip;
    }


    void setTip(int newTip){
        tip = newTip;
    }
}
