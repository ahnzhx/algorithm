package leetCode.backTracking;

import java.util.HashSet;
import java.util.Set;

public class ValidSudoku {
    public static boolean isValidSudoku(char[][] board) {
        Set<String> seen =new HashSet();
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                char val=board[i][j];
                if(val!='.'){
                    if(!seen.add(val+"found in row"+i)||
                            !seen.add(val+"found in column"+ j)||
                            !seen.add(val+"found in box"+i/3+"-"+j/3))return false;
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
