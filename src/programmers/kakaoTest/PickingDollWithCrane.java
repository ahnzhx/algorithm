package programmers.kakaoTest;

import java.util.Stack;

/**
 * 크레인으로 인형뽑기
 * 내 힘으로 다 맞음!!!!!!!!
 * (사실 스택이랑 for문 힌트 얻긴 했음 ㅎ)
 */
public class PickingDollWithCrane {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> bowl = new Stack<>();
        for (int i : moves) {
            for (int j = 0; j < board.length; j++) {
                // board의 값이 0이 아니고
                if (board[j][i - 1] != 0) {
                    // bowl에 값이 있는지 확인
                    if (!bowl.isEmpty()) {
                        // bowl과 board의 값이 같은지 확인
                        if (board[j][i - 1] == bowl.peek()) {
                            bowl.pop();
                            answer += 2;
                        } else {
                            bowl.push(board[j][i - 1]);
                        }
                    } else {
                        bowl.push(board[j][i - 1]);
                    }
                    board[j][i - 1] = 0;
                    break;
                }
            }
        }
        return answer;
    }
}
