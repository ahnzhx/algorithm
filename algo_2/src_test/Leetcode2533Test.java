import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class Leetcode2533Test {
    @Test
    public void test(){
        Leetcode2533 lc = new Leetcode2533();
        assertEquals(5, lc.goodBinaryStrings(2,3,1,2));
        assertEquals(1, lc.goodBinaryStrings(4,4,4,3));
        assertEquals(198008142, lc.goodBinaryStrings(7304,8195,88,58));
    }
}