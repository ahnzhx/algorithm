package leetCode;

public class PalindromeNumber {
    public static boolean isPalindrome(int x) {
        StringBuilder strX= new StringBuilder(String.valueOf(x));

        StringBuilder xsb = new StringBuilder(strX);
//        xsb.reverse();

        return xsb.reverse().toString().equals(strX.toString());
    }

    public static void main(String[] args) {
        int x = 121;
        System.out.println(isPalindrome(x));
    }
}
