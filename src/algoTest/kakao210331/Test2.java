package algoTest.kakao210331;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Test2 {

    public static List<String> solution(List<List<String>> items, int orderBy, int orderDirection, int pageSize, int pageNumber) {
        String[] orderByValueArr = new String[items.size()];
        for(int i =0 ; i < items.size(); i++){
            orderByValueArr[i] = items.get(i).get(orderBy);
        }

        if(orderBy != 0){
            Arrays.asList(orderByValueArr).stream().mapToInt(Integer::parseInt).toArray();
        }

        if(orderDirection == 0){
            Arrays.sort(orderByValueArr);
        }else{
            Arrays.sort(orderByValueArr, Collections.reverseOrder());
        }
        List<List<String>> newItems = new ArrayList<>();
        for (String orderByValue : orderByValueArr){
            for(List<String> item : items){
                if(item.get(orderBy) == orderByValue){
                    newItems.add(item);
                    break;
                }
            }
        }
        List<String> answer = new ArrayList<>();
        for(int j =pageSize * pageNumber; j < (pageSize * pageNumber) + pageSize; j++){
            if(newItems.size() == j){
                break;
            }else answer.add(newItems.get(j).get(0));

        }

        return answer;

    }
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int itemsRows = Integer.parseInt(bufferedReader.readLine().trim());
        int itemsColumns = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<String>> items = new ArrayList<>();

        IntStream.range(0, itemsRows).forEach(i -> {
            try {
                items.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", " ").split(" "))
                                .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        int orderBy = Integer.parseInt(bufferedReader.readLine().trim());

        int orderDirection = Integer.parseInt(bufferedReader.readLine().trim());

        int pageSize = Integer.parseInt(bufferedReader.readLine().trim());

        int pageNumber = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> result = solution(items, orderBy, orderDirection, pageSize, pageNumber);

//        bufferedWriter.write(
//                result.stream()
//                        .collect(joining("\n"))
//                        + "\n"
//        );

        bufferedReader.close();
//        bufferedWriter.close();
    }


}
