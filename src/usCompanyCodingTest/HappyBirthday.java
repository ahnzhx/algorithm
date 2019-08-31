package usCompanyCodingTest;

public class HappyBirthday {
    /**
     * 14 글자를 출력할 수 있는 전광판에 happy-birthday라는 문구를 지나가게 하려 합니다. 이때, 문구는 다음 규칙에 따라 화면을 지나갑니다.
     *
     * 전광판은 화면에 14자 글자를 출력합니다.
     * 문구는 1초에 왼쪽으로 한 칸씩 움직입니다.
     * 문구 이외의 부분은 _로 표시됩니다.
     * 처음에는 문구를 보여주지 않습니다. 즉, 처음엔 ______________를 보여줍니다.
     * 전광판은 설정한 문구를 화면에 반복해 출력합니다.
     * 전광판은 문구가 다 지나가면 설정한 문구를 반복해 보여줍니다.
     * 예를 들어, 처음에는 화면에 "______________"가 보입니다.
     * 3초 뒤에는 화면에 "___________hap"가 보입니다.
     * 14초 뒤에는 화면에 "happy-birthday"가 보입니다.
     * 20초 뒤에는 화면에 "birthday_____"가 보입니다.
     * 28초 뒤에는 모든 문자열이 지나간 후 "______________"가 보입니다.
     * 29초 뒤에는 다시 첫 번째 문자부터 나타나며, "_____________h"가 보입니다.
     * 문구를 담은 문자열 phrases와 초를 담은 second가 매개변수로 주어질 때, s초가 지난 후 화면에 보이는 문자열을 출력하도록 solution 함수를 작성해 주세요.
     *
     * 제한 조건
     * 문구를 담은 문자열 phrases와 초를 담은 second가 주어집니다.
     *
     * phrases는 happy-birthday입니다.
     * second는 1 이상 10,000 이하인 자연수입니다.
     * 입출력 예
     * phrases	second	return
     * happy-birthday	3	___________hap
     * 초기 상태 ______________에서 3초가 지나면 화면에는 세 글자가 지나가 ___________hap가 보입니다.
     *
     *
     *
    * 런타임 에러로 0점,,
    */
    public static String solution(String phrases, int second) {
        String answer = "";
        int phrasesLength = phrases.length();
        char boardPhrases[] = phrases.toCharArray();
        char boardUnderbar[] = new char[phrasesLength];
        char answerArray[] = new char[phrasesLength];

        for(int i =0; i < phrasesLength; i++){
            boardUnderbar[i] = '_';
        }
        for(int i =0; i < phrasesLength; i++){
            boardPhrases[i] = phrases.charAt(i);
        }

        for(int i =0 ; i<phrasesLength-second; i++){
            answerArray[i] = boardUnderbar[i];
        }
        for(int i =0 ; i<second ; i++){
            answerArray[phrasesLength-second+i] = boardPhrases[i];
        }
        answer = String.valueOf(answerArray);
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("happy-birthday", 3));
    }


}
