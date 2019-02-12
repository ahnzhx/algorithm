package sieveOfEratosthenes;

public class CountSemiprimes {

    // O(N*log(log(N))+M)
    public static int[] solution(int N, int []P, int[] Q){
        int[] result = new int[P.length];
        int[] flags = new int[N+1];   // 0 : default
        int[] presum = new int[N+1];

        // 0 : prime
        // 1 : no prime
        // 2 : semi prime

        flags[0] = 1; // 1 : no prime
        flags[1] = 1; // 1 : no prime

        for (int i = 2; i*i <= N; i++) {
            if(flags[i] == 1)
                continue;
            int k = i*i;
            while(k <= N){
                flags[k] = 1;   // 1 : no prime
                k += i;      // next multiple
            }
        }

        for (int i = 2; i*i <= N; i++) {
            if(flags[i] == 1)
                continue;
            int k = i*i;
            while(k <= N){
                if(flags[i] == 0 && flags[k/i] == 0){
                    flags[k] = 2;   // 2 : semi prime
                }
                k += i;  // next multiple
            }
        }

        int semi_prime_counter = 0;
        for (int i = 2; i <= N; i++) {
            if(flags[i] == 2)
                semi_prime_counter++;
            presum[i] = semi_prime_counter;
        }

        for (int i = 0; i < P.length; i++) {
            result[i] = presum[Q[i]] - presum[P[i]-1];
        }
        return result;
    }

    public static void main(String []args){
        int[] p= {1,4,16};
        int[] q = {26,10,20};
        int n = 26;
        System.out.println(solution(n,p, q));

    }
}
