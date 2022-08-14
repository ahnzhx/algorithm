package leetCode.backTracking;

public class SudokuSolver {
    public static void solveSudoku(char[][] board) {
        solve(board);

    }

    public static boolean solve(char[][] board){
        int row = -1, col = -1;
        boolean flag = true;
        for(int i =0; i < board.length; i++){
            for(int j = 0 ; j < board.length; j++){
                if(board[i][j] == '.'){
                    row = i;
                    col = j;
                    flag = false;
                    break;
                }
            }
            if(!flag)
                break;
        }
        if(flag)
            return true;
        for(int i =1; i <= 9; i++){
            // (char)(i+'0'): using char as an 8-bit integer for calculations.
            if(isSafe(board, row, col, (char)(i+'0'))){
                board[row][col] = (char)(i + '0');
                if(solve(board)) {
                    return true;
                }
                board[row][col]= '.';
            }

        }
        return false;

    }

    public static boolean isSafe(char[][] board, int row, int col, char num){
        for(int i =0 ; i < board.length; i++){
            if(board[i][col] == num){
                return false;
            }
        }
        for(int i =0 ; i < board.length; i++){
            if(board[row][i] == num){
                return false;
            }
        }

        int sqrt = (int) Math.sqrt(board.length);
        int rowStart = row - row % sqrt;
        int colStart = col - col % sqrt;
        for(int r = rowStart; r < rowStart + sqrt; r++){
            for (int c = colStart; c < colStart+ sqrt; c++){
                if(board[r][c] == num) {
                    return false;
                }
            }
        }
        return true;
    }


    public static void main(String[] args) {
        char[][] board =
                {{'5','3','.','.','7','.','.','.','.'}
                        ,{'6','.','.','1','9','5','.','.','.'}
                        ,{'.','9','8','.','.','.','.','6','.'}
                        ,{'8','.','.','.','6','.','.','.','3'}
                        ,{'4','.','.','8','.','3','.','.','1'}
                        ,{'7','.','.','.','2','.','.','.','6'}
                        ,{'.','6','.','.','.','.','2','8','.'}
                        ,{'.','.','.','4','1','9','.','.','5'}
                        ,{'.','.','.','.','8','.','.','7','9'}};

        solveSudoku(board);
    }
}
