import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RegularExpressionMatchingTest {
    @Test
    public void test(){
        RegularExpressionMatching rem = new RegularExpressionMatching();
//        assertEquals(false, rem.isMatch("aa","a"));
//        assertEquals(true, rem.isMatch("aa","a*"));
//        assertEquals(true, rem.isMatch("ab",".*"));
        assertEquals(true, rem.isMatch("aab","c*a*b"));
        assertEquals(false, rem.isMatch("mississippi","mis*is*p*."));

    }

}