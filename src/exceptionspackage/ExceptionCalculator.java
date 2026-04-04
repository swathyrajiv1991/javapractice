package exceptionspackage;

public class ExceptionCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DivisionCalculator dc = new DivisionCalculator();
		System.out.println("Result is "+dc.divide(10, 5));
		System.out.println("Result is "+dc.divide(10, 0));
		try {
		int b= Integer.parseInt("abc");
		System.out.println("Result is "+dc.divide(10, b));
		}
		catch(NumberFormatException e) {
			System.out.println("Error: Invalid number format.");
			
			
		}
		

	}

}
class DivisionCalculator{
	double divide(int a, int b) {
		
		try {
			
			return (double)(a/b);
		}catch (ArithmeticException ex) {
			System.out.println("Error: Cannot divide by zero.");
			return(0);
			
		}
		
		
	finally {
		System.out.println("--- Operation complete ---");
		
	}
		
		}
	
}
