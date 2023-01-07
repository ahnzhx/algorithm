import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GroupAnagramsTest {
    @Test
    public void test(){
        GroupAnagrams ga = new GroupAnagrams();
        List<List<String>> ret = new ArrayList<>();
        List<String> subRet = new ArrayList<>();
        subRet.add("bat");
        ret.add(subRet);
        List<String> subRet2 = new ArrayList<>();
        subRet2.add("nat");
        subRet2.add("tan");
        ret.add(subRet2);
        List<String> subRet3 = new ArrayList<>();
        subRet3.add("ate");
        subRet3.add("eat");
        subRet3.add("tea");
        ret.add(subRet3);
        assertEquals(ret, ga.groupAnagrams(new String[]{"eat","tea","tan","ate","nat","bat"}));

        List<List<String>> ret1 = new ArrayList<>();
        List<String> subList= new ArrayList<>();
        subList.add("");
        ret1.add(subList);
        assertEquals(ret1, ga.groupAnagrams(new String[]{""}));

        List<List<String>> ret2 = new ArrayList<>();
        List<String> subList2= new ArrayList<>();
        subList.add("a");
        ret1.add(subList2);
        assertEquals(ret2, ga.groupAnagrams(new String[]{"a"}));
    }

}