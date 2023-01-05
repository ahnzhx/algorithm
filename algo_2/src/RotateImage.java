public class RotateImage {
    public void rotate(int[][] matrix) {
        int n = matrix.length;

        for(int row = 0; row < (n+1)/2; row++){
            for(int col = 0; col < n/2; col++){
                int temp = matrix[col][n-row-1];
                matrix[col][n-row-1] = matrix[row][col];
                matrix[row][col] = matrix[n-col-1][row] ;
                matrix[n-col-1][row] = matrix[n-row-1][n-1-col];
                matrix[n-row-1][n-1-col] = temp;
            }
        }
    }


}
