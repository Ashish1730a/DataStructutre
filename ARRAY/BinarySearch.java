public class BinarySearch {
    public static int Binary(int num[],int key){
        int start = 0, end = num.length-1;
        while(start <= end) {
            int mid = (start+end)/2;
            if (num[mid]==key) {
                return mid;
            }
            if (num[mid]<key) {
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int num[]={2,4,6,8,12,18,20,63,99,105};
        int key=105;
        System.out.println("Index for key is "+ Binary(num,key) );
    }
}
