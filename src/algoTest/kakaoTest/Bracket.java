package algoTest.kakaoTest;

import java.util.Stack;

public class Bracket {
    public static int solution(String s) {
        // Write your code here
        int answer =0;
        char[] sCharArr = s.toCharArray();
        Stack<Character> resultStack = new Stack<>();
        for(char ch : sCharArr){
            if(ch == '('){
                popAndPush(resultStack, ch);
            }else{
                popAndPush(resultStack, ch);
            }
        }


        return resultStack.size();
    }
    private static void popAndPush(Stack<Character> s, Character ch){
        if(!s.isEmpty() && s.peek() == '(' && ch == ')'){
            s.pop();
        }else if(s.isEmpty() || s.peek() == ch || ch == '('){
            s.push(ch);
        }

    }

    public static void main(String[] args) {
       String p = "()))))))))))))))))))))))()()))()))))))))()))))))()))()))))(()))))))))))))()))))))(()))))))))()()))))))))))))()))))(())()))))))(()))))()))))))()))()())))())))))))))))()))())(()()())()()())))))()))))())()))()))))))))))))))()())))()))" +
               "))()))))))()))())()))())))(()))()))))))))())))())))(())()))))()((()))))))((((()())())())(())))))())())))))))())))))()(()))))()))))())))))()())())()))()))))))))()))))))))))()))))())))))(((()))))()))((())))())))))))())))()()())())))))())))())())))))(())())))))))())))()()))))))))))))(())())())))((()))))))(())))()())))()))))(())))(())))))))))))))(())))(())()))))(()))())())))))))()())(()(())())))))))))))))))))))))))((()())))())))())))((()())))()))())()))))())()())))))))))))(()))))))))))))))()))))))()))))))))))))))))(()(()))(()))()))))))()))()()))))))))))()))())()))))())))()()()))()))))(())))))))))))))()()))))(())))()))))))()))()())()))())()())())))()()(()())))))()())))))))())))())))(())))())))))))()))))))))()((()(())))))))))(())))())))())))))))))()())))()))))))))(";

       System.out.println(solution(p));
    }
}
