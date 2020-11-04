package baekjoon;

import java.util.Scanner;

// Todo: 이해해야함
public class Baekjoon17070 {
    static int N;
    static int[] dx = { 0, 1, 1 };
    static int[] dy = { 1, 1, 0 };
    static int[][] map;
    static int[][][] cache;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        map = new int[N][N];
        cache = new int[N][N][3];
        for (int i = 0; i < N; i++)
            for (int j = 0; j < N; j++) {
                map[i][j] = sc.nextInt();
                for(int k = 0; k < 3; k++)
                    cache[i][j][k] = -1;
            }
        System.out.println(solve(0, 0, 1));
        sc.close();
    }

    static int solve(int prev, int x, int y) {
        if (x >= N || y >= N || map[x][y] == 1 || !canMove(prev,x,y))
            return 0;
        if (x == N - 1 && y == N - 1)
            return 1;
        if (cache[x][y][prev] != -1)
            return cache[x][y][prev];
        cache[x][y][prev] = 0;
        for (int i = 0; i < 3; i++) {
            if ((prev == 0 && i == 2) || (prev == 2 && i == 0))
                continue;
            cache[x][y][prev] += solve(i, x + dx[i], y + dy[i]);
        }
        return cache[x][y][prev];
    }

    static boolean canMove(int prev, int x, int y) {
        if (prev == 0 || prev == 2)
            return map[x][y] == 0;
        if (prev == 1)
            return map[x][y] == 0 && map[x - 1][y] == 0 && map[x][y - 1] == 0;
        return false;
    }
}
