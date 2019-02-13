package euclideanAlgorithm;

public class ChocolatesByNumbers {

    // O(log(N + M))
    public static int solution(int N, int M){
        return N / gcd(N, M);
    }

    public static int gcd(int n, int m){
        if(n % m == 0)
            return m;
        else
            return gcd(m, n % m);
    }

    public static void main(String []args){
        System.out.println(solution(50, 6));
    }

}
