package coreJava;

public class Palindrome {
	
	private static boolean isPalindrome(String str) {
		if (str == null)
			return false;
		StringBuilder strBuilder = new StringBuilder(str);
		strBuilder.reverse();
		return strBuilder.toString().equals(str);
	}
	
	private static boolean isPalindromeString(String str) {
		if (str == null)
			return false;
		int lenght = str.length();
		System.out.println(lenght / 2);
		for (int i = 0; i < lenght / 2; i++) {
			
			if (str.charAt(i) != str.charAt(lenght - i - 1) ) {
				return false;
			}	
		}
		return true;
	}
	
	public static void main(String[] args) {
		System.out.println(Palindrome.isPalindrome("abA"));
		System.out.println(Palindrome.isPalindromeString("aba"));
	}
	
	
}
