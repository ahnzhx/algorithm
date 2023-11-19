import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Leetcode42 {
    public int trappingWater(int[] height){
        Queue<Integer> q = new LinkedList<>();
        int ret =0;
        for(int h: height){
            if(q.size() == 0 && h > 0){ // initial step
                q.add(h);
            } else if(q.size() >0){
                if(q.peek() > h ) q.add(h);
                else {
                    ret += cntWater(q);
                    q.add(h);
                }
            }

        }
        if(q.size()> 0){
            int wall = q.remove();
            int max =0;
            for(Integer item : q){
                max = Math.max(wall, item);
            }
            if(max == wall){
                ret += cntWater(q);
            }
        }
        return ret;
    }

    public int cntWater(Queue<Integer> q){
        int sumWater =0;
        int wall = q.poll();
        while(!q.isEmpty()){
            sumWater += wall - q.poll();
        }
        return sumWater;
    }
}
