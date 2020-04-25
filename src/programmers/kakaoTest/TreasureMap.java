package programmers.kakaoTest;

import java.text.DecimalFormat;

public class TreasureMap {
    public static String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        // 보물지도 사이즈 체
        int k = 0;

        for(int i =0; i<arr1.length; i++){
            StringBuffer sb = new StringBuffer();

            String binaryString1 = Integer.toBinaryString(arr1[i]);
            String s1 = String.format("%" + n +"s",Integer.parseInt(binaryString1));
            String binaryString2 = Integer.toBinaryString(arr2[i]);
            String s2 = String.format("%" + n +"s",Integer.parseInt(binaryString2));
            k = 0;
            while(k < n){
                if(s1.charAt(k) == '1' || s2.charAt(k) == '1'){
                    sb.append("#");
                }else{
                    sb.append(" ");
                }
                k++;
            }
            answer[i] = sb.toString();
        }
        return answer;

    }

    // 해답 ,,대단,, 내꺼는 75점임
    public static String[] solution2(int n, int[] arr1, int[] arr2) {
        String[] map = new String[n];

        for(int i = 0 ; i < n ; i++) {
            map[i] = Integer.toBinaryString(arr1[i] | arr2[i]);
        }
        String[] ans = new String[n];
        int row, index;
        for(int i = 0 ; i < n ;i++) {
            map[i] = String.format("%" + n + "s", map[i]);
            map[i] = map[i].replace('1', '#');
            map[i] = map[i].replace('0', ' ');
        }
        return map;
    }

    public static void main(String[] args) {
        int[] arr1 = {46, 33, 33, 22, 31, 50};
        int[] arr2 = {27, 56, 19, 14, 14, 10};
        String[] answer = solution2(6, arr1, arr2);
        for(int i = 0 ; i<6; i++){
            System.out.println(answer[i]);
        }

    }
}
