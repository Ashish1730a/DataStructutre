

    
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
        public double surfaceArea(){
            return 2*3.14* radius * radius + 2*3.14*radius*height;
        }
    
    }
    public class Ashish1 { 
            public static void main(String[] args) {
            cylinder myCylinder = new cylinder();
            myCylinder.setHeight(12);
            int h = myCylinder.getHeight();
            System.out.println(h);
            myCylinder.setRadius(9);
            System.out.println(myCylinder.getRadius());
            System.out.println(myCylinder.surfaceArea());
        }
    }
    



