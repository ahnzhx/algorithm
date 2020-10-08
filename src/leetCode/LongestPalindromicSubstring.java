/**
 * 
 */
package algo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;

/**
 * packageName	: algo
 * fileName	: LongestPalindromicSubstring.java 
 * author		: twayair
 * date		: 2020. 10. 8.
 * 내용			: 
 *
 * ===========================================================
 *
 * DATE				AUTHOR			NOTE
 * -----------------------------------------------------------
 * 2020. 10. 8.			twayair			최초 생성
 */
public class LongestPalindromicSubstring {
	
	//TODO: ~buffer 변수 바꾸기
	public static String longestPalindrome(String s) {
		char[] sArr = s.toCharArray();
		List<Character> sCharBuffer = new ArrayList<>();
		List<Character> sCharReverseBuffer ;
		
		Map<String, Integer> answerMap = new HashMap<>();
		for(char sChar : sArr) {
			if(sCharBuffer.size() > 0) {
				if(sCharBuffer.get(sCharBuffer.size()-1).equals(sChar)) {
					sCharBuffer.removeIf(c -> !c.equals(sChar));
					sCharBuffer.add(sChar);
					answerMap.put(listToStringBuffer(sCharBuffer), sCharBuffer.size());
					continue;
				}
			}
			
			sCharBuffer.add(sChar);
			sCharReverseBuffer = new ArrayList<>(sCharBuffer);
			Collections.reverse(sCharReverseBuffer);
			
			if(sCharBuffer.toString().equals(sCharReverseBuffer.toString())) {
				answerMap.put(listToStringBuffer(sCharBuffer), sCharBuffer.size());
			}
			
		}
		Optional<Entry<String, Integer>> maxEntry = answerMap.entrySet().stream()
															.max((Entry<String, Integer> e1, Entry<String, Integer> e2) -> e1.getValue().compareTo(e2.getValue()));
        return maxEntry.get().getKey();
    }
	
	private static String listToStringBuffer(List<Character> charList) {
		StringBuffer sb =  new StringBuffer();
		for(char c : charList) {
			sb.append(c);
		}
		return sb.toString();
	}
	
	public static void main(String[] args) {
		String s1 = "babad";
		String s2 = "cbbd";
		String s3 = "a";
		String s4 = "ac";
		String s5 = "ccc";
//		System.out.println(longestPalindrome(s1));
//		System.out.println(longestPalindrome(s2));
//		System.out.println(longestPalindrome(s3));
//		System.out.println(longestPalindrome(s4));
		System.out.println(longestPalindrome(s5));
	}
	
}
