package randomexperiments.inheritance;

public class AcerCalculator implements ICalculator{

	@Override
	public int add(int num1, int num2){
		int result=num1+num2;
		return result;
	}

	/**
	 * AcerCalculator c=new AcerCalculator();
	 * c.add(1,2,3)
	 *
	 */
	public int add(int num1, int num2,int num3){
		int result= this.add(num1,num2);
		result=result+num3;
		return result;
	}



}
