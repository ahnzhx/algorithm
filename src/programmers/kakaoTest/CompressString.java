package programmers.kakaoTest;

public class CompressString {
    public static int solution(String s) {
        String dupChkStr = ""; //중복 검사를 위한 문자열
        String resultStr = ""; //중복검사를 거친 결과값 문자열을 저장할 공간
        int dupCount = 1; //중복횟수

        int strLength = s.length();//문자열의 길이
        int resultCount = strLength;//반환할 최종 길이

        //s/2의 몫 갯수만큼 쪼개서 사용합니다.
        for (int i = 1; i <= strLength / 2; i++) {
            //i개씩 j개덩어리로 잘라냅니다.
            for (int j = 1; j <= strLength / i; j++) {
                //이전에 계산했던 값과 일치하는지 확인합니다.
                if (dupChkStr.equals(s.substring((j - 1) * i, j * i))) {
                    dupCount++;
                } else {
                    if (dupCount > 1) {
                        resultStr += Integer.toString(dupCount);
                        dupCount = 1;
                    }
                    resultStr += s.substring((j - 1) * i, j * i);
                }
                dupChkStr = s.substring((j - 1) * i, j * i);
            }
            //나머지 처리
            if (dupCount > 1) {
                resultStr += Integer.toString(dupCount);
                dupCount = 1;
            }
            if (strLength % i != 0)
                resultStr += s.substring(strLength - strLength % i, strLength);

            //만약 다른수로 쪼갰을 때의 길이보다 작다면
            if (resultStr.length() < resultCount) {
                resultCount = resultStr.length();
            }
            resultStr = "";
        }
       return resultCount;
    }


    public static void main(String[] args) {
       String str1 = "aabbaccc"	;
        String str2 ="ababcdcdababcdcd"	;
        String str3 ="abcabcdede";
        String str4 ="abcabcabcabcdededededede"	;
        String str5 ="xababcdcdababcdcd";

        System.out.println(solution(str2));
//        System.out.println(solution(str2));
//        System.out.println(solution(str3));
//        System.out.println(solution(str4));
//        System.out.println(solution(str5));

    }
}
