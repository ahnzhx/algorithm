package programmers.naverTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BoxingRanking {
    static int INF = 987654321; // 방문 불가를 뜻함
    public static int solution(int n, int[][] results) {
        int answer = 0;
        int[][] winOrLose = new int[n+1][n+1];
        //배열 초기화
        for(int[] score: winOrLose){
            Arrays.fill(score, INF);
        }

        // 대각선을 0
        for(int i =0; i<= n ; i++){
            winOrLose[i][i] =0;
        }

        // 한방향 그래프 win -> lose
        for(int[] result: results){
            winOrLose[result[0]][result[1]] = 1;
        }

        //winOrLose[i][j]로 가는 최단경로 저장
        for(int k =1; k<=n; k++){
            for(int i =1; i<= n; i++){
                for(int j =1; j <= n; j++){
                    if(winOrLose[i][j] > winOrLose[i][k] + winOrLose[i][k]){
                        winOrLose[i][j] = winOrLose[i][k] + winOrLose[k][j];
                    }
                }
            }
        }

        // 선수들이 게임을 한 적이 있는지 확인
        boolean[] flag = new boolean[n+1];
        Arrays.fill(flag, true);
        for(int i =1; i<= n; i++){
            for(int j =1 ; j<= n; j++){
                if(i == j) continue;
                if(winOrLose[i][j] == INF && winOrLose[j][i] == INF){
                    flag[i] = false;
                    break; // 모두와 게임해야 하므로
                }
            }
        }


        for(int i=1; i<flag.length ; i++)
            if(flag[i]) answer++;

        return answer;
    }

    public static void main(String[] args) {
        int[][] results = {{4,3}, {4,2}, {3,2}, {1,2}, {2,5}};
        int[][] results2 = {{1,2}, {2,3}, {3,4}, {5,6}, {6,7},{7,8},{4,5}};
        System.out.println(solution(8,results2));
    }
}
