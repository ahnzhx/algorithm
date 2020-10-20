package leetCode;

import junit.framework.TestCase;

public class LongestPalindromicSubstringTest extends TestCase {
    public void test(){
        LongestPalindromicSubstring longestPalindromicSubstring = new LongestPalindromicSubstring();
        assertEquals("aba", longestPalindromicSubstring.solution("caba"));
    }
}