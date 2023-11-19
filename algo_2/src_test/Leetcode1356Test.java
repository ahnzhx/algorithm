import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class Leetcode1356Test {
    @Test
    public void test(){
        Leetcode1356 lc = new Leetcode1356();
        int[] ret1 = new int[]{0,1,2,4,8,3,5,6,7};
        int[] arr = new int[]{0,1,2,3,4,5,6,7,8};
        int[] ret2 = new int[]{1,2,4,8,16,32,64,128,256,512,1024};
        int[] arr2 = new int[]{1024,512,256,128,64,32,16,8,4,2,1};

//        assertEquals(ret1, lc.sortByBits(arr));
        assertEquals(ret2, lc.sortByBits(arr2));
    }
}