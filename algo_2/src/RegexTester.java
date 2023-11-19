import java.util.regex.Pattern;

public class RegexTester {
    public static void test(){
        String st = "(\\d+)";
        String st1 = "a20b231";
        Pattern.compile(st).matcher(st1).matches();

    }

    public static void main(String[] args) {
        test();
    }
}
