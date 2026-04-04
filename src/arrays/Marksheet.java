package arrays;

import java.util.HashMap;
import java.util.Map;

public class Marksheet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,Integer> markSheet = new HashMap<>();
		markSheet.put("Alice", 88);
		markSheet.put("Bob", 74);
		markSheet.put("Carol", 95);
		markSheet.put("David", 60);
		markSheet.put("Eva", 82);
		System.out.println("Bobʻs mark "+markSheet.get("Bob"));
		System.out.println("Frankʻs mark : "+markSheet.getOrDefault("Frank", 0));
		markSheet.put("David", 75);
		System.out.println("Carol present :"+markSheet.containsKey("Carol"));
		for (Map.Entry<String, Integer> e : markSheet.entrySet()) {
            System.out.println("Name : " + e.getKey()
                               + " Marks :  " + e.getValue());
    }
		
System.out.println("Total Entries "+markSheet.size());
		

	}

}
//Alice→88, Bob→74, Carol→95, David→60, Eva→82.