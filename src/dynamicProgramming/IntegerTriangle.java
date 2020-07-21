package dynamicProgramming;

public class IntegerTriangle {
    public int solution(int[][] triangle) {

        int[][] sumOfTriangle = new int[triangle.length][triangle.length];
        sumOfTriangle[0][0] = triangle[0][0];
        for(int i = 1; i<triangle.length ; i++){
            sumOfTriangle[i][0] = sumOfTriangle[i-1][0] + triangle[i][0];
            sumOfTriangle[i][i] = sumOfTriangle[i-1][i-1] + triangle[i][i];
        }

        for(int i =2; i<triangle.length; i++ ){
            for(int j = 1; j < triangle[i].length-1; j++ ){
                sumOfTriangle[i][j] = Math.max(sumOfTriangle[i-1][j-1], sumOfTriangle[i-1][j]) + triangle[i][j];
            }
        }

        int max =0;
        for(int i =0; i<triangle.length ; i++){
            max = Math.max(sumOfTriangle[triangle.length-1][i], max);
        }

        return max;
    }

    public static void main(String[] args) {
        int[][] triangle = new int[][]{{7}, {3,8}, {8,1,0}, {2,7,4,4}, {4,5,2,6,5}};
        System.out.println(new IntegerTriangle().solution(triangle));
    }
}
