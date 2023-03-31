import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

class MaxProfitTest {
    @Test
    public void test(){
        MaxProfit mp = new MaxProfit();
        assertEquals(5, mp.maxProfit(new int[]{7,1,5,3,6,4}));
        assertEquals(0, mp.maxProfit(new int[]{7,6,4,3,1}));
        assertEquals(3, mp.maxProfit(new int[]{1,4,2}));
        assertEquals(3, mp.maxProfit(new int[]{2,1,4}));
        assertEquals(4, mp.maxProfit(new int[]{3,2,6,5,0,3}));
        assertEquals(1, mp.maxProfit(new int[]{2,1,2,1,0,0,1}));
        assertEquals(2, mp.maxProfit(new int[]{2,1,2,1,0,1,2}));

        assertEquals(1, mp.maxProfit(new int[]{7,4,1,2}));
    }

}