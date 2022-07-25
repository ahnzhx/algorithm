package dynamicProgramming;

import java.util.LinkedList;
import java.util.Queue;

public class ShortestPathInBinaryMatrix {

    static class Loc {
        int loc_i;
        int loc_j;

        public Loc(int i, int j){
            this.loc_i  = i;
            this.loc_j = j;
        }
    }

    static class queueNode{
        Loc loc;
        int dist;

        public queueNode(Loc loc, int dist){
            this.loc = loc;
            this.dist = dist;
        }
    }
    static int[] rowNum = {-1, 1, -1, 1, 0, 0, 1, -1};
    static int[] colNum = {0, 0, 1, -1, 1, -1, 1, -1};

    public static int shortestPathBinaryMatrix(int[][] grid) {
        boolean[][] visited = new boolean[grid.length][grid[0].length];

        if(grid[0][0] ==1 || grid[grid.length-1][grid[0].length-1 ]== 1)
            return -1;

        Queue<queueNode> q = new LinkedList<>();
        queueNode qn = new queueNode(new Loc(0,0), 1);
        q.add(qn);


        while(!q.isEmpty()){
            queueNode curr = q.remove();
            Loc loc = curr.loc;

            if(loc.loc_i == grid.length-1 && loc.loc_j == grid[0].length-1){
                return curr.dist;
            }

            for(int k = 0; k < rowNum.length; k++){
                int row = loc.loc_i +rowNum[k];
                int col = loc.loc_j +colNum[k];

                if(isValid(row, col, grid.length, grid[0].length) &&
                        grid[row][col] == 0 && !visited[row][col]){
                    visited[row][col] = true;
                    queueNode adjCell = new queueNode(new Loc(row, col), curr.dist+1);
                    q.add(adjCell);
                }
            }
        }

        return -1;

    }

    static boolean isValid(int row, int col, int ROW, int COL){
        return (row >=0) && (row < ROW) &&
                (col >= 0) && (col < COL);
    }


    public static void main(String[] args) {
//        int[][] grid = {
//                {0,0,0},
//                {1,1,0},
//                {1,1,0}
//        };

//        int[][] grid = {
//                {0,0,0},
//                {1,0,0},
//                {1,1,0}
//        };
//        int[][] grid = {
//                {0,0,0},
//                {0,1,0},
//                {0,0,0}
//        };
//        int[][] grid = {
//                {0,1,0,0,0,0},
//                {0,1,0,1,1,0},
//                {0,1,1,0,1,0},
//                {0,0,0,0,1,0},
//                {1,1,1,1,1,0},
//                {1,1,1,1,1,0},
//        };

//
        int[][] grid = {
                {0,0,0},
                {0,0,0},
                {0,0,0}
        };

//        int[][] grid = {
//                {1,0,0},
//                {1,1,0},
//                {1,1,0}
//        };
//        int[][] grid = {
//                {0,1},
//                {1,0}
//        };
//        int[][] grid = {
//                {0,0,0,0,1},
//                {1,0,0,0,0},
//                {0,1,0,1,0},
//                {0,0,0,1,0},
//                {0,0,0,1,0}
//        };
        System.out.println(shortestPathBinaryMatrix(grid));
    }
}
