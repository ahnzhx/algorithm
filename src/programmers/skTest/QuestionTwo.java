package programmers.skTest;

import java.util.Arrays;
import java.util.Stack;

public class QuestionTwo {
    private static class Node {
        int number;
        int sum;
        int depth;
        Node parent;
        Node() {}
        Node(int number, int depth) {
            this.number = number;
            this.depth = depth;
            this.parent = null;
            this.sum = number;
        }
        Node(int number, int depth, Node parent) {
            this.number = number;
            this.depth = depth;
            this.parent = parent;
            this.sum = this.number + parent.sum;
        }
    }

    public int[] solution(int[] A, int F, int M ){
        int[] answer = new int[F];

        int total = M * (A.length + F);
        int sum = Arrays.stream(A).sum();
        if(total < sum) return new int[]{0};

        int target = total - sum;
//        System.out.println(target);

        boolean[][] visited = new boolean[F + 1][7];
        Stack<Node> stack = new Stack<>();
        int depth = 0;

        for(int i = 1; i <= 6; i++) {
            if(i == 1) depth++;
            stack.push(new Node(i, depth));
        }


        while(!stack.isEmpty()) {
            Node node = stack.pop();
            visited[node.depth][node.number] = true;
//            System.out.println(String.format("깊이: %d, 노드: %d 방문!", node.depth, node.number));

            if(node.depth < F) {
                for(int i = 1; i <= 6; i++) {
                    if(node.depth == F - 1 && node.sum + i == target) {
                        Node n = node;
                        int idx = 0;
                        answer[idx] = i;
                        while (true) {
                            answer[++idx] = n.number;
                            if(n.parent == null) break;
                            n = n.parent;
                        }
                        return answer;
                    }

                    if(node.sum + i < target && target - (node.sum + i) >= F - node.depth - 1) {
                        stack.push(new Node(i, node.depth+1, node));
                    }
                }
            }
        }

        return Arrays.stream(answer).allMatch(a -> a == 0) ? new int[]{0} : answer;
    }


    public static void main(String[] args) {
        int[] a = new int[]{3,2,4,3}; // 6 6
        int[] b = new int[]{1,5,6}; // 2,1,2,4    6,1,1,1
        int[] c = new int[]{1,2,3,4}; // 0
        int[] d = new int[]{6,1}; // 0
        System.out.println(Arrays.toString(new QuestionTwo().solution(a, 2, 4)));
        System.out.println(Arrays.toString(new QuestionTwo().solution(b, 4, 3)));
        System.out.println(Arrays.toString(new QuestionTwo().solution(c, 4, 6)));
        System.out.println(Arrays.toString(new QuestionTwo().solution(d, 1, 1)));
    }
}
