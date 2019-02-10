package sorting;

public class NumberOfDiscIntersections {
    public static int solution(int[] A){
        int result =0 ;
        int []dps = new int[A.length];
        int []dpe = new int[A.length];

        for(int i =0, t = A.length-1; i<A.length; i++){
            int s = i>A[i] ? i-A[i] : 0;
            int e = t-i>A[i]? i+A[i]: t;
            dps[s]++;
            dpe[e]++;
        }

        int t =0; //current "active" disc at each location
        for(int i = 0; i<A.length; i++){
            if(dps[i]> 0){
                result += t * dps[i];
                result += dps[i]*(dps[i]-1)/2;
                if(10000000 <result) return -1;
                t+=dps[i];
            }
            t -=dpe[i];
        }

        return result;
    }

    public static void main(String args[]){
        int []A = {1, 5, 2, 1, 4, 0};
        System.out.println(solution(A));

    }
}
