package divideAndConquer.stackAndQueues;


import java.util.Stack;

public class Fish {
    //O(N)
    public static int solution(int[] A, int[] B){

        if(A.length == 0)
            return 0;

        Stack<Integer> st = new Stack<>();
        int numAlive = A.length;

        for(int i=0; i<A.length; i++){

            if(B[i] ==1){
                st.push(A[i]);
            }

            if(B[i] ==0){
                while( !st.isEmpty() ){
                    if( st.peek() > A[i] ){
                        numAlive--;
                        break;
                    } else if(st.peek() < A[i]){
                        numAlive--;
                        st.pop();
                    }
                }
            }
        }

        return numAlive;
    }

    public static void main(String[] args){
        int[] A = {4,3,2,1,5};
        int[] B = {0,1,0,0,0};

        System.out.println(solution(A, B));
    }
}
