package exceptionspackage;

public class ExceptionRegistration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VotersRegistration uag = new VotersRegistration();
		try {
			uag.registerVoter("Alice", 22);
			
		}catch(UnderAgeException ex) {
			System.out.println(ex.getMessage());
		}
		try {
			uag.registerVoter("Bob", 16);
		}catch(UnderAgeException ex) {
			System.out.println(ex.getMessage());
		}
		try {
			uag.registerVoter("Carol", 18);
		}catch(UnderAgeException ex) {
			System.out.println(ex.getMessage());
		}finally {
			System.out.println("Registration process completed");
		}
		
		
		

	}

}
class UnderAgeException extends Exception{

	private static final long serialVersionUID = 1L;

	public UnderAgeException(String msg) {
		super(msg);
		// TODO Auto-generated constructor stub
	}
	}
class VotersRegistration{
	
	void registerVoter(String name, int age) throws UnderAgeException{
		
		if(age < 18) {
			throw new UnderAgeException("UnderAgeException: "+name+" is too young . Age :"+age);
		}System.out.println("Registered : "+name);
	}
	
	
}


/*
Create a custom exception class called UnderAgeException that extends Exception. Its constructor should accept a String message and pass it to super().
Write a method void registerVoter(String name, int age) throws UnderAgeException that: prints "Registered: <name>" if age >= 18, OR throws new UnderAgeException("<name> is too young. Age: <age>") if age < 18.
In main, call registerVoter() inside a try-catch block for three people: "Alice" age 22 (valid), "Bob" age 16 (should throw), "Carol" age 18 (valid).
Catch UnderAgeException and print the exception message.
Print "Registration process completed." after the try-catch block.
Expected Output (sample)
Registered: Alice
UnderAgeException: Bob is too young. Age: 16
Registered: Carol
Registration process completed. 
 */
