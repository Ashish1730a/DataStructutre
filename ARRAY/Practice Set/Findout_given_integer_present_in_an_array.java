

public class Findout_given_integer_present_in_an_array {
    public static void main(String[] args) {
        int []marks ={44,6,677,88,55};
        int num = 55;
        boolean isInArray = false;
        for (int i : marks) {
            if(num==i){
                isInArray = true;
                break;
            }
        }
        if(isInArray){
            System.out.println("The value is present in Array");
        }
        else{
            System.out.println("The value is not present in Array");
        }
    }
}
