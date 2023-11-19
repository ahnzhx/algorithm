public class Leetcode329 {
    int[] dx = new int[]{1, 0, 0, -1};
    int[] dy = new int[]{0, 1, -1, 0};

    public int longestIncreasingPath(int[][] matrix) {
        int[][] cache = new int[matrix.length][matrix[0].length];
        int max =0;
        for(int row =0; row < matrix.length; row++){
            for(int col =0; col < matrix[0].length; col++){
                max = Math.max(dfs(matrix, row, col,cache), max);

            }
        }
        return max;

    }

    public int dfs(int[][] matrix, int row, int col, int[][] cache){
        if(cache[row][col] != 0) return cache[row][col];
        for(int k =0; k <dx.length; k++){
            if(isValid(row + dx[k],col + dy[k], matrix.length, matrix[0].length)){
                if(matrix[row][col] < matrix[row + dx[k]][col + dy[k]] ){
                    cache[row][col] = Math.max(dfs(matrix, row + dx[k], col + dy[k], cache), cache[row][col]);
                }
            }
        }
        return ++cache[row][col];

    }
    public boolean isValid(int row, int col, int n, int m){
        return row >=0 && row < n && col >=0 && col < m;

    }
}
