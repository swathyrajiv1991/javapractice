import java.util.Scanner;

public class TemperatureConversion {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the temperature in celsius:");
	double celsius = sc.nextDouble();
	double fahrenheit = (celsius * 9 / 5) + 32;
    double kelvin = celsius + 273.15;
    System.out.println("Farenheit:"+fahrenheit);
    System.out.println("Kelvin:"+kelvin);
    sc.close();
    
	
	

}
}