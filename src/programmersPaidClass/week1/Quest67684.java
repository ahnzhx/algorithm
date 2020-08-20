package programmersPaidClass.week1;

public class Quest67684 {
    static final int MAX = Integer.MAX_VALUE;

    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        String temp;
        for(String skillTree: skill_trees){
            temp = skillTree.replaceAll("[^"+ skill+"]", "");
            if(skill.startsWith(temp)) answer++;
        }
        return answer;
    }

    public static void main(String[] args) {

        String[] skill_trees = new String[]{  "BDA", "BACDE", "CBADF", "AECB"};
//        String[] skill_trees = new String[]{"AECB", "BDA"};
//        String[] skill_trees = new String[]{"CBADF"};
        System.out.println(new Quest67684().solution("CBD", skill_trees));
    }
}
