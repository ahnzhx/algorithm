package stackAndQueues;

public class CodingTest {

    public boolean solution(String rotation, String comarison){
        StringBuilder sb = new StringBuilder();
        sb.append(rotation);

        int countComparingTimes = 0;
        boolean result = false;
        while (countComparingTimes != sb.length()){
            char headChr = sb.charAt(0);
            sb.deleteCharAt(0);
            sb.append(headChr);

            if(sb.toString().equals(comarison)) {
                result = true;
            }
            countComparingTimes++;
        }

        return result;
    }
}
