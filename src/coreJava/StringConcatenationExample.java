package coreJava;

public class StringConcatenationExample {
	
	public static void concatString(){
		String str = new String ("Damian ");
	     str += "Sarracent!!";
	    System.out.println(str);
	}
	
	public static void concatWithStringBuffer(){
	     StringBuffer strBuffer = new StringBuffer ("Damian ");
	     strBuffer.append("Sarracent!!");
	     System.out.println(strBuffer);
	}
	
	public static void concatWithStringBuilder(){
	     StringBuffer strBuilder = new StringBuffer ("Damian ");
	     strBuilder.append("Sarracent!!");
	     System.out.println(strBuilder);
	}
	
	public static void comparePerformanceStringConcat() {
		StringBuffer sbuffer = new StringBuffer();
        long inicio = System.currentTimeMillis();
        for (int i=0; i<1000000; i++) {
            sbuffer.append("zim");
        }
        long fin = System.currentTimeMillis();
        System.out.println("Tiempo del StringBuffer: " + (fin-inicio));

        StringBuilder sbuilder = new StringBuilder();
        inicio = System.currentTimeMillis();
        for (int i=0; i<1000000; i++) {
            sbuilder.append("zim");
        }
        fin = System.currentTimeMillis();
        System.out.println("Tiempo del StringBuilder: " + (fin-inicio));
        
	}

}
