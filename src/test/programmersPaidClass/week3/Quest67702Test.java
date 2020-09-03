package programmersPaidClass.week3;

import junit.framework.TestCase;

public class Quest67702Test extends TestCase {
    public void test(){
        Quest67702 quest67702 = new Quest67702();
        String[] words1 = new String[]{"hot", "dot", "dog", "lot", "log", "cog"};
        String[] words2 = new String[]{"hot", "dot", "dog", "lot", "log"};
        String[] words3 = new String[]{"hot", "dot", "dog", "lot", "log", "loc", "cog"};
        String[] words4 = new String[]{"hot", "dot", "cog"};

        assertEquals(4, quest67702.solution("hit", "cog", words1));
        assertEquals(0, quest67702.solution("hit", "cog", words2));
        assertEquals(5, quest67702.solution("hit", "cog", words3));
        assertEquals(0, quest67702.solution("hit", "cog", words4));
    }

}