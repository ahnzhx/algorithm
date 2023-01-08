import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestCommonPrefixTest {
    @Test
    void test(){
        LongestCommonPrefix lcp = new LongestCommonPrefix();
//        assertEquals("fl", lcp.longestCommonPrefix(new String[]{"flower","flow","flight"}));
//        assertEquals("", lcp.longestCommonPrefix(new String[]{"dog","racecar","car"}));
        assertEquals("", lcp.longestCommonPrefix(new String[]{"reflower","flow","flight"}));
    }

}