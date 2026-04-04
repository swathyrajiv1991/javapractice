package arrays;

import java.util.ArrayList;

public class ToDoList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> tasks = new ArrayList<>();
		tasks.add("Buy groceries");
		tasks.add("Read a book");
		tasks.add("Exercise");
		tasks.add("Call mom");
		tasks.add("Pay bills");
		System.out.println("Tasks ");
		int index = 1;
		for(String s: tasks) {
			System.out.println(index+". " +s);
			index++;
		}
		
		tasks.remove("Exercise");
		tasks.remove(0);
			System.out.println("Pay bills present:"+tasks.contains("Pay bills"));
		tasks.add(1,"Study Java");
		System.out.println("After Removals and Addition");
		for (int i = 0; i < tasks.size(); i++) {
            System.out.println((i + 1) + ". " + tasks.get(i));
        }

		System.out.println("Size of the final List :"+tasks.size());
		
	}

}
//Buy groceries", "Read a book", "Exercise", "Call mom", "Pay bills"