import java.util.LinkedList;
import java.util.Stack;

public class BasicCalculator {
    Stack<String> stack ;
    public int calculate(String s) {
        char[] sArr = s.toCharArray();
        stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for(char el: sArr){
            switch(el){
                case ')':
                    if(sb.length() >0){
                        stack.push(sb.toString());
                        sb = new StringBuilder();
                    }
                    subCalculate(stack);
                    break;
                case ' ':
                    break;
                case '-':
                case '+':
                case '(':
                    if(sb.length() >0){
                        stack.push(sb.toString());
                    }
                    stack.push(Character.toString(el));
                    sb = new StringBuilder();
                    break;
                default:
                    sb.append(el);
//                    stack.push(Character.toString(el));
            }
        }
        if(sb.length() >0){
            stack.push(sb.toString());
        }
        subCalculate(stack);

        return Integer.parseInt(stack.pop());
    }

    public void subCalculate(Stack<String> stack){
        LinkedList<String> q = new LinkedList<>();
        while(!stack.peek().equals("(") ){
            q.addFirst(stack.pop());
            if(stack.isEmpty()){
                break;
            }
        }
        if(stack.size() > 0){
            if(stack.peek().equals("(")){
                stack.pop();
            }
        }

        int ret =0;

        while(!q.isEmpty()){
            switch(q.peekFirst()){
                case "-":
                    q.pollFirst();
                    ret -= Integer.parseInt(q.pollFirst());
                    break;
                case "+":
                    q.pollFirst();
                default:
                    ret += Integer.parseInt(q.pollFirst());
                    break;
            }
        }
        stack.push(String.valueOf(ret));
    }
}
