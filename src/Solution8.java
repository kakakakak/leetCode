import java.util.*;


/**
*author:chenyi
*String to Integer (atoi)
*Implement atoi to convert a string to an integer.
*
*Hint: Carefully consider all possible input cases. If you want a challenge, please do not see below and ask yourself what are the possible input cases.
*
*Notes: It is intended for this problem to be specified vaguely (ie, no given input specs). You are responsible to gather all the input requirements up front. 
*/


public class Solution8 {
                
                public int myAtoi(String str) {

                                if( str == null || str.length() == 0 ){
                                        return 0;
                                }

                                long result = 0;
                                boolean isNegative = false;
                                boolean isStillNumber = true;
                                for ( int i = 0 ; i < str.length() ; i++ ) {
                                                int charNum = str.charAt(i) ;

                                                if(  charNum < 48 || charNum > 57 ){
                                                                

                                                                if( isStillNumber ){
                                                                                if( charNum == '-' ){
                                                                                                isNegative = true;
                                                                                                isStillNumber = false;
                                                                                }else if( charNum == '+' ){
                                                                                                isStillNumber = false;
                                                                                }else if( charNum == ' ' ){

                                                                                }else{
                                                                                        break;
                                                                                }
                                                                                
                                                                                continue;
                                                                }
                                                                
                                                                break;
                                                                
                                                }else{
                                                                isStillNumber = false;
                                                                
                                                                charNum = charNum - 48;
                                                                result = result * 10 + charNum;

                                                                if( isNegative ){
                                                                                if( result >= -(long) Integer.MIN_VALUE ){
                                                                                                result = -(long)Integer.MIN_VALUE;
                                                                                                break;
                                                                                }
                                                                }else{
                                                                                if( result >= Integer.MAX_VALUE ){
                                                                                                result = Integer.MAX_VALUE;
                                                                                                break;
                                                                                }
                                                                }
                                                                
                                                }                                             
                                }
                                if( isNegative ){
                                                result = - result;
                                }
                                return (int)result;
                }

                public static void main(String[] args){
                                System.out.println(new Solution8().myAtoi("9223372036854775809"));
                }
}


