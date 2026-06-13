public class ArrayShortedORNot {
    public static void main(String[] args) {
        boolean isSorted = true ;
        // int arr[] = {225,2,4,65,78,995,1,46}; This Array is not sorted..
        int arr[] = {2,4,6,8,10,12,14}; //This Array is not sorted...
        for(int i=0;i<arr.length-1;i++){
            if (arr[i] > arr[i+1]) {
                isSorted = false;
                break;
            }
        }
        if (isSorted) {
            System.out.println("The Array is sorted ");
        }
        else{
            System.out.println("The Array is not sorted ");
        }
    }
}

