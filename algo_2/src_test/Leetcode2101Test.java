import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


class Leetcode2101Test {
    @Test
    public void test(){
        Leetcode2101 lc = new Leetcode2101();
        assertEquals(2, lc.maximumDetonation(new int[][]{{2,1,3}, {6,1,4}}));
//        assertEquals(1, lc.maximumDetonation(new int[][]{{1,1,5}, {10,10,5}}));
//        assertEquals(5, lc.maximumDetonation(new int[][]{{1,2,3}, {2,3,1}, {3,4,2}, {4,5,3}, {5,6,4}}));
    }
}