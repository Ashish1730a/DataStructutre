public class LinearSearch {
    public static int LinearSearch(int number[],int key){
        for(int i=0;i<number.length;i++){
            if (number[i]==key) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int number[]={45,75,14,20,68,95,62,02};
        int key = 20;
        int index= LinearSearch(number,key);
        if (index==-1) {
            System.out.println("NOT found");
        }else{
            System.out.println("The key is at index" +" "+ index);
        }
    }
}
