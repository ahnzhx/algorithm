package leetCode.graph;

public class NumberOfIslands {
    static int numberOfIsland = 0;
    public static int numIslands(char[][] grid) {
        int row = grid.length;
        int col = grid[0].length;

        boolean[][] visited = new boolean[row][col];
        int cnt = 0;
        /**
         * 좌: i, j-1
         * 우: i,  j+1
         * 위: i-1, j
         * 아래: i+1, j
          */
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                if(!visited[i][j] && grid[i][j] == '1'){
                    checkIsland(visited, grid, i, j, cnt++ );
                }

            }
        }

        return cnt;
    }

    public static void checkIsland(boolean[][] visited, char[][] grid, int i, int j, int cnt){

        if(grid[i][j] == '1'){
            visited[i][j] = true;

            // 좌
            if(j-1 >= 0 && !visited[i][j-1]){
                checkIsland(visited,  grid, i, j-1, cnt);
            }

            // 우
            if(j+1 < grid[0].length && !visited[i][j+1]){
                checkIsland(visited,  grid, i, j+1, cnt);
            }

            // 위
            if(i-1 >= 0 && !visited[i-1][j]){
                checkIsland(visited,  grid, i-1, j, cnt);
            }

            // 아래
            if(i+1 < grid.length && !visited[i+1][j]) {
                checkIsland(visited, grid, i + 1, j, cnt);
            }
        }

    }

    public static void main(String[] args) {

        char[][] grid = {
                {'1','1','0','0','0'},
                {'1','1','0','0','0'},
                {'0','0','1','0','0'},
                {'0','0','0','1','1'}
        };

//        char[][] grid = {
//                {'1','1','1'},
//                {'0','1','0'},
//                {'1','1','1'}
//
//        };
        System.out.println(numIslands(grid));
    }
}
