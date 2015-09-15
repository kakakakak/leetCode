import java.util.*;


/**
 *author:chenyi
 *ZigZag Conversion
 * The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)
*
*P   A   H   N
*A P L S I I G
*Y   I   R
*
*And then read line by line: "PAHNAPLSIIGYIR"
*
*Write the code that will take a string and make this conversion given a number of rows:
*
*string convert(string text, int nRows);
*
*convert("PAYPALISHIRING", 3) should return "PAHNAPLSIIGYIR". 
 */


public class Solution6 {
	
                /**
                *example:           abcdefghijk
                *                   a              g
                *                   b        f    h        
                *                   c    e        i    k
                *                   d              j      
                *   so ,calculate the char location
                *
                */

	public String convert(String s, int nRows) {
                                StringBuilder sb = new StringBuilder();
                                for( int i = 1 ; i <= nRows ; i++ ){
                                                int index = i - 1;
                                                while( index < s.length() ){                
                                                                sb.append(s.charAt(index));
                                                                index += ( nRows - 1 ) * 2 == 0 ? 1 : ( nRows - 1 ) * 2;
                                                                if( i != 1 && i != nRows && (index - 2 * (i - 1)) < s.length()){
                                                                                sb.append(s.charAt(index - 2 * (i - 1)));
                                                                }
                                                }
                                }
                                return sb.toString();
                }
}


