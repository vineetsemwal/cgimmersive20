
public class StringHandlingExample {
	
	public static void main(String args[]) {
		StringHandlingExample converter=new StringHandlingExample();
		String result=converter.convertUsingArray("zebra");
		System.out.println(result);
	}
	
    String convertUsingArray(String input) {
    	char characters[]=input.toCharArray();
    	for(int index=0;index<characters.length;index++) {
    		 char ch =characters[index];	
    	      if(ch!='a' && ch !='e' && ch!='i' && ch!='o' && ch!='u') {
    	    	  if(ch=='z') {
    	    	   char next='b';
    	    	   characters[index]=next;
    	    	  }else {
    	    	  int currentCharCode=ch;
    	    	  int nextCharCode=currentCharCode+1;
    	    	  System.out.println("current char code="+currentCharCode +" charcter="+ch);
    	    	  char nextChar=(char)nextCharCode;
    	    	  characters[index]=nextChar;
    	    	  }
    	      }
    	}
    	String result=new String(characters);
    	return result;
    }
	
	String convertByBuilder(String input){
	StringBuilder builder=new StringBuilder(input);	
     for(int index=0;index<input.length();index++) {
      char ch =input.charAt(index);	
      if(ch!='a' && ch !='e' && ch!='i' && ch!='o' && ch!='u') {
    	  int nextCharCode=ch+1;
    	  char nextChar=(char)nextCharCode;
    	  builder.setCharAt(index, nextChar);
      }
     }
     
	String result= builder.toString();	
	return result;
		
	}

}
