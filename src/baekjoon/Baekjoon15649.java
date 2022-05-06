package baekjoon;
import java.util.*;

public class Baekjoon15649 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Boolean> visited = new ArrayList<>();
        List<Integer> intList = new ArrayList<>();
        List<String> ret = new ArrayList<>();

        int n = sc.nextInt();
        for(int i =1; i <= n; i++){
            intList.add(i);
        }

        for(int i =1; i <= n; i++){
            visited.add(false);
        }

        int m = sc.nextInt();

        String str = "";

        process(ret, str, m, visited, intList);
        for(String value : ret){
            for(char charVal : value.toCharArray()){
                System.out.print(charVal + " ");
            }
            System.out.println();

        }

    }

    public static void process(List<String> ret, String str, int m, List<Boolean> visited, List<Integer> intList){
        if(str.length() == m ){
            ret.add(str);
            return ;

        }

        // visited 를 true, false로 넘겨보기 리스트 말구
        for(int i =0; i < intList.size(); i++) {
            if (!str.contains(intList.get(i)+"") && !visited.get(i) && str.length() < m) {
                visited.set(i, true);
                process(ret, str + intList.get(i), m, visited, intList);
            }
        }

        // 여기 모두 false가 되도록 바꾸기
        for(int i =0; i<visited.size();i++) {
            visited.set(i, false);
        }

    }
}
