import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UniquePathsTest {

    @Test
    public void test(){
        UniquePaths up = new UniquePaths();
        assertEquals(28, up.uniquePaths(3,7));
        assertEquals(3, up.uniquePaths(3,2));
        assertEquals(1, up.uniquePaths(1,1));
    }

}