package programmers.hash;

import java.util.HashMap;
import java.util.Map;

public class UnfinishedPlayer {
    public static String solution(String[] participant, String[] completion) {
        String answer = "";
        Map<String, Integer> participantMap = new HashMap<>();

        for(String player : participant){
            participantMap.put(player, participantMap.getOrDefault(player, 0)+1);
        }

        for (String player : completion){
            participantMap.put(player, participantMap.get(player)-1);
        }

        for(String key : participantMap.keySet()){
            if(participantMap.get(key) != 0){
                answer = key;
                break;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        String[] participants = new String[]{"mislav", "stanko", "mislav", "ana"};
        String[] completions = new String[]{"stanko", "ana", "mislav"};
        System.out.println(solution(participants, completions));
    }
}
