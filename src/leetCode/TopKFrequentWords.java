package leetCode;

import java.util.*;

public class TopKFrequentWords {
    public static class WordCnt{
        String word;
        int cnt;
        public WordCnt(String word){
            this.word = word;
            this.cnt = 1;
        }
    }

    public static List<String> solution(String[] words, int k){
        Map<String, WordCnt> map = new HashMap<>();
        for(String word : words){
            if(map.containsKey(word)){
                map.get(word).cnt++;
            }else{
                map.put(word, new WordCnt(word));

            }
        }

        PriorityQueue<WordCnt> pq = new PriorityQueue<>(k,
                (a,b) -> a.cnt-b.cnt != 0 ? a.cnt - b.cnt : b.word.compareTo(a.word));

        //우선순위 큐의 삭제는 가장 높은 우선순위의 데이터를 삭제함
        //숫자가 작을수록 (1) 우선순위가 높다.
        //그래서 cnt가 큰 word들만 남는 것임
        for(WordCnt wordCnt : map.values()){
            pq.offer(wordCnt);
            if(pq.size()>k) {
                pq.poll();
            }
        }

        List<String> ret = new ArrayList<>();
        while(!pq.isEmpty()){
            ret.add(0,pq.poll().word);
        }
        return ret;

    }
    public static void main(String[] args){
        String[] str = {"i", "love", "i", "love", "xoxo","gossipgirl"};
        System.out.println(solution(str, 2));
    }
}
