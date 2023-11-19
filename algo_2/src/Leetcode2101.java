import java.util.*;

public class Leetcode2101 {

    public int maximumDetonation(int[][] bombs) {
        Map<Integer, List<Integer>> graph = new HashMap<>();
        int n = bombs.length;

        for(int i =0; i < n; i++){
            for(int j =0; j <n; j++){
                if(i==j) continue;
                int xi=bombs[i][0], yi = bombs[i][1], ri=bombs[i][2];
                int xj= bombs[j][0], yj= bombs[j][1];

                if((long)ri*ri >= (long)(xi-xj)*(xi-xj) + (long)(yi - yj)* (yi - yj)){
                    graph.computeIfAbsent(i, v->new ArrayList<>()).add(j);
                }
            }
        }

        int answer =0;
        for(int i =0; i < n; i++){
            answer = Math.max(dfs(i, graph), answer);
        }
        return answer;
    }

    public int dfs(int i, Map<Integer, List<Integer>> graph){
        Stack<Integer> stack = new Stack<>();
        Set<Integer> visited = new HashSet<>();
        stack.push(i);
        visited.add(i);

        while(!stack.isEmpty()){
            int cur = stack.pop();
            for(int neib: graph.getOrDefault(cur, new ArrayList<>())){
                if(!visited.contains(neib)){
                    visited.add(neib);
                    stack.push(neib);
                }
            }
        }
        return visited.size();
    }

}
