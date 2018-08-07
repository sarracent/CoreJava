package coreJava;

public class StringToChar {
	
	public static void stringToChar() {
		
		String str = "Damian";
		
		char[] chars = str.toCharArray();
		System.out.println(chars.length);
		
		char c = str.charAt(2);
		System.out.println(c);
		
		char[] chars1 = new char[4];
		str.getChars(0, 4, chars1, 0);
		System.out.println(chars1);
		
	}
		
}
