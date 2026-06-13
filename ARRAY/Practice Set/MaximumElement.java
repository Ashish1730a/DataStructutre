public class MaximumElement {
    public static void main(String[] args) {
        int Array[] = {20,225,315,718,44,99,66};
        int max = 0;
        for (int a : Array) {
            if (a>max) {
                max=a;
            }
        }
        System.out.println("Printing an max element in an array"+max);
    }
}
