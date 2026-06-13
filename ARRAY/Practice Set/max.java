public class max {
    public static void main(String[] args) {
        int ashish[] = {20,60,80};
        int max = 0;
        for (int i : ashish) {
            if (i>max) {
                max = i;
            }
        }
        System.out.println("Printing maxmium value in an array");
    System.out.print(max);
    }
}
