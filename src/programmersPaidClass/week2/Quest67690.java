package programmersPaidClass.week2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Quest67690 {
    public String solution(String[] participant, String[] completion) {
        List<String> partList = Arrays.asList(participant);
        List<String> comList = Arrays.asList(completion);

        Collections.sort(partList);
        Collections.sort(comList);

        for(int i =0 ; i< comList.size(); i++){
            if(!partList.get(i).equals(comList.get(i))){
                return partList.get(i);
            }
        }

        return partList.get(participant.length-1);

    }

}
