package algoTest.hyperConnect;

import java.util.*;

public class Brackets {
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
