package coreJava;

public class ArrayInitialization {
	
	public static void arrayInitialization() {
		
		//initialize primitive one dimensional array
		int[] arrInt = new int[5];
		
		//initialize Object one dimensional array
		String[] strArr; //declaration
		strArr = new String[4]; //initialization;
		
		//initialize multidimensional array
		int[][] twoArrInt = new int[4][5];

		//multidimensional array initialization with only leftmost dimension
		int[][] twoIntArr = new int[2][];
		twoIntArr[0] = new int[2];
		twoIntArr[1] = new int[3]; //complete initialization is required before we use the array
		
		//array initialization using shortcut syntax
		int[] arrI = {1,2,3};
		int[][] arrI2 = {{1,2}, {1,2,3}};
		
	}
	
}
