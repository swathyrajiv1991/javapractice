package arrays;

import java.util.ArrayList;

public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> groceryList = new ArrayList<>();
	groceryList.add("Apples");
		groceryList.add("Milk");
		groceryList.add("Bread");
		groceryList.add("Eggs");
		groceryList.add("Coffee");
		System.out.println("List of items "+groceryList);
groceryList.remove(2);
System.out.println("List of items after removal of coffee "+groceryList);
System.out.println(groceryList.contains("Apples"));
System.out.println("Size of the list "+groceryList.size());
System.out.println("Grocery list ");
	for(String grocerList: groceryList) {
		System.out.println(grocerList);
	}

}
}
