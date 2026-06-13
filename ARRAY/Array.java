public class Array {
    public static void main(String[] args) {
    //     int marks[] = new int[2];
    //    marks[0] = 45;
    // float  marks[] = {55.8,88,77,65,89,42,69,85};
    float  marks[] = {55.8f,88.8f,77.5f,65.9f,89.4f,42.79f,69.75f,85.845698f};
    //    System.out.println(marks[7]);



    //    Dispalying the Array(For loop)
    for(int i=0;i<marks.length;i++){
        System.out.println(marks[i]);
    }
    System.out.println("printing in decrementing way");
    for (int i = marks.length-1; i >= 0; i--) {
        System.out.println(marks[i]);
    }
    }
}
