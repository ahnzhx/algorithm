import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class Leetcode33Test {
    @Test
    public void test(){
        Leetcode33 lc = new Leetcode33();
        assertEquals(4, lc.search(new int[]{4,5,6,7,0,1,2}, 0));
        assertEquals(-1, lc.search(new int[]{4,5,6,7,0,1,2}, 3));
        assertEquals(-1, lc.search(new int[]{1}, 0));
    }

}