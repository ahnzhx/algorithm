package programmersPaidClass.week2;

public class Quest67695 {
    public boolean solution(String[] phone_book) {
        int i = 0;

        while (i < phone_book.length) {
            for (int j = 0; j < phone_book.length; j++) {
                if (phone_book[i].equals(phone_book[j])) {
                    continue;
                }
                if (phone_book[j].startsWith(phone_book[i])) {
                    return false;
                }
            }
            i++;
        }
        return true;
    }
}
