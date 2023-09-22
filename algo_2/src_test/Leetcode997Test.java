import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Leetcode997Test {
    @Test
    public void test(){
        Leetcode997 lc = new Leetcode997();
        int[][] trust1 = new int[][]{{1,2}};
        int[][] trust2 = new int[][]{{1,3},{2,3}};
        int[][] trust3 = new int[][]{{1,3}, {2,3},{3,1}};
        int[][] trust4 = new int[][]{{1,2}, {2,3}};
        int[][] trust5 = new int[][]{{1,3}, {1,4}, {2,3}, {2,4}, {4,3}};

        assertEquals(2, lc.findJudge(2, trust1));
        assertEquals(3, lc.findJudge(3, trust2));
        assertEquals(-1, lc.findJudge(3, trust3));
        assertEquals(-1, lc.findJudge(3, trust4));
        assertEquals(3, lc.findJudge(4, trust5));
    }

}