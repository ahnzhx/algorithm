import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class Leetcode329Test {
    @Test
    public void test(){
        int[][] matrix1 = new int[][]{{9,9,4},{6,6,8},{2,1,1}};
        int[][] matrix2 = new int[][]{{3,4,5},{3,2,6},{2,2,1}};
        int[][] matrix3 = new int[][]{{1}};
        int[][] matrix4 = new int[][]{{1,2}};
        int[][] matrix5 = new int[][]{{6,8}, {7,2}};
        int[][] matrix6 = new int[][]{{7,7,5}, {2,4,6}, {8,2,0}};
        Leetcode329 lc = new Leetcode329();
//        assertEquals(4, lc.longestIncreasingPath(matrix1));
//        assertEquals(4, lc.longestIncreasingPath(matrix2));
//        assertEquals(1, lc.longestIncreasingPath(matrix3));
//        assertEquals(2, lc.longestIncreasingPath(matrix4));
//        assertEquals(2, lc.longestIncreasingPath(matrix5));
        assertEquals(4, lc.longestIncreasingPath(matrix6));
    }
}