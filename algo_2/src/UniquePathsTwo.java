import java.util.Arrays;

public class UniquePathsTwo {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int[][] d = new int[m][n];

        if(obstacleGrid[0][0] == 1 || obstacleGrid[m-1][n-1] == 1 ){
            return 0;
        }
        d[0][0] =1;
        for(int col = 1; col < n; col++){
            if(obstacleGrid[0][col] == 0){
                d[0][col] = d[0][col-1];
            }

        }
        for(int row = 1; row < m; row++){
            if(obstacleGrid[row][0] == 0){
                d[row][0] = d[row-1][0];
            }

        }

        for(int row = 1; row < m; row++){
            for(int col = 1; col < n; col++){
                if(obstacleGrid[row][col] != 1){
                    d[row][col] = d[row-1][col] + d[row][col-1];
                }
            }
        }


        return d[m-1][n-1];
    }
}
