import java.util.*;

class Node{
    char charVal;
    int amount;

    Node(char charVal, int amount){
        this.charVal = charVal;
        this.amount = amount;
    }
}
public class Leetcode767 {
    public String reorganizeString(String s) {
        Map<Character, Integer> map = new HashMap<>();
        PriorityQueue<Node> pq = new PriorityQueue<>(1, (a,b)-> b.amount-a.amount);
        StringBuilder sb = new StringBuilder();

        for(char ch : s.toCharArray()){
            map.computeIfPresent(ch, (k, v) -> v+1);
            map.computeIfAbsent(ch, v -> 1);
        }

        // iterate map and create pq
        for(Map.Entry<Character, Integer> entry: map.entrySet()){
            pq.add(new Node(entry.getKey(), entry.getValue()));
        }

        Node mostFrequent =pq.poll();
        while(mostFrequent != null){
            if( sb.length() == 0 || sb.charAt(sb.length()-1) != mostFrequent.charVal) {
                sb.append(mostFrequent.charVal);
                mostFrequent.amount--;
            }else if (sb.charAt(sb.length()-1) == mostFrequent.charVal){
                pq.add(mostFrequent);
                break;
            }

            Node secondMost = pq.poll();
            if(mostFrequent.amount >0) pq.add(mostFrequent);
            mostFrequent = secondMost;


        }

        if (pq.size() > 0) return "";
        return sb.toString();

    }
}
