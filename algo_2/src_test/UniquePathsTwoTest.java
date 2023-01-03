import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UniquePathsTwoTest {

    @Test
    public void test(){
        UniquePathsTwo upt = new UniquePathsTwo();
        assertEquals(2, upt.uniquePathsWithObstacles(new int[][]{{0,0,0},{0,1,0},{0,0,0}}));
        assertEquals(1, upt.uniquePathsWithObstacles(new int[][]{{0,1},{0,0}}));
        assertEquals(0, upt.uniquePathsWithObstacles(new int[][]{{0,0},{1,1},{0,0}}));
        assertEquals(2, upt.uniquePathsWithObstacles(new int[][]{{0,0,1,0},{0,0,0,0},{1,1,1,0}, {0,0,0,0}}));
    }

}