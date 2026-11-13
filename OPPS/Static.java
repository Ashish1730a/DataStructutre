public class Static {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.schoolName = "NR";

        Student s2 = new Student();
        
        Student s3 = new Student();
        s3.schoolName = "Ashish";
        System.out.println(s1.schoolName);
        
    }
}

class Student {
    String name;
    int roll;

    static String schoolName;

    void setName(String name){
        this.name = name;
    }

    String getName(){
        return this.name;
    }
}