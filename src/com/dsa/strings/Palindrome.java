package com.dsa.strings;
/*
 * Given a string, determine if it is a palindrome, considering only alphanumeric characters and
 * ignoring cases.
 * 
Example:

"A man, a plan, a canal: Panama" is a palindrome.

"race a car" is not a palindrome.

Return 0 / 1 ( 0 for false, 1 for true ) for this problem

 */

class SolutionPalindrome {
    public static boolean isPalindrome(String A) {
       String str=A.toLowerCase();
       String rev="";
       String straight="";
       for(int i=str.length()-1, j=0; i>=0; i--, j++) {
    	   
    	   if((str.charAt(i) >= 'a' && str.charAt(i) <= 'z') || 
    			   (str.charAt(i) >= '0' && str.charAt(i) <= '9')) 
    	   {
    		   rev+=str.charAt(i);
    	   }
    	   if((str.charAt(j) >= 'a' && str.charAt(j) <= 'z') || 
    			   (str.charAt(j) >= '0' && str.charAt(j) <= '9')) 
    	   {
    		   straight+=str.charAt(j);
    	   }
    	   
    	   
       }
       if(straight.equals(rev)) {
    	   return true;
       }
       else {
    	   return false;
       }
       
        
    }
}

public class Palindrome {
	public static void main(String[] args) {
		System.out.println(SolutionPalindrome.isPalindrome("9A man, a plan, a canal: Panama9"));
	}

}
