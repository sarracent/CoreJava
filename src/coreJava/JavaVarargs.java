package coreJava;

public class JavaVarargs {

	//method with variable arguments
	public static int sum(int i, int...js ){
	    int sum = i;
	    for(int x : js){
	        sum+=x;
	    }
	    return sum;
	}

	//method with same implementation as sum with array as argument
	public static int sumArray(int i, int[] js ){
	    int sum = i;
	    for(int x : js){
	        sum+=x;
	    }
	    return sum;
	}

}
