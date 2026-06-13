package CONSTRUCTORS;

    
    class cylinder{
        private int radius;
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
    public class PS1 {        public static void main(String[] args) {
            cylinder myCylinder = new cylinder();
            myCylinder.setHeight(5);
            int h = myCylinder.getHeight();
            System.out.println(h);
            myCylinder.setRadius(10);
            System.out.println(myCylinder.getRadius());
        }
    }
    



