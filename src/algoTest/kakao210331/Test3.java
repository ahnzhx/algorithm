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

public class Test3 {

    public static int solution(List<Integer> start_time, List<Integer> running_time) {
        // Write your code here
        Map<Integer, Integer> timeTable = new HashMap<>();

        for(int i = 0 ; i < start_time.size(); i++){
            if(timeTable.get(start_time.get(i)) != null ){
                if(start_time.get(i) + running_time.get(i)< timeTable.get(start_time.get(i))){
                    timeTable.put(start_time.get(i), start_time.get(i) + running_time.get(i));
                }
            }else{
                timeTable.put(start_time.get(i), start_time.get(i) + running_time.get(i));
            }

        }

        return timeTable.size();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int start_timeCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> start_time = IntStream.range(0, start_timeCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine().replaceAll("\\s+$", "");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
                .map(String::trim)
                .map(Integer::parseInt)
                .collect(toList());

        int running_timeCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> running_time = IntStream.range(0, running_timeCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine().replaceAll("\\s+$", "");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
                .map(String::trim)
                .map(Integer::parseInt)
                .collect(toList());

        int result = solution(start_time, running_time);

//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();

        bufferedReader.close();
//        bufferedWriter.close();
    }
}
