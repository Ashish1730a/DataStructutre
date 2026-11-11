

public class constructor {
    public static void main(String[] args) {
        student s1 = new student("Ashish");
        System.out.println(s1.Student);
    }
}

class student{
    String Student;
    int roll;

    student(String name){
        this.Student = name;
    }
}
