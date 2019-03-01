package programmers.highScoreKit.dynamicProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamPractice {
    public static void startingStream() {
        String[] strArr = {"mash-up", "backend", "codingsquid"};
        List<String> strList = Arrays.asList(strArr);

        Stream<String> listStream = strList.stream();
        Stream<String> arrayStream = Arrays.stream(strArr);

        //listStream.sorted().forEach(System.out::println);

        listStream.distinct()
                .sorted()
                .limit(2)
                .forEach(System.out::print);
    }

    public static void main(String []args){
        startingStream();
    }

}
