package baekjoon;

import java.util.*;

public class test{
    public boolean solution(String S) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);

            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            }
            else {
                if (stack.isEmpty()) {
                    return true;
                }

                char lastC = stack.pop();

                if (c == ')' && lastC != '(') {
                    return false;
                }

                if (c == '}' && lastC != '{') {
                    return false;
                }

                if (c == ']' && lastC != '[') {
                    return false;
                }
            }
        }

        if (!stack.isEmpty()) {
            return false;
        }

        return true;
    }

    public boolean isValid(String brackets){
        Stack<Character> stack = new Stack<>();
        char[] bracketArr = brackets.toCharArray();

        for(Character br :bracketArr){
            if(br == '(' || br == '{' || br == '['){
                stack.push(br);
            }else{
                if(stack.isEmpty()){
                    return true;
                }

                char closeBr = stack.pop();
                if (br == ')' && closeBr != '(') {
                    return false;
                }
                if (br == '}' && closeBr != '{') {
                    return false;
                }
                if (br == ']' && closeBr != '[') {
                    return false;
                }
            }
        }

        if(!stack.isEmpty()){
            return false;
        }
        return true;
    }

}
