package programmersPaidClass.week1;

import java.util.*;

public class Quest67683 {
    public String[] solution(String[] strings, int n){
        String[] answer = new String[strings.length];
        List<String> stringsList = Arrays.asList(strings);
        Collections.sort(stringsList, new sortByNthLetter(n));

        List<String> comparingList = new ArrayList<>();
        comparingList.add(stringsList.get(0));
        String compareChar = stringsList.get(0).substring(n, n+1);

        int i = 1;
        int destPos = 0;
        while(i < strings.length){
            while(compareChar.equals(stringsList.get(i).substring(n, n+1))) {
                comparingList.add(stringsList.get(i));
                i++;
                if(i == strings.length){
                    break;
                }
            }
            Collections.sort(comparingList, new sortByFirstToNthLetter(n));
            Collections.sort(comparingList, new sortByNthToLastLetter(n));
            String[] comparedResult = comparingList.toArray(new String[0]);


            System.arraycopy(comparedResult, 0, answer, destPos, comparedResult.length);
            if(i < strings.length){
                compareChar = stringsList.get(i).substring(n, n+1);
            }

            comparingList.removeAll(comparingList);

            if(comparedResult != null){
                destPos += comparedResult.length;
            }
        }



        return answer;
    }

    class sortByNthLetter implements Comparator<String>{
        int n ;

        public sortByNthLetter(int n) {
            this.n = n;
        }

        @Override
        public int compare(String o1, String o2) {
            return o1.substring(n, n+1).compareTo(o2.substring(n, n+1));
        }
    }

    class sortByFirstToNthLetter implements Comparator<String>{
        int n ;

        public sortByFirstToNthLetter(int n) {
            this.n = n;
        }

        @Override
        public int compare(String o1, String o2) {
            return o1.substring(0, n-1).compareTo(o2.substring(0, n-1));
        }
    }

    class sortByNthToLastLetter implements Comparator<String>{
        int n ;

        public sortByNthToLastLetter(int n) {
            this.n = n;
        }

        @Override
        public int compare(String o1, String o2) {
            return o1.substring(n+1).compareTo(o2.substring(n+1));
        }
    }

    public static void main(String[] args) {
        String[] strings = new String[]{"sun", "bed", "car"};
        String[] strings2 = new String[]{"abce", "abcd", "abca", "abc", "cdx"};
        System.out.println(new Quest67683().solution(strings, 1));
        //System.out.println(new Quest67683().solution(strings2, 2));
    }
}
