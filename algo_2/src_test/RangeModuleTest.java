import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RangeModuleTest {
    @Test
    public void test(){
        RangeModule rm = new RangeModule();

//        String[] operations = new String[]{"RangeModule","addRange","removeRange","queryRange","queryRange","queryRange"};
        String[] operations = new String[]{"RangeModule","addRange","removeRange","removeRange","addRange","removeRange","addRange","queryRange","queryRange","queryRange"};
        List<Integer[]> leftAndRight = new ArrayList<>();
//        leftAndRight.add(new Integer[]{});
//        leftAndRight.add(new Integer[]{10,20});
//        leftAndRight.add(new Integer[]{14,16});
//        leftAndRight.add(new Integer[]{10,14});
//        leftAndRight.add(new Integer[]{13,15});
//        leftAndRight.add(new Integer[]{16,17});


        leftAndRight.add(new Integer[]{});
        leftAndRight.add(new Integer[]{6,8});
        leftAndRight.add(new Integer[]{7,8});
        leftAndRight.add(new Integer[]{8,9});
        leftAndRight.add(new Integer[]{8,9});
        leftAndRight.add(new Integer[]{1,3});
        leftAndRight.add(new Integer[]{1,8});
        leftAndRight.add(new Integer[]{2,4});
        leftAndRight.add(new Integer[]{2,9});
        leftAndRight.add(new Integer[]{4,6});

        boolean[] output = new boolean[operations.length];

        for(int i =0; i < operations.length; i++){
            if(operations[i].equals("addRange")){
                rm.addRange(leftAndRight.get(i)[0],leftAndRight.get(i)[1]);
            }else if(operations[i].equals("removeRange")){
                rm.removeRange(leftAndRight.get(i)[0],leftAndRight.get(i)[1]);
            }else if(operations[i].equals("queryRange")){
                output[i] = rm.queryRange(leftAndRight.get(i)[0],leftAndRight.get(i)[1]);
            }
        }

    }

}