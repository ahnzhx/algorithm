import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class  Leetcode42Test {
    @Test
    public void test(){
        int[] height = new int[]{0,1,0,2,1,0,1,3,2,1,2,1};
        int[] height2 = new int[]{4,2,0,3,2,5};
        Leetcode42 lc = new Leetcode42();
        assertEquals(6, lc.trappingWater(height));
        assertEquals(9, lc.trappingWater(height2));
    }

}