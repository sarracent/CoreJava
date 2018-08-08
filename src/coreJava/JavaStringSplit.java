package coreJava;

import java.util.Arrays;

public class JavaStringSplit {

	public static void stringSplit() {
		String line = "I am a java developer";

		String[] words = line.split(" ");

		String[] twoWords = line.split(" ", 2);

		System.out.println("String split with delimiter: " + Arrays.toString(words));

		System.out.println("String split into two: " + Arrays.toString(twoWords));

		// split string delimited with special characters
		String wordsWithNumbers = "I|am|a|java|developer";

		String[] numbers = wordsWithNumbers.split("\\|");

		System.out.println("String split with special character: " + Arrays.toString(numbers));
		
		String sa = "abcaada";
		System.out.println(Arrays.toString(sa.split("a")));
		
		String sad = "Damian,La Habana,Cuba";
		String[] datasa = sad.split(",", 2);
		System.out.println("Name = "+datasa[0]); //Damian
		System.out.println("Address = "+datasa[1]); //La Habana,Cuba
		
		String sadb = "Damian,La Habana,Cuba";
		String[] datasab = sadb.split(",", 3);
		System.out.println("Name = "+datasab[0]); //Damian
		System.out.println("Address = "+datasab[1]); //La Habana
		System.out.println("Address = "+datasab[2]); //Cuba

		String s = "Damian|La Habana|Cuba";
		String[] data = s.split("\\|");
		System.out.println("Name = "+data[0]); //Damian
		System.out.println("Address = "+data[1]); //La Habana
		System.out.println("Address = "+data[2]); //Cuba
	}

}
