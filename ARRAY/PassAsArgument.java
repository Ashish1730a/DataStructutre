public class PassAsArgument {
    public static void update(int marks[]){
        for(int i=0;i<marks.length;i++){
            marks[i]=marks[i]+1;
        }
    }
    public static void main(String[] args) {
        int marks[]={97,98,99,100,105};
        update(marks);

        //printing array
        for(int i=0;i<marks.length-1;i++){
            System.out.print(marks[i]+" ");
        }
        System.out.println();
    }
}
