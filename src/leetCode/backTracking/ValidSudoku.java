package leetCode.backTracking;

public class ValidSudoku {
    public static boolean isValidSudoku(char[][] board) {
        int col = -1, row = -1;

        for(int i = 0 ; i < board.length; i++){
            for(int j = 0 ; j < board.length; j++){
                if(board[i][j] != '.'){
                    row = i;
                    col = j;
                    if(!isValid(board, row, col, board[i][j])){
                        return false;
                    }
                }
            }
        }

        return true;
    }

    public static boolean isValid(char[][] board, int row, int col, char candidate) {
        // col check
        for(int i =0 ; i < board.length; i++){
            if(i != col){
                if(board[row][i] == candidate){
                    return false;
                }
            }

        }
        // row check
        for(int i =0 ; i < board.length; i++){
            if(i != row){
                if(board[i][col] == candidate ){
                    return false;
                }
            }

        }
        // square check
        int sqrt = (int) Math.sqrt(board.length);
        int rowStart = row - row%sqrt;
        int colStart = col - col%sqrt;
        for(int r = rowStart; r < rowStart + sqrt; r++){
            for(int c = colStart; c < colStart + sqrt; c++){
                if(r != row && c != col){
                    if(board[r][c] == candidate ){
                        return false;
                    }
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
        System.out.println(isValidSudoku(board));
    }
}
