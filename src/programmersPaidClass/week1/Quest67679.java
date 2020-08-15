package programmersPaidClass.week1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Quest67679 {

    public int solution(String dirs) {
        char[] dirsArray = dirs.toCharArray();
        boolean[][] visited = new boolean[100][100];
        int answer = 0;


        // TODO 1.(00,00) 초기화


        // TODO 2. U, D, L, R
//        for(char direction : dirsArray){
//            switch (direction){
//                case 'U':
//                    if( from + 1 <= 05){
//                        if(!visited.get(from).contains(from+1)){
//                            visited.get(from).add(++from);
//                            answer++;
//                        }
//                    }
//                    break;
//                case 'D':
//                    if(from -1 >= -05 ){
//                        if(!visited.get(from).contains(from-1)){
//                            visited.get(from).add(--from);
//                            answer++;
//                        }
//
//                    }
//                    break;
//                case 'L':
//                    if( from-10 >= -50){
//                        if(!visited.get(from).contains(from-10)){
//                            from -= 10;
//                            visited.get(from).add(from);
//                            answer++;
//                        }
//
//                    }
//                    break;
//                case 'R':
//                    if(from +10 <= 50){
//                        if(!visited.get(from).contains(from + 10)){
//                            from +=10;
//                            visited.get(from).add(from);
//                            answer++;
//                        }
//                    }
//                    break;
//            }
//        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(new Quest67679().solution("ULURRDLLU"));
        //System.out.println(new Quest67679().solution("LULLLLLLU"));
    }
}
