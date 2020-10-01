package randomexperiments.stringexamples;

public class StringOperations {
	
	public static void main(String args[]) {
		String original="hyderabad";
		String substring1=original.substring(4);
		String substring2=original.substring(4,6);
		String replaced=original.replace("bad", "good");
		String concat1=original.concat("telangana");
		String concat2=original +"telangana";
		int firstIndexOfA=original.indexOf("a");//finds first index of string
        int lastIndexOfA= original.lastIndexOf("a");// find last index of string
		System.out.println("original is "+original);
	    System.out.println("substring 1 is "+substring1);
	    System.out.println("substring 2 is "+substring2);
	    System.out.println("replaced one is "+replaced);
	    System.out.println("concat1 is "+concat1);
	    System.out.println("concat1 is "+concat2);
	    System.out.println("first index of a="+firstIndexOfA);
	    System.out.println("last index of a="+lastIndexOfA);
	}
	
}
