package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class DijkstraGraph {

    private static int graph[][];
    private static int numberOfNode;
    private static List<int[]> spotsWhichHaveBeenVisited;

    /**
     * 그래프 초기화
     * @param numberOfNode
     */
    public DijkstraGraph(int numberOfNode){
        this.numberOfNode = numberOfNode;
        graph = new int[numberOfNode+1][numberOfNode+1];
        spotsWhichHaveBeenVisited = new ArrayList<>();
    }

    /**
     * 3번 그래프를 만들기 위한 메소드
     * @param startNode
     * @param endNode
     * @param weight
     */
    public void put(int startNode, int endNode, int weight){
        graph[startNode][endNode] = graph[endNode][startNode] = weight;
    }

    public static void dijkstra(int startNode){
        boolean[] visited = new boolean[numberOfNode+1]; // 꼭지점을 지났는지 저장한다.
        int distance[] = new int[numberOfNode+1]; // 해당 꼭지점까지의 최단 경로를 저장한다.


        // distance값 초기화
        for(int i =1; i <= numberOfNode; i++){
            // 시작 노드는 distance = 0으로 시작한다.
            if(i != startNode){
                distance[i] = Integer.MAX_VALUE;
            }
        }
        // 시작 노드를 방문했다. (초기화)
        visited[startNode] = true;

        // 해당 노드에 방문한 적이 없고, 가중치가 0이 아닐 때 해당 노드의 가중치를 distance에 넣어준다.
        for(int i=1; i <= numberOfNode; i++){
            if(graph[startNode][i] != 0 && !visited[i]){
                distance[i] = graph[startNode][i];
            }
        }


        for(int a = 0; a < numberOfNode-1; a++){
            int[] visitedNode = new int[numberOfNode +1];
            Arrays.fill(visitedNode, -1);
            int visitedNodeIndex = 0;

            int min_value = Integer.MAX_VALUE; // 최소 가중치를 저장
            int node_index = -1; // 최소 가중치를 가진 노드를 저장할 변수

            for(int i = 1; i <= numberOfNode; i++){
                // 해당 노드를 방문하지 않고, 그 노드의 최단 경로가 아닐 때
                if(!visited[i] && distance[i] != Integer.MAX_VALUE){
                    if(distance[i] < min_value){
                        node_index = i;
                        min_value = distance[i];
                    }
                }
            }
            visited[node_index] = true;
            visitedNode[++visitedNodeIndex] = node_index;

            // 현재 위치의 가중치보다 다른 꼭지점을 지나서 온 가중치가 더 작을 경우에 그 값을 distance에 넣어준다.
            for(int i=1; i <= numberOfNode; i++){
                if(!visited[i] && graph[node_index][i] != 0){
                    if(distance[i] > distance[node_index] + graph[node_index][i]){
                        distance[i] = distance[node_index] + graph[node_index][i];
                        visitedNode[++visitedNodeIndex] = i;
                    }
                }
            }
            spotsWhichHaveBeenVisited.add(visitedNode);
        }

        int visitedNodeIndex = -1;
        System.out.print("시작점: " + nodeName(1) + " ");
        for(int node : spotsWhichHaveBeenVisited.get(0)){

            if(node != -1){
                System.out.print(nodeName(node) +" ");
                visitedNodeIndex = node;
            }

        }

        for(int nextVisited : spotsWhichHaveBeenVisited.get(visitedNodeIndex)){
            if(nextVisited != -1){
                System.out.print(nodeName(nextVisited)+" ");
            }
        }

    }

    public static String nodeName(int node){
        String returnNodeName ="";
        switch (node){
            case 1:
                returnNodeName = "a";
                break;
            case 2:
                returnNodeName = "b";
                break;
            case 3:
                returnNodeName = "c";
                break;
            case 4:
                returnNodeName = "d";
                break;
            case 5:
                returnNodeName = "e";
                break;
            case 6:
                returnNodeName = "f";
                break;
            case 7:
                returnNodeName = "g";
                break;
            case 8:
                returnNodeName = "z";
                break;
        }
        return returnNodeName;
    }

    public static void main(String[] args) {

        DijkstraGraph graph = new DijkstraGraph(8);
        // 그래프 그리기 1=a, 2=b, 3=c, 4=d, 5=e, 6=f, 7=g, 8=z
        graph.put(1,2,4);
        graph.put(1,3,3);
        graph.put(2,3,2);
        graph.put(2,4,5);
        graph.put(3,4,3);
        graph.put(3,5,6);
        graph.put(4,5,1);
        graph.put(4,6,5);
        graph.put(5,7,5);
        graph.put(6,7,2);
        graph.put(6,8,7);
        graph.put(7,8,4);
        dijkstra(1);


    }
}

