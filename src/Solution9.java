import java.util.*;


/**
 *author:chenyi
 *Palindrome Number
 *Determine whether an integer is a palindrome. Do this without extra space.
 */


public class Solution9 {
		
                
	
                public boolean isPalindrome(int x) {
                                String tmp = ((Integer)x).toString();
                                for( int i = 0,j = tmp.length() - 1 ; i <= ( tmp.length() - 1 ) /2;  i++,j-- ){
                                                if( tmp.charAt(i) != tmp.charAt(j) ){
                                                                return false;
                                                }
                                }


                                return true;
                }
}


