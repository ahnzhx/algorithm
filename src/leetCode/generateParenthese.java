package leetCode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class generateParenthese {
    public static List<String> generateParenthesis(int n) {

        List<String> ret = new ArrayList<>();
        process(ret, n, 0,0, "");

        return ret;


    }

    public static void process(List<String> ret, int n, int numOpen, int numClosed, String str){
        if(numOpen == n && numClosed == n ){
            ret.add(str);
            return;
        }
        if(numOpen < n ){
            process(ret, n, numOpen+1, numClosed, str+"(");
        }

        if( numOpen > numClosed ){
            process(ret, n, numOpen, numClosed+1, str+")");
        }
    }

    public static void main(String[] args) {
        generateParenthesis(3);

    }
}
