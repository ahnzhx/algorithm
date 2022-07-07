package leetCode;

import java.util.ArrayList;
import java.util.List;

public class MaxAreaOfIsland {


    public static int maxAreaOfIsland(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;

        boolean[][] visited = new boolean[row][col];
        List<Integer> widthList = new ArrayList<>();

        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                if(!visited[i][j] && grid[i][j] == 1){
                    widthList.add(0);
                    checkIsland(visited, grid, i, j, widthList);
                }

            }
        }
        int max = 0;
        for(int value : widthList){
            if (max < value)
                max = value;
        }
        return max;
    }
    public static void checkIsland(boolean[][] visited, int[][] grid, int i, int j, List<Integer> widthList){

        if(grid[i][j] == 1){
            visited[i][j] = true;
            int lastElement = widthList.size()-1;
            widthList.set(lastElement, widthList.get(lastElement)+1);

            // 좌
            if(j-1 >= 0 && !visited[i][j-1]){
                checkIsland(visited,  grid, i, j-1, widthList);
            }

            // 우
            if(j+1 < grid[0].length && !visited[i][j+1]){
                checkIsland(visited,  grid, i, j+1, widthList);
            }

            // 위
            if(i-1 >= 0 && !visited[i-1][j]){
                checkIsland(visited,  grid, i-1, j, widthList);
            }

            // 아래
            if(i+1 < grid.length && !visited[i+1][j]) {
                checkIsland(visited, grid, i + 1, j, widthList);
            }

        }
    }


    public static void main(String[] args) {
        int[][] grid = {{0,0,1,0,0,0,0,1,0,0,0,0,0},{0,0,0,0,0,0,0,1,1,1,0,0,0},{0,1,1,0,1,0,0,0,0,0,0,0,0},{0,1,0,0,1,1,0,0,1,0,1,0,0},{0,1,0,0,1,1,0,0,1,1,1,0,0},{0,0,0,0,0,0,0,0,0,0,1,0,0},{0,0,0,0,0,0,0,1,1,1,0,0,0},{0,0,0,0,0,0,0,1,1,0,0,0,0}};
        System.out.println(maxAreaOfIsland(grid));
    }
}
