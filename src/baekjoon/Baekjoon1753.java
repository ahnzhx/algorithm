package baekjoon;

import java.util.*;

//TODO: 자료형 바꾸기
public class Baekjoon1753 {
//    static int INF = 100000000;
//    static List<List<Node>> list;
//    static int d[];    //최단 거리
//
//    public static class Node implements Comparable<Node>{
//        int index; // 이어지는 선
//        int distance; // 2 가중치
//
//        Node(int index, int distance) {
//            this.index = index;
//            this.distance = distance;
//        }
//
//        @Override
//        public int compareTo(Node o) {
//            return distance <= o.distance ? -1 : 1;
//        }
//    }
//
//    public static void solution(int start) {
//        PriorityQueue<Node> pq = new PriorityQueue<>();
//
//        d[start] = 0;
//        pq.offer(new Node(start, d[start]));
//
//        while(!pq.isEmpty()) {
//            Node p = pq.poll();
//            int current = p.index;
//            int distance = p.distance;
//
//            if(d[current] < distance)
//                continue;
//            for(int i=0; i<list[current].size(); i++) {
//                int next = list[current].get(i).index;
//                int nextDistance = distance + list[current].get(i).distance;
//
//                if(nextDistance < d[next]) {
//                    d[next] = nextDistance;
//                    pq.offer(new Node(next, nextDistance));
//                }
//            }
//
//        }
//    }
//    public static void main(String[] args) throws Exception {
//        Scanner sc = new Scanner(System.in);
//        int node_num = sc.nextInt();    // 정점의 개수
//        int edge = sc.nextInt();    // 간선의 개수
//        int start = sc.nextInt();     // 시작 정점 번호
//
//        list = new ArrayList<>();
//        d = new int[node_num+1];
//
//        // 변수 초기화
//        Arrays.fill(d, INF);
//        for(int i = 1; i <= node_num; i++) {
////            list[i] = new ArrayList<>();
//        }
//
//        // 출발 노드, 도착 노드, 간선 가중치 입력
//        for(int i=0; i< edge; i++) {
//            list[sc.nextInt()].add(new Node(sc.nextInt(), sc.nextInt()));
//        }
//
//        solution(start);
//
//        for(int i=1; i <= node_num; i++) {
//            if(d[i] == INF)
//                System.out.println("INF");
//            else
//                System.out.println(d[i]);
//        }
//    }
}
