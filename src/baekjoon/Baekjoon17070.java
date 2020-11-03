package baekjoon;

import java.util.*;

public class Baekjoon17070 {
    static int N;
    class Pipe {
        private int x;
        private int y;

        public Pipe(int x, int y){
            this.x = x;
            this.y = y;
        }

        public void right(int x, int y){
            this.x = x;
            this.y = y+ 1;
        }

        public void down(int x, int y){
            this.x = x+1;
            this.y = y;
        }
        public void rightCross(int x, int y){
            this.x = x + 1;
            this.y = y + 1;
        }

        public boolean isAllowed(){
            int[] x = new int[]{0, 1, 1};
            int[] y = new int[]{1, 0, 1};

            for(int i = 0; i < 3; i++){
                if(this.x + x[i] > N-1) return false;
                if(this.y + y[i] > N-1) return false;
            }
            return true;
        }
    }
    public static int solution(int[][] newHouse){
        boolean[][] visited = new boolean[N][N];
        visited[0][0] = true;
        visited[0][1] = true;
        // 이전 파이프도 체크해줘야 함

        for(int i =0 ; i < N; i++){
            for(int j = 1; j < N; j++){

            }
        }

        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        int[][] newHouse = new int[N][N];
        for(int i = 0 ; i < N; i++){
            for(int j = 0 ; j < N; j++){
                newHouse[i][j] = sc.nextInt();
            }
        }

        System.out.println(solution(newHouse));
    }
}
