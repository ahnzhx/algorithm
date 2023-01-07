import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

class ClosestDessertCostTest {
    @Test
    public void test(){
        ClosestDessertCost cdc = new ClosestDessertCost();
//        assertEquals(10, cdc.closestCost(new int[]{1,7}, new int[]{3,4}, 10));
        assertEquals(17, cdc.closestCost(new int[]{2,3}, new int[]{4,5,100}, 18));
        assertEquals(8, cdc.closestCost(new int[]{3,10}, new int[]{2,5}, 9));
    }

}