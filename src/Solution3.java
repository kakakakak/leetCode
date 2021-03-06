import java.util.*;


/**
 *author:chenyi
 *Longest Substring Without Repeating Characters
 *Given a string, find the length of the longest substring without repeating characters. 
 *For example, the longest substring without repeating letters for "abcabcbb" is "abc", which the length is 3. 
 *For "bbbbb" the longest substring is "b", with the length of 1.
 */


public class Solution3 {
		
	//loop all word, when find the one exist in map,  get length by this one and last appear
		
	public int lengthOfLongestSubstring(String s) {

        		Map<Character, Integer> map = new HashMap<Character, Integer>();
        		int max = 0;
        		for( int i = 0, j = 0 ; i < s.length() ; i++ ){
        			if( map.containsKey(s.charAt(i)) ){
        				j = Math.max(j, map.get(s.charAt(i)) + 1);
        			}
        			map.put(s.charAt(i), i);
        			max = Math.max(max, i-j+1);
        		}

	return max;
    	}
}


