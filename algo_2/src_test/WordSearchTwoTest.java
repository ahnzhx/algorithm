import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

class WordSearchTwoTest {
    @Test
    public void test(){
        WordSearchTwo wst = new WordSearchTwo();
        List<String> ret = new ArrayList<>();
        ret.add("eat");
        ret.add("oath");
        assertEquals(ret, wst.findWords(new char[][]{{'o','a','a','n'}, {'e','t','a','e'},{'i','h','k','r'},{'i','f','l','v'}},
                new String[]{"oath","pea","eat","rain"}));
    }
}