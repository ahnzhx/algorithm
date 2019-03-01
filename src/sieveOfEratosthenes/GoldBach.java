package sieveOfEratosthenes;

import java.util.ArrayList;
import java.util.Scanner;

public class GoldBach {
    public static final int MAX= 1000000;
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        boolean[] check = new boolean[MAX+1];
        ArrayList<Integer> prime = new ArrayList<>();
        check[0] = check[1] = true;
        for(int i =2 ; i*i <= MAX; i++ ){
            if(check[i] == true){
                continue;
            }
            prime.add(i); // 1000까지의 소수만 담긴다.
            for(int j = i+i; j <= MAX; j+=i){
                check[j] = true;
            }
        }

        while(true){
            int n = sc.nextInt();
            if(n==0){
                break;
            }
            for(int i = 1; i<prime.size(); i++){
                int p = prime.get(i);
                if(check[n-p] == false){
                    System.out.println(n+"="+p+"+"+(n-p));
                    break;
                }
            }
        }

    }
}
