

package CONSTRUCTORS;

    
class cylinder{
    private int radius;
    public cylinder(int radius, int height)j) {
        this.radius = radius;
        this.height = height;
    }
    public cylinder(int radius, int height){
        this.radius = radius;
        this.height = height;
    }
    public int getRadius(){
        return radius;
    }
    public void setRadius(int radius){
        this.radius = radius;
    }
    private int height;
    public int getHeight(){
        return height;
    }
    public void setHeight(int height){
        this.height = height;
    }

}
public class PS3 {        public static void main(String[] args) {
        cylinder myCylinder = new cylinder(9,12);
        //myCylinder.setHeight(5);
        int h = myCylinder.getHeight();
        System.out.println(h);
        //myCylinder.setRadius(10);
        System.out.println(myCylinder.getRadius());
    }
}

