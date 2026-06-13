

public class Average_marks_from_an_array_containing_marks_of_AllStudent_in_physics {
    public static void main(String[] args) {
        int [] marks = {75,88,99,66,85};
        int sum = 0;
        for (int i : marks) {
            sum = sum + i;

        }
        System.out.println("The value of avg marks " + sum /marks.length);
    }
}
