package coreJava;

import java.util.Arrays;

public class StringToByteArray {
	
	public static void stringToByteArray() {
		
		String str = "DAMIAN";
		byte[] byteArray = str.getBytes();
		// print the byte[] elements
		System.out.println("String to byte array: " + Arrays.toString(byteArray));
		
	}

}
