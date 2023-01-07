import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

class JumpGameTwoTest {

    @Test
    public void test(){
        JumpGameTwo jgt = new JumpGameTwo();
        assertEquals(2, jgt.jump(new int[]{2,3,1,1,4}));
        assertEquals(2, jgt.jump(new int[]{2,3,0,1,4}));
    }

}