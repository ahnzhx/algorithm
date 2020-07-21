package dynamicProgramming;

public class IntegerTriangle {
    public int solution(int[][] triangle) {
        //1. 기본값 초기화
        int[][] sumOfTriangle = new int[triangle.length][triangle.length];
        sumOfTriangle[0][0] = triangle[0][0];
        for(int i = 1; i < triangle.length; i++) {
            sumOfTriangle[i][0] = sumOfTriangle[i - 1][0] + triangle[i][0];
            sumOfTriangle[i][i] = sumOfTriangle[i - 1][i - 1] + triangle[i][i];
        }

        // 2. 동적계획법 //
        for(int i = 2; i < triangle.length; i++)
            for(int j = 1; j < i; j++)
                sumOfTriangle[i][j] = Math.max(sumOfTriangle[i - 1][j - 1], sumOfTriangle[i - 1][j]) + triangle[i][j];

        // 3. 최대값 반환 //
        int max = 0;
        for(int i = 0; i < sumOfTriangle.length; i++)
            max = Math.max(max, sumOfTriangle[sumOfTriangle.length - 1][i]);

        return max;
    }

    public static void main(String[] args) {
        int[][] triangle = new int[][]{{7}, {3,8}, {8,1,0}, {2,7,4,4}, {4,5,2,6,5}};
        System.out.println(new IntegerTriangle().solution(triangle));
    }
}
