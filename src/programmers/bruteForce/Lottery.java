package programmers.bruteForce;

import java.util.ArrayList;
import java.util.Scanner;


public class Lottery {
//로직 이해안감..
    static ArrayList<Integer> lotto = new ArrayList<>();

    static void solve(int[] a, int index, int cnt){
        if(cnt == 6){
            for (int num: lotto)
                System.out.print(num+" ");
            System.out.println();
        //return 을 만나면 메서드는 종료된다. 6,6을 종료하고 5,5 로 감
            return ;
        }

        int n = a.length;
        if(n == index) return ;


        lotto.add(a[index]);
        // return ; 하면 메소드 호출 자리로 돌아감
        solve(a, index+1, cnt+1);
        lotto.remove(lotto.size()-1);
        solve(a, index+1, cnt);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            int n = sc.nextInt();
            if(n == 0) break;
            int[] a = new int[n];
            for(int i =0; i<n; i++)
                a[i] = sc.nextInt();

            solve(a, 0,0);
            System.out.println();
        }
    }


}
