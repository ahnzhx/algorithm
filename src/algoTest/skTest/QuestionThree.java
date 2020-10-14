package algoTest.skTest;

public class QuestionThree {
    public int solution(String S){
        // A가 몇개 있는지 세기
        int count = 0;
        for(char letter : S.toCharArray()){
            if(letter == 'a'){
                count++;
            }
        }

//        if(count <3  && count > 0){
//            return 0;
//        }else if(count % 3 == 0){
//            for(int i =0 ; ){
//
//            }
//        }
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(new QuestionThree().solution("babaa"));
        System.out.println(new QuestionThree().solution("ababa"));
        System.out.println(new QuestionThree().solution("aba"));
        System.out.println(new QuestionThree().solution("bbbbb"));
    }
}
