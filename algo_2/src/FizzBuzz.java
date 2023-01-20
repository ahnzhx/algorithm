import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public List<String> fizzBuzz(int n) {
        List<String> ret = new ArrayList<>();
        int k =0;
        while(k < n){
            if((k+1)%5 ==0 && (k+1)%3 ==0) {
                ret.add("FizzBuzz");
            }else{
                if((k+1)%3 ==0){
                    ret.add("Fizz");
                }else if ((k+1)%5 ==0){
                    ret.add("Buzz");
                }else{
                    ret.add(String.valueOf(k+1));
                }
            }



            k++;
        }
        return ret;
    }
}
