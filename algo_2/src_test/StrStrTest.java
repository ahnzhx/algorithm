import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;


class StrStrTest {

    @Test
    public void strStr(){
        String haystack = "sadbutsad";
        String needle = "sad";
        StrStr sstr = new StrStr();
        assertEquals(0, sstr.strStr(haystack, needle));
        assertEquals(-1, sstr.strStr("leetcode", "leeto"));
        assertEquals(0, sstr.strStr("a", "a"));
        assertEquals(1, sstr.strStr("mississippi", "issi"));
        assertEquals(0, sstr.strStr("aaa", "aa"));
        assertEquals(4, sstr.strStr("mississippi", "issip"));
    }

}