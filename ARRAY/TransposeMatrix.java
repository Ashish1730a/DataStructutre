public class TransposeMatrix {
    public static int [][] transposeMatrix(int arr[] []){
        int n=arr.length;
        int m=arr[0].length;
        int EndRow=n-1;
        int EndCol=m-1;
        int matrix[][]= new int [m][n];
        for(int row=0;row<=EndRow;row++){
            for(int col=0;col<=EndCol;col++){
                matrix[col][row]=arr[row][col];
            }
        }
        return matrix;

    }
    public static void main(String[] args) {
        int arr[][]={{2,4,6},{8,10,12},{25,48,50}};
        int result [][] = transposeMatrix(arr);
        

        //for print array2D
        for(int i=0;i<result.length;i++){
            for(int j=0;j<result[0].length;j++){
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }
    }
}
