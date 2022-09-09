package leetCode.graph;

import java.util.*;

// topological ordering
public class CourseSchedule {
    public static boolean canFinish(int numCourses, int[][] prerequisites) {
        // graph creating starts
        List<List<Integer>> graph = new ArrayList<>();
        for(int i=0; i<numCourses; i++){
            graph.add(new ArrayList<>());
        }

        int m = prerequisites.length;
        for(int i=0; i<m; i++){
            graph.get(prerequisites[i][1]).add(prerequisites[i][0]);
        }

        // graph creating ends

        // creating indegree of the nodes starts
        int[] indegree = new int[numCourses];
        for(int i=0; i<numCourses; i++){
            for(int neighbours : graph.get(i)){
                indegree[neighbours]++;
            }
        }
        // creating indegree of the nodes ends
        Queue<Integer> queue = new LinkedList<>();
        // which nodes have indegree that will be added in our queue

        for(int i=0; i<numCourses; i++){
            if(indegree[i]==0){
                queue.offer(i);
            }
        }

        int count=0;
        while(!queue.isEmpty()){

            int node = queue.poll();
            count++;

            for(int neighbours : graph.get(node)){
                indegree[neighbours]--;

                if(indegree[neighbours]==0){
                    queue.offer(neighbours);
                }
            }

        }

        return count==numCourses;
    }


    public static void main(String[] args) {
        int[][] prerequisites1 = {{1,0}};
//        int[][] prerequisites2 = {{1,0}, {0,1}};
        int[][] prerequisites3 = {{0,10},{3,18},{5,5},{6,11},{11,14},{13,1}, {15,1},{17,4}};

//        System.out.println(canFinish(3, prerequisites1));
//        System.out.println(canFinish(2, prerequisites2));
//        System.out.println(canFinish(1, new int[0][0]));
        System.out.println(canFinish(20, prerequisites3));
    }


}
