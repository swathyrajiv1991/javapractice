package oops;

public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person pr = new Person("Mary",34,"mary@gmail.com",23456);
		pr.setAge(-30);
		pr.setEmail("mary@gmail.com");
		pr.display();
		

	}

	

}
class Person{
	private  String name ;
	private int age;
	private String email;
	private  double salary;
	public String getName() {
		return name;
	}
	public Person(String name, int age, String email, double salary) {
		super();
		this.name = name;
		this.age = age;
		this.email = email;
		this.salary = salary;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if((age>=0) && (age<=120))
		this.age = age;else {
			System.out.println("Not a valid age");
		}
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		if (email != null && email.contains("@") && email.contains(".")) {
			this.email = email;
			System.out.println(" valid email");
			
		}else {
			System.out.println("not a valid email");
			
		}
		
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		if (salary >= 0) 
		this.salary = salary;
		else {
			System.out.println("Not a valid Salary");
		}
			
	}
	public void display() {
		  System.out.println("\n--- Person Details ---");
	        System.out.println("Name: " + name);
	        System.out.println("Age: " + age);
	        System.out.println("Email: " + email);
	        System.out.println("Salary: $" + salary);
	}
}
