import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CombinationSumFourTest {
    @Test
    public void test(){
        CombinationSumFour csf = new CombinationSumFour();
        assertEquals(44, csf.combinationSum4(new int[]{1,2,3}, 7));
        assertEquals(9, csf.combinationSum4(new int[]{3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25}, 10));
        assertEquals(0, csf.combinationSum4(new int[]{9}, 3));
//        assertEquals(0, csf.combinationSum4(new int[]{2,1,3}, 35));
    }
}