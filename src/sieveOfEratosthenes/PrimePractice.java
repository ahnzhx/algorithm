package sieveOfEratosthenes;

import java.util.ArrayList;
import java.util.Scanner;

public class PrimePractice {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        while(true){
            int m = sc.nextInt();
            int n = sc.nextInt();
            if(m>n) break;
            boolean[] check = new boolean[n+1];
            ArrayList<Integer> prime = new ArrayList<>();
            check[0] = check[1] = true;
            for(int i =2 ; i <= n; i++){
                if(check[i] == true){
                    continue;
                }
                prime.add(i);
                for(int j = i+i; j <= n; j+= i){
                    check[j] = true;
                }
            }

                for(int i = 0 ; i< prime.size(); i++){
                    int p = prime.get(i);
                    if(p < m)
                        continue;
                    else{
                        System.out.println(p);

                    }
            }
            break;
        }

    }
}
