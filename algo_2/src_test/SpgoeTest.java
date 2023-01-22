import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

class SpgoeTest {
    @Test
    public void test(){
        Spgoe s = new Spgoe();
        assertEquals(6, s.shortestPath(new int[][]{{0,0,0},{1,1,0},{0,0,0},{0,1,1},{0,0,0}}, 1));
        assertEquals(-1, s.shortestPath(new int[][]{{0,1,1},{1,1,1},{1,0,0}}, 1));
    }

}