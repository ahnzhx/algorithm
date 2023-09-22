import java.util.List;

public class Leetcode841 {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean[] visited = new boolean[rooms.size()];
//        visited[0] =true;

        dfs(visited, rooms, 0);
        for(boolean v :visited){
            if(!v) return false;
        }
        return true;
    }

    public void dfs(boolean[] visited, List<List<Integer>> rooms, int key){
        if(visited[key]) return;
        visited[key] = true;
        for(int keys : rooms.get(key)){
            dfs(visited, rooms, keys);
        }
    }
}
