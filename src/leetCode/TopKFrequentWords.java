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

        for(WordCnt wordCnt : map.values()){
            pq.offer(wordCnt);
            if(pq.size()>k) pq.poll();
        }

        List<String> ret = new ArrayList<>();
        while(!pq.isEmpty()){
            ret.add(0, pq.poll().word);
        }
        return ret;

    }
    public static void main(String[] args){
        String[] str = {"i", "love", "i", "love", "xoxo","gossipgirl"};
        System.out.println(solution(str, 2));
    }
}
