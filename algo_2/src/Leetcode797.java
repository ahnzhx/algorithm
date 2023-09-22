import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class Leetcode797 {
    List<List<Integer>> ret = new ArrayList<>();
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<Integer> subret = new ArrayList<>();
        subret.add(0);
        dfs(subret, 0, graph, graph.length-1);
        return ret;
    }

    public void dfs(List<Integer> subret, int start, int[][] graph, int dest){
        if(start == dest){
            ret.add(new ArrayList<>(subret));
            return;
        }

        for(int n : graph[start]){
            subret.add(n);
            dfs(subret, n, graph, dest);
            subret.remove(subret.size()-1);
        }

    }
}
