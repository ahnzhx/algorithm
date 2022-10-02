package capitalOne;

public class Quest3_2 {
    // 정규식 확인하기
    public static void regexTest(String[] messages){
        String pattern = "^@id[0-9]";
        for(String message : messages){
            System.out.println(message.replaceAll("^@id[0-9]", " "));
        }
    }
    public static void main(String[] args) {
        String[] messages = {
                "Hey, @id123,id423,id93 should bring your snacks",
                "gotcha, but what about @id1"
        };
        regexTest(messages);
    }
}
