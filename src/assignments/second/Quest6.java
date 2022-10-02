package assignments.second;

public class Quest6 {
    static int[] moveRow = {0,1,1};
    static int[] moveCol = {1,0,1};

    public static boolean solution(int[][] A){
        boolean[][] visited = new boolean[A.length][A[0].length];
        return dfs(A, 20, 0, 0, visited);
    }

    public static boolean dfs(int[][] A, int target, int row, int col,boolean[][] visited ){
        if(A.length > row && A[0].length > col && !visited[row][col] ){
            visited[row][col] = true;
            if (A[0][0] > target)
                return false;
            if(A[A.length-1][A.length-1] < target)
                return false;

            if(A[row][col] == target ){
                return true;
            }else{
                for(int i =0 ; i < moveRow.length; i++){
                    if(dfs(A, target, row + moveRow[i], col+ moveCol[i], visited)){
                        return true;
                    }
                }
            }

        }
        return false;
    }

    public static void main(String[] args) {
        int[][] A = new int[3][3];

        int val = 3;
        for(int i =0 ; i < 3; i++){
            for(int j =0 ; j < 3; j++){
                A[i][j] = val++;
            }
        }
        System.out.println(solution(A));
    }
}
