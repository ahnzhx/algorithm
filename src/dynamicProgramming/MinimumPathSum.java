package dynamicProgramming;

public class MinimumPathSum {
    public static int minPathSum(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        int[][] sum = new int[grid.length][grid[0].length];
        sum[0][0] = grid[0][0];

        for(int i = 0 ; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(i == 0 && j > 0){
                    sum[i][j] = grid[i][j]+ sum[i][j-1];
                }
                if(j == 0 && i > 0){
                    sum[i][j] = grid[i][j]+ sum[i-1][j];
                }
                if(i != 0 && j != 0){
                    sum[i][j] = Integer.min(sum[i-1][j], sum[i][j-1]) + grid[i][j];
                }

            }
        }
        return sum[row-1][col-1];
    }

    public static void main(String[] args) {
        int[][] grid = {{1,3,1},{1,5,1},{4,2,1}};
        System.out.println(minPathSum(grid));
    }
}
