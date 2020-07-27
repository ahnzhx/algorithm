package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Backjoon1149 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // 집이 몇개

        int[][] houseColorValue = {{26,40,83}, {49,60,57},{13,89,99}}; // 집을 칠하는 비용
        int[][] totalMinValue = new int[t][3];


        for(int i =0; i< t; i++){
            for(int k =0; k<t; k++){
                houseColorValue[i][k] = scanner.nextInt();
            }
        }

        totalMinValue[0][0] = houseColorValue[0][0];
        totalMinValue[0][1] = houseColorValue[0][1];
        totalMinValue[0][2] = houseColorValue[0][2];

        for(int j =1 ; j < t; j++){
                totalMinValue[j][0] = Math.min(totalMinValue[j-1][1], totalMinValue[j-1][2]) + houseColorValue[j][0];
                totalMinValue[j][1] = Math.min(totalMinValue[j-1][0], totalMinValue[j-1][2]) + houseColorValue[j][1];
                totalMinValue[j][2] = Math.min(totalMinValue[j-1][0], totalMinValue[j-1][1]) + houseColorValue[j][2];
        }
        System.out.println(Math.min(Math.min(totalMinValue[t-1][0],totalMinValue[t-1][2]),totalMinValue[t-1][2]));
    }
}
