package Arrays;

public class RotateMatrix {

    public static int[][] rotate(int[][] matrix){
        int m = matrix.length;
        int n = matrix[0].length;

        int[][] rotatedMat = new int[m][n];

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                rotatedMat[j][n-i-1]=matrix[i][j];
            }
        }
        return rotatedMat;
    }

    public static void rotate2(int[][] matrix){
        int m = matrix.length;
        for(int i=0;i<m;i++){
            for(int j=i+1;j<m;j++){
                swap(matrix, i, j);
            }
        }
         for (int i = 0; i < m;i++) {
            int l = 0, r = m - 1;
            while (l < r) {
                int temp = matrix[i][l];
                matrix[i][l] = matrix[i][r];
                matrix[i][r] = temp;
                l++;
                r--;
            }
        }

    }
        

    public static void swap(int[][] matrix, int i, int j) {
        int temp = matrix[i][j];
        matrix[i][j] = matrix[j][i];
        matrix[j][i] = temp;
    }
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        rotate2(matrix);
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        
    }
}
