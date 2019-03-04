package programmers.bruteForce;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class MaximizeDifference {
    public static boolean next_permutation(int []a){
        int i = a.length-1;
        while(i>0&& a[i] <= a[i-1])
            i-=1;
        if(i <=0) return false;
        int j = a.length-1;
        while(a[j] <= a[i-1])
            j-=1;

        int temp = a[j];
        a[j] = a[i-1];
        a[i-1] = a[j];

        while(i<j){
            temp = a[j];
            a[j] = a[i-1];
            a[i-1] = temp;
            i+=1;
            j-=1;
        }
        return true;
    }

    public static int calculate(int a[]){
        int sum = 0;
        for(int i =1; i<a.length; i++){
            sum+=Math.abs(a[i]-a[i-1]);
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []a = new int[n];
        for(int i =0; i<n; i++)
            a[i] = sc.nextInt();

        Arrays.sort(a);// 첫시작은 오름차순이니까

        int ans = 0;
        do{
            int temp = calculate(a);
            ans = Math.max(ans, temp);
        }while(next_permutation(a));
        System.out.println(ans);

    }
}
