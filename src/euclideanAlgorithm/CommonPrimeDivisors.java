package euclideanAlgorithm;

public class CommonPrimeDivisors {

    // O(Z * log(max(A) + max(B)) ** 2 )
    public static int solution(int[] A, int[] B) {
        int count = 0;
        for(int i = 0; i < A.length; i++) {
            if(hasSamePrimeDivisors(A[i], B[i])){
                count++;
            }
        }
        return count;
    }

    public static int gcd(int a, int b) {
        if(a % b == 0) return b;
        return gcd(b,a % b);
    }

    public static boolean hasSamePrimeDivisors(int a, int b) {
        int gcdValue = gcd(a, b); // 15
        int gcdA;
        int gcdB;
        while(a != 1){
            gcdA = gcd(a, gcdValue);
            if(gcdA == 1)
                break;
            a = a / gcdA;
        }
        if( a != 1)
            return false;

        while(b != 1) {
            gcdB = gcd(b, gcdValue);
            if( gcdB == 1 )
                break;
            b = b / gcdB;
        }
        return b == 1;
    }

    public static void main(String []args){
        int []a = {15,10,3};
        int []b = {75,30,5};
        System.out.println(solution(a,b));
    }
}
