import java.util.Arrays;

public class Spgoe {
    // Shortest Path in a Grid with Obstacles Elimination
    public int shortestPath(int[][] grid, int k) {
        int[][] dp = new int[grid.length][grid[0].length];
        int[][] kVisited = new int[grid.length][grid[0].length];

        for(int[] arr : dp){
            Arrays.fill(arr, Integer.MAX_VALUE);
        }

        dp[0][0] = 0;
        for(int i =0; i < grid.length; i++){
            for(int j =0; j < grid[0].length; j++) {
                if (i == 0 && j == 0) {
                    continue;
                }
                if (grid[i][j] == 0) {
                    dp[i][j] = getMinValue(dp, i, j) + 1;
                    kVisited[i][j] = getMinValue(kVisited, i, j);
                } else {
                    if (kVisited[i][j] < k) {
                        dp[i][j] = getMinValue(dp, i, j) + 1;
                        kVisited[i][j] = getMinValue(kVisited, i, j) + 1;
                    } else {
                        return -1;
                    }
                }
            }
        }
        return dp[grid.length-1][grid[0].length-1];
    }

    private int getMinValue(int[][] arr, int i, int j){
        if(i ==0){
            if(j+1 < arr[0].length-1){
                return Math.min(arr[i][j-1], Math.min(arr[i][j+1], arr[i+1][j]));
            }else{
                return Math.min(arr[i][j-1], arr[i+1][j]);
            }

        }else if(i == arr.length-1){
            if(j+1 < arr[0].length && j > 0){
                return Math.min(arr[i][j-1], Math.min(arr[i][j+1], arr[i-1][j]));
            }else if (j == arr[0].length-1){
                return Math.min(arr[i][j-1], arr[i-1][j]);
            }else if(j ==0){
                return Math.min(arr[i-1][j], arr[i][j+1]);
            }

        }else if (j ==0 && (i > 0 || i+1 < arr.length-1)){
            return Math.min(arr[i-1][j], Math.min(arr[i][j+1], arr[i+1][j]));
        }else if(j == arr[0].length-1 && (i > 0 || i+1 < arr.length-1)){
            return Math.min(arr[i-1][j], Math.min(arr[i][j-1], arr[i+1][j]));
        }
        return Math.min(arr[i][j-1], Math.min(arr[i-1][j], Math.min(arr[i][j+1], arr[i+1][j])));
    }

}
