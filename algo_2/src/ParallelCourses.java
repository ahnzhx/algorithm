import java.util.ArrayList;
import java.util.List;

class ParallelCourses {
    // https://leetcode.com/problems/parallel-courses/description/
    public int minimumSemesters(int n, int[][] relations) {
        int[] inCount = new int[n+1]; // how many nodes are pointing the node
        List<List<Integer>> graph = new ArrayList<>(n+1);
        for(int i =0; i < n+1; i++){
            graph.add(new ArrayList<Integer>());
        }
        for(int[] relation : relations){
            graph.get(relation[0]).add(relation[1]);
            inCount[relation[1]]++;
        }

        int step =0;
        int studiedCount =0;
        List<Integer> bfsQueue = new ArrayList<>();
        for(int node =1; node < n+1; node++){
            
        }


        return inCount.length;
    }
}