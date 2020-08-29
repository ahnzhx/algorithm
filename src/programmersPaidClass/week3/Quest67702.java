package programmersPaidClass.week3;

public class Quest67702 {
    public int solution(String begin, String target, String[] words) {
        int answer =0 ;
        while(!begin.equals(target)){
            for(String word : words){
                char[] beginArr = begin.toCharArray();
                int count = 0;
                for(int i =0; i< beginArr.length; i++){

                    char[] wordArr = word.toCharArray();
                    if(beginArr[i] == wordArr[i]){
                        count++;
                    }
                    if(count == beginArr.length-1){
                        answer++;
                        begin = word;
                    }

                }
            }

            break;
        }
        return answer;
    }
}
