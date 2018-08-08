package coreJava;

public class ByteArrayToString {
	
	public static void byteArrayToString() {
		byte[] byteArray = { 'D', 'A', 'M', 'I', 'A', 'N' };
		byte[] byteArray1 = { 68, 65, 77, 73, 65, 78 };

		String str = new String(byteArray);
		String str1 = new String(byteArray1);

		System.out.println(str);
		System.out.println(str1);
	}

}
