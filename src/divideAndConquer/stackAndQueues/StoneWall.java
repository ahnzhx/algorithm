package divideAndConquer.stackAndQueues;

import java.util.Stack;

public class StoneWall {
    //O(N)
    public static int solution(int[] H) {
        Stack<Integer> stack = new Stack<>();
        int count = 1;

        stack.push(H[0]);

        for (int i = 1; i < H.length; i++) {
            if (stack.empty()) {
                stack.push(H[i]);
                count++;
            }
            if (H[i] > stack.peek()) {
                stack.push(H[i]);
                count++;
            }
            while (H[i] < stack.peek()) {
                stack.pop();
                if (stack.empty()) {
                    stack.push(H[i]);
                    count++;
                } else if (H[i] > stack.peek()) {
                    stack.push(H[i]);
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String []args){
        int [] H = {8,8,5,7,9,8,7,4,8};
        System.out.println(solution(H));
    }
}
