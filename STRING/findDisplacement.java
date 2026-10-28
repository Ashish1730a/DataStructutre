public class findDisplacement {
    public static float displacement(String str){
        int x=0;
        int y=0;
        for(int i=0;i<str.length();i++){
            //North
            if(str.charAt(i)=='N'){
                y++;
            }
            //south
             else if(str.charAt(i)=='S'){
                y--;
            }
            //west
            else if(str.charAt(i)=='W'){
                x--;
            }else{
                x++;
            }
        }
        float X2=x*x;
        float Y2=y*y;
        return (float) Math.sqrt(X2 + Y2);
    }
    public static void main(String[] args) {
        String path ="NSSS";
        System.out.print(displacement(path));
    }
}
