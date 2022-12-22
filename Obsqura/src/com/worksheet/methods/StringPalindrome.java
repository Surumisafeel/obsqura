package com.worksheet.methods;

/*Program to check whether the given Strings are Palindrome or not.
a) Java
b) Malayalam*/

public class StringPalindrome {
	
	 String reversestr ="";
	
	
	static void PalindromeCheck(String str, String reversestr ){
		
		int strLength = str.length();

	    for (int i = (strLength - 1); i >=0; --i) {
	    	reversestr = reversestr + str.charAt(i);
		
	}
	    System.out.println(reversestr);
	   if (str.toLowerCase().equals(reversestr.toLowerCase())) {
	//if (str == reversestr){
		System.out.println(str+"is a palindrome");
		
	}
	else
		System.out.println(str+ "is not a palindrome");
	
	}
	public static void main(String[] args) {
		String reversestr ="";
		
		StringPalindrome.PalindromeCheck("Java",reversestr);
		
		StringPalindrome.PalindromeCheck("Malayalam",reversestr);
		
				
	}

}
