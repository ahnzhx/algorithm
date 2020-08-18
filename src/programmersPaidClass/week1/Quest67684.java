package programmersPaidClass.week1;

import java.util.*;

public class Quest67684 {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        char[] skills = skill.toCharArray();
        int p =0 ;
        for(String skillTree: skill_trees){
            Map<String, Integer> location = new HashMap<>();
            while( p < skills.length){
                int result = skillTree.indexOf(String.valueOf(skills[p]));
                if(result >= 0){
                    location.put(String.valueOf(skills[p]), result);
                }
                p++;
            }
            if(!location.isEmpty()){
                List<Integer> locationList = new ArrayList<>();

                for(int locVal : location.values()){ // 왜 이미 정렬되어있는거야!
                            if (locVal < 0){
                                break;
                            }else{
                                locationList.add(locVal);
                    }
                }

                if(!locationList.isEmpty()){
                    List<Integer> compareLocation = new ArrayList<>(locationList);
                    Collections.sort(compareLocation);
                    if(Arrays.equals(compareLocation.toArray(new Integer[0]), locationList.toArray())){
                        answer++;
                    }

                }


            }



            p = 0 ;

        }
        return answer;
    }

    public static void main(String[] args) {
        String[] skill_trees = new String[]{"BACDE", "CBADF", "AECB", "BDA"};
//        String[] skill_trees = new String[]{"AECB", "BDA"};
//        String[] skill_trees = new String[]{"BDA"};
        System.out.println(new Quest67684().solution("CBD", skill_trees));
    }
}
