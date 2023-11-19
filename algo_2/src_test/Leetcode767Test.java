import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class Leetcode767Test {
    @Test
    public void test(){
        Leetcode767 lc = new Leetcode767();
        assertEquals("aba", lc.reorganizeString("aab"));
        assertEquals("", lc.reorganizeString("aaab"));
        assertEquals("vlvov", lc.reorganizeString("vvvlo"));

    }

}