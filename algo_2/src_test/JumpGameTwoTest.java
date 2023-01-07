import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

class JumpGameTwoTest {

    @Test
    public void test(){
        JumpGameTwo jgt = new JumpGameTwo();
        assertEquals(2, jgt.jump(new int[]{2,3,1,1,4}));
        assertEquals(2, jgt.jump(new int[]{2,3,0,1,4}));
        assertEquals(0, jgt.jump(new int[]{0}));
        assertEquals(0, jgt.jump(new int[]{1}));
        assertEquals(2, jgt.jump(new int[]{1,2,3}));
        assertEquals(1, jgt.jump(new int[]{3,2,1}));
    }

}