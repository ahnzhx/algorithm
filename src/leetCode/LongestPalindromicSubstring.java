
package leetCode;

public class LongestPalindromicSubstring {

	public static String longestPalindrome(String s) {
		int n = s.length();
		char[] c = s.toCharArray();
		Boolean[][] dp = new Boolean[n][n];
		int start, end;
		start = end = 0;
		for (int i= n-1; i>= 0; i--) {
			for (int j = i; j<n; j++) {
				if (j-i < 3) { //base case
					dp[i][j] = (c[i] == c[j]);
				} else {
					dp[i][j] = (c[i] == c[j] && dp[i+1][j-1]);
				}

				if (dp[i][j] && (end-start <= j-i)) {
					start = i;
					end = j;
				}
			}
		}
		return s.substring(start, end+1);
	}
	
	public static void main(String[] args) {
		String s1 = "babad";
		String s2 = "cbbd";
		String s3 = "a";
		String s4 = "ac";
		String s5 = "ccc";

		String s6 = "caba";

//		System.out.println(longestPalindrome(s1));
//		System.out.println(longestPalindrome(s2));
//		System.out.println(longestPalindrome(s3));
//		System.out.println(longestPalindrome(s4));
//		System.out.println(longestPalindrome(s5));
		System.out.println(longestPalindrome(s6));
	}
	
}
