package randomexperiments.exceptionhandling;

public class VowelsExample {
	
	public static void main(String args[]) {
		try {
			VowelsExample example=new VowelsExample();
			String input="zzzz";
			String vowels=example.findVowels(input);
			System.out.println("vowels="+vowels);
			char firstVowel=vowels.charAt(0);
			System.out.println("first vowel found is "+firstVowel);
		}
		
		catch(InvalidArgumentException e) {
		  System.out.println("argument is null or empty so we cant find vowels");	
		}
		catch(NoVowelFoundException e) {
			System.out.println("no vowel found in input so i cant tell you about first vowel");
		}
		catch(Exception e) {
			System.out.println("something went wrong");
		}
		
	}
	
	String findVowels(String input)  {
		if(input==null || input.isEmpty()) {
			throw new InvalidArgumentException("input is null or empty");
		}
		String vowels="";
		for(int index=0;index<input.length();index++) {
			char ch=input.charAt(index);
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o'|| ch=='u') {
				vowels=vowels+ch;
			}
		}
		if(vowels.isEmpty()) {
			throw new NoVowelFoundException("no vowel found in "+input);
		}
		
		return vowels;
	}

}
