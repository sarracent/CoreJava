package coreJava;

public class Main {

	public static void main(String[] args) {

		System.out.println(Palindrome.isPalindrome("ababa"));
		System.out.println(Palindrome.isPalindromeString("ababa"));
		System.out.println(RemoveChar.removeChar("caca", 'c'));
		System.out.println(StringPalindromeTest.checkPalindrome("abcba"));
		StringToChar.stringToChar();
		JavaStringSplit.stringSplit();
		StringToByteArray.stringToByteArray();
		ByteArrayToString.byteArrayToString();
		StringConcatenationExample.concatString();
		StringConcatenationExample.concatWithStringBuffer();
		StringConcatenationExample.concatWithStringBuilder();
		StringConcatenationExample.comparePerformanceStringConcat();
		
		RotateArray.rotatearray();

	}

}
