public class Remove {
    public static void main(String[] args) {
        int arr[]={1,1,1,1,2,2,2,23,3,3,3,3,4,4,4,4,4};
        int val=3;
        int k=0;
        for(int i=0;i<arr.length;i++){
            if (arr[i]!=val) {
                arr[k] = arr[i];
                k++;
            }
        }
        for(int j=0;j<arr.length;j++){
            System.out.println(arr[j]);
        }
    }
}
