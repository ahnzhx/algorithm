/**
 * 
 */
package algo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 내가 처음 생각했던 풀이법 
 * substrSizeList.add(sCharChkQueue.size());
   sCharChkQueue.clear(); // 클리어 할때도 poll 하나
   sCharChkQueue.add(sChar); 
 */
public class LongestSubstring {
	public static int lengthOfLongestSubstring(String s) {
		
		if(s.length() == 0) {
			return 0;
		}
		char[] sArr = s.toCharArray();
		Queue<Character> sCharChkQueue = new LinkedList<>();
		List<Integer> substrSizeList = new ArrayList<>();
		
		for(char sChar : sArr) {
			if(!sCharChkQueue.contains(sChar)) {
				sCharChkQueue.add(sChar);
			}else {
				
				substrSizeList.add(sCharChkQueue.size());
				while(!sCharChkQueue.isEmpty()) {
					char polledChar =sCharChkQueue.poll();
					if(polledChar == sChar) {
						sCharChkQueue.add(sChar);
						break;
					}
				}
			}
		}
		
		if(!sCharChkQueue.isEmpty()) {
			substrSizeList.add(sCharChkQueue.size());
		}
		if(substrSizeList.isEmpty()) {
			substrSizeList.add(sCharChkQueue.size());
		}
		return Collections.max(substrSizeList);
        
    }
	
	
	public static void main(String[] args) {
		String s = "abcabcbb";
		String s2 = "bbbbb";
		String s3 = "pwwkew";
		String s4 = "";
		String s5 = " ";
		String s6 = "aab";

		String s7 = "dvdf";
		String s8 = "advdfg";
		
//		assert lengthOfLongestSubstring(s) == 3;
//		assert lengthOfLongestSubstring(s2) == 1;
//		assert lengthOfLongestSubstring(s3) == 3;
//		assert lengthOfLongestSubstring(s4) == 0;
		System.out.println(lengthOfLongestSubstring(s));
		System.out.println(lengthOfLongestSubstring(s2));
		System.out.println(lengthOfLongestSubstring(s3));
		System.out.println(lengthOfLongestSubstring(s4));
		System.out.println(lengthOfLongestSubstring(s5));
		System.out.println(lengthOfLongestSubstring(s6));
		System.out.println(lengthOfLongestSubstring(s7));
		System.out.println(lengthOfLongestSubstring(s8));
	}
}
