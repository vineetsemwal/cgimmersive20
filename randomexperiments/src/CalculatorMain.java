
public class CalculatorMain {
 
	public static void main(String args[]) {
		Calculator calcy=new Calculator();
		int opResult1=calcy.add(2, 5);
		int opResult2=calcy.add(3, 4,7);
		String concatResult=calcy.add("hydera", "bad");
		String display="operation result="+opResult1 + " opResult2="+opResult2+" "+concatResult;
		System.out.println(display);
	}
	
}
