package coreJava;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class RotateArray {
	
	 public static void rotatearray() {
	        Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int d = in.nextInt();
	        int a[] = new int[n];
	         int b[] = new int[n];
	        for(int a_i=0; a_i < n; a_i++){
	            a[a_i] = in.nextInt();
	        }
	        for(int i=0;i<n;i++){
	            if((i-d)<0)
	                b[n+i-d]=a[i];
	            else
	                b[i-d]=a[i];
	        }
	        for(int i=0;i<n;i++){
	            System.out.print(b[i]+" ");
	        }
	        System.out.println();
	    }

}
