import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Leetcode1791Test {
    @Test
    public void test(){
        Leetcode1791 lc = new Leetcode1791();
        assertEquals(2, lc.findCenter(new int[][]{{1,2}, {2,3}, {4,2}}));
        assertEquals(1, lc.findCenter(new int[][]{{1,2}, {5,1}, {1,3}, {1,4}}));
    }

}