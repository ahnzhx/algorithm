package programmers.kakaoTest;

import java.util.*;

public class Caching {
    private static int solution(int cacheSize, String[] cities){
        LinkedList<String> cachedCities = new LinkedList<>();
        int answer = 0;
        if(cacheSize == 0)
            return cities.length * 5;

        for(String city : cities){
            city = city.toUpperCase(); // 아예 처음부터 대문자로 변환

            if(cachedCities.contains(city)){
                cachedCities.remove(city);
                cachedCities.add(city);
                answer += 1;
            }else{
                if(cachedCities.size() == cacheSize){
                    cachedCities.remove(); // 맨 첫번째 것 삭제
                }
                cachedCities.add(city);
                answer +=5;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        String[] cities = {"Jeju", "Pangyo", "NewYork", "newyork"};
        int answer = solution(2, cities);
        System.out.println(answer);
    }
}
