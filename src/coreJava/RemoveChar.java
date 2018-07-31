package coreJava;

public class RemoveChar {
	
	public static String removeChar(String str, char c) {
		if (str == null)
			return null;
		return str.replaceAll(Character.toString(c), "");
		
	}

}
