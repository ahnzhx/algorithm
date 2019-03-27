package programmers.dfsAndBfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * 벽 부수고 이동하기
 *
 * N*M의 행렬로 나타내는 지도에서 (1,1)에서 (N,M)으로 최단거리 이동문제
 * 0은 빈 칸, 1은 벽 (단, 벽은 한 번 부수고 지나갈 수 있다.)
 *
 * 벽을 부순다는 조건이 없으면 일반적인 미로탐색 문제이다.
 * 어떤 칸에 방문했을 때, 벽을 부순 적이 있는 경우와 아직 부순 적이 없는 경우는 다른 경우이기 때문에
 * 상태 (i,j) 대신에 (i,j,k) ( k == 0 이면 벽을 부순적이 없음, 1이면 있음) 으로
 * BFS 탐색을 진행한다.
 * */

class PairWithThree{
    int x, y, z;
    PairWithThree(int x, int y, int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
}

public class BreakingWalls {
    public static int[] dx = {1, -1, 0,0};
    public static int[] dy = {0,0,1,-1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();
        int[][] a = new int[n][m];
        int[][][] d = new int[n][m][2];
        for(int i =0; i<n; i++){
            String s =sc.nextLine();
            for(int j =0; j <m; j++)
                a[i][j] = s.charAt(j)-'0';
        }

        d[0][0][0] = 1;
        Queue<PairWithThree> q = new LinkedList<>();
        q.offer(new PairWithThree(0,0,0));
        while(!q.isEmpty()){
            PairWithThree p = q.remove();
            int x = p.x;
            int y = p.y;
            int z = p.z;
            for(int k =0; k<4; k++){
                int nx= x+dx[k];
                int ny = y+dy[k];
                if(nx <0 || nx >= n || ny <0 ||ny>=m)
                    continue;

                if(a[nx][ny] ==0 && d[nx][ny][z] ==0){
                    d[nx][ny][z] = d[x][y][z] +1;
                    q.offer(new PairWithThree(nx, ny,z));
                }
                if(z ==0 && a[nx][ny]==1 && d[nx][ny][z+1] == 0){
                    d[nx][ny][z+1] = d[x][y][z]+1;
                    q.offer(new PairWithThree(nx, ny, z+1));
                }
            }
        }

        if(d[n-1][m-1][0] != 0 && d[n-1][m-1][1] != 0)
            System.out.println(Math.min(d[n-1][m-1][0], d[n-1][m-1][1]));
        else if(d[n-1][m-1][0] != 0)
            System.out.println(d[n-1][m-1][0]);
        else if(d[n-1][m-1][1] != 0)
            System.out.println(d[n-1][m-1][1]);
        else
            System.out.println(-1);
    }

}
