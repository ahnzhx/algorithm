package algoTest.naverTest;

public class TargetNumber {
    public static int solution(int[] numbers, int target) {
        int answer = 0;
        answer = dfs(numbers, 0, 0, target);
        return answer;
    }

    private static int dfs(int[] numbers, int node, int sum, int target){
        if(node == numbers.length){
            if(sum == target)
                return 1;
            return 0;
        }
        return dfs(numbers, node+1, sum + numbers[node], target)
                + dfs(numbers, node+1, sum - numbers[node], target);
    }

    public static void main(String[] args) {
        int target = 3;
        int numbers[] = {1,1,1,1,1};
        System.out.println(solution(numbers, target));
    }
}
