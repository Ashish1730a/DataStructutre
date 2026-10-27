public class ColPrintInMatrixx {
    public static void printSprial(int [] [] arr){
        int n=arr.length;
        int m=arr[0].length;

        int startCol=0,startRow=0,endCol=m-1,endRow=n-1;
        int col,row;

    while (startCol<=endCol && startRow<=endRow) {

        //print start column from startRow to endRow
        col=startCol;
        for(row=startRow; row<=endRow;row++){
            System.out.print(arr[row][col]+", ");
            
        }
        startCol++;


        //print end row from startCol to endCol
        row = endRow;
        for(col=startCol;col<=endCol;col++){
            System.out.print(arr[row][col]+", ");
        }
        endRow--;

        //print end column endRow to startRow
        col=endCol;
        for(row=endRow; row>=startRow;row--){
            System.out.print(arr[row][col]+", ");
        }
        endCol--;

        //print start row endCol to startCol
        row=startRow;
        for(col=endCol;col>=startCol;col--){
            System.out.print(arr[row][col]+", ");
        }
        startRow++;
        System.out.println();
    }   


    }
    public static void main(String args[]){
        

        int arr[][] = {{1,6,11,14,21},{2,7,12,15,25},{3,8,13,16,22},{4,9,17,19,24},{5,10,20,18,23}};
         printSprial(arr);
        }
    }

