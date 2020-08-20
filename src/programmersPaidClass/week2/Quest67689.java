package programmersPaidClass.week2;

public class Quest67689 {
    public boolean solution(String s) {

        int stack= 0;
        for(char ch : s.toCharArray()){
            if(ch == '(') stack ++;
            else {
                if(stack == 0) return false;
                stack--;
            }
        }
        return stack == 0;
    }
}
