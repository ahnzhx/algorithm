package programmers.dynamicProgramming;

public class Quest43105 {
    public int solution(int[][] triangle) {
        int[][] sumOfTriangle = new int[triangle.length][triangle.length];
        sumOfTriangle[0][0] = triangle[0][0];
        for(int i = 1; i < triangle.length; i++){
            sumOfTriangle[i][0] = sumOfTriangle[i - 1][0] + triangle[i][0];
            sumOfTriangle[i][i] = sumOfTriangle[i - 1][i - 1] + triangle[i][i];
        }

        for(int i =2 ; i< triangle.length; i++){
            for(int j =1; j < i; j++){
                sumOfTriangle[i][j] =  Math.max(sumOfTriangle[i-1][j-1], sumOfTriangle[i - 1][j]) + triangle[i][j];
            }
        }

        int max = 0;
        for(int i =0 ; i < sumOfTriangle.length; i++){
            max = Math.max(max, sumOfTriangle[sumOfTriangle.length-1][i]);
        }
        return max;
    }
}
