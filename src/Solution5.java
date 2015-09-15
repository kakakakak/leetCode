import java.util.*;


/**
 *author:chenyi
 *Longest Palindromic Substring
 *Given a string S, find the longest palindromic substring in S. 
 *You may assume that the maximum length of S is 1000, and there exists one unique longest palindromic substring.
 */


public class Solution5 {
		
	//from the center,judge the left abd right char is equall
	//note, the palindrome has odd and even length strings, example aba and abba
	
	private int length = 1;
    	private int center = 0;
    
    	public String longestPalindrome(String str) { 
    	
    		for( int i = 0 ; i < str.length() ; i++ ){
    		
    			findPalindromeByCenter(str, i, 0);
    			findPalindromeByCenter(str, i, 1);
    		}
    		return str.substring(center, center + length);
    	}
    
    	private void findPalindromeByCenter(String str, int index, int even){
    		int left = index;
    		int right = index + even;
    		while( left >= 0 && right < str.length() && str.charAt(left) == str.charAt(right) ){
    		
    			if( right - left + 1 > length ){
    				center = left;
    				length = right - left + 1;
    			}
    			right++;
    			left--;
    		}
    	}
}


