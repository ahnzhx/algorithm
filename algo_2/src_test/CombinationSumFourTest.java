import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CombinationSumFourTest {
    @Test
    public void test(){
        CombinationSumFour csf = new CombinationSumFour();
        assertEquals(7, csf.combinationSum4(new int[]{1,2,3}, 7));
//        assertEquals(0, csf.combinationSum4(new int[]{9}, 3));
//        assertEquals(0, csf.combinationSum4(new int[]{2,1,3}, 35));
    }
}