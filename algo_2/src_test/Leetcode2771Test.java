import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


class Leetcode2771Test {
    @Test
    public void test(){
        Leetcode2771 lc = new Leetcode2771();
        int[] n1 = new int[]{1,3,2,1};
        int[] n2 = new int[]{2,2,3,4};
        assertEquals(4, lc.maxNonDecreasingLength(n1,n2));
    }
}