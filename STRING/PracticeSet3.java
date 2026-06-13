public class PracticeSet3 {
    public static void main(String[] args) {
        String letter = "Dear <|name|>, Thanks lot";
        String Apple = letter.replace("<|name|>", "Ashish");
        System.out.println(Apple);
    }
}
