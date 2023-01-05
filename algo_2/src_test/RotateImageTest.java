import org.junit.jupiter.api.Test;

class RotateImageTest {
    @Test
    public void test(){
        RotateImage ri = new RotateImage();
        ri.rotate(new int[][]{{1,2,3},{4,5,6},{7,8,9}});
    }

}