import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Leetcode997 {
    public int findJudge(int n, int[][] trust) {
        Map<Integer, Integer> judge = new HashMap<>();
        List<Integer> cnt = new ArrayList<>();
        // initialization
        cnt.add(0);
        for(int i =1; i < n+1; i++){
            judge.put(i, 0);
            cnt.add(0);
        }

        for(int[] t :trust){
            judge.replace(t[0], t[1]);
            cnt.set(t[1], cnt.get(t[1])+1);
        }

        for(int i =1; i < n+1; i++){
            if(judge.get(i) == 0) {
                if(cnt.get(i) == n-1) return i;
            }
        }
        return -1;
    }
}
