public class ARR {
    public static void main(String[] args) {
        int arr[]={0,1,1,1,2,2,3,3,4};
        int i=0; 
        for(int j=1;j<arr.length;j++){
            if (arr[i]!=arr[j]) {
                
                i++; 
                arr[i]=arr[j];  
            }
        }
        for(int k=0;k<5;k++){
            System.out.println(arr[k]);
        }

    }
}
