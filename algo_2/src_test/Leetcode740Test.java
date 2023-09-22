import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


class Leetcode740Test {

    @Test
    public void test(){
        Leetcode740 lc = new Leetcode740();
//        assertEquals(37, lc.deleteAndEarn(new int[]{8,10,4,9,1,3,5,9,4,10}));
        assertEquals(6, lc.deleteAndEarn(new int[]{3,4,2}));
//        assertEquals(9, lc.deleteAndEarn(new int[]{2,2,3,3,3,4}));
//        assertEquals(18, lc.deleteAndEarn(new int[]{1,1,1,2,4,5,5,5,6}));
    }
}