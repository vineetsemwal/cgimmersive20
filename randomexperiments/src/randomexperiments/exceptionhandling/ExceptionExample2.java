package randomexperiments.exceptionhandling;

public class ExceptionExample2 {
	
	public static void main(String args[]) {
		ExceptionExample2 example=new ExceptionExample2();
		int result=example.divide(10,0);
		System.out.println(result);
	}
	
	int divide(int number, int divisor){
		try {
	   int result=number/divisor;
	   return result;
		}catch(ArithmeticException e) {
			System.out.println("arithmetic exception caught");
			return -1;
		}
	}

}
