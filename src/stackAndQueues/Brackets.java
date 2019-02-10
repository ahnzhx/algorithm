package stackAndQueues;

import java.util.Stack;

public class Brackets {
    public static int solution(String s){
        Stack<Character> stack = new Stack<>();
        if(null == s){
            return 0;
        }else if(s.isEmpty()){
            return 1;
        }
        for(Character C : s.toCharArray()){
            switch (C){
                case ')':
                    pops(stack, '(');
                    break;
                case '}':
                    pops(stack, '{');
                    break;
                case ']':
                    pops(stack, '[');
                    break;
                default:
                    stack.push(C);
                    break;

            }
        }
        return stack.isEmpty() ? 1: 0;
    }

    private static void pops(Stack<Character> s, Character C){
        while(!s.isEmpty() && s.peek() != C){
            s.pop();
        }
        if(!s.isEmpty()){
            s.pop();
        }else{
            s.push(C);
        }
    }

    public static void main(String []args){
        String s = "{[()()]}";
        String j = "([)()]";
        System.out.println(solution(s));
        System.out.println(solution(j));
    }


}
