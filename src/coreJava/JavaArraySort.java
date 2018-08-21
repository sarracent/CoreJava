package coreJava;

import java.util.Arrays;

public class JavaArraySort {
	
    public static void javaArraySort() {
        int[] intArr = {1, 4, 2, 6, 3};
        String[] strArr = {"E", "A", "U","O","I"};
        //sort int array
        Arrays.sort(intArr);
        Arrays.sort(strArr);
        
        System.out.println(Arrays.toString(intArr));
        System.out.println(Arrays.toString(strArr));
    }


}
