package divideAndConquer.stackAndQueues;

import java.util.Stack;

public class Nesting {

    //O(N)
    public static int solution(String S){
        Stack<Character> st = new Stack<>();

        for(Character c: S.toCharArray()){
            if(c == ')'){
                pops(st, '(');
            }else{
                st.push(c);
            }
        }

        return st.isEmpty()? 1: 0;
    }

    private static void pops(Stack<Character> st, Character c){
        while(!st.isEmpty() && st.peek() != c){
            st.pop();
        }
        if(!st.isEmpty()){
            st.pop();
        }else{
            st.push(c);
        }
    }

    public static void main(String []args){
        String s1 = "(()(())())";
        String s2 = "())";
        System.out.println(solution(s1));
        System.out.println(solution(s2));
    }
}
