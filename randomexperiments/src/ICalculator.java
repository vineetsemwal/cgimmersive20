
public interface ICalculator {
   int add(int a, int b);
	
   default int sub(int a ,int b) {
	   return a-b;
   }
}
