

public class create_an_array_5floats_and_calculate_their_sum {
    public static void main(String[] args) {
        float [] marks = {44.7f,55.7f,66.9f,85.4f};
        float sum = 0;
        for (float f : marks) {
            sum = sum+f;
        }
        System.out.println("The value of sum is "+ sum);
    }
}
