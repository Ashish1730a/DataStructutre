

public class Ashish1 {
    public static void main(String[] args) {
        int [][] mat1 = {{2,4,6,},
                        {8,10,12}};
        int [][] mat2 = {{14,16,18},
                        {20,22,24}};
        int [][] result = {{0,0,0},
                          {0,0,0,}};
        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat1[i].length; j++) {
                System.out.format("Sitting the value for i=%d and j=%d\n",i,j);
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
        }
        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat1[i].length; j++) {
                System.out.print(result[i][j]+" ");
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
            System.out.println("");
        }              
    }
}
