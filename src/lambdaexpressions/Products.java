package lambdaexpressions;

import java.util.ArrayList;
import java.util.Arrays;

public class Products {

	public static void main(String[] args) {
		ArrayList<String> products = new ArrayList<>(Arrays.asList("Laptop", "Phone", "Tablet", "Monitor", "Keyboard", "Mouse", "Headphones"));
		products.sort((p1,p2)->p1.compareTo(p2));
		System.out.println("Sorted list "+products);
		products.sort((p1,p2)->p1.length() - p2.length());
		System.out.println("Sorted by length list "+products);
		
		Runnable printTask =  ()-> System.out.println("Processing product list...");
		Thread t1 = new Thread(printTask);
		t1.start();
		products.removeIf(p -> p.length() < 6);
		System.out.println("products after removal "+products);
		

	}

}
