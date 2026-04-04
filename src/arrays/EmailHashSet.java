package arrays;

import java.util.HashSet;

public class EmailHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> registeredEmails = new HashSet<>();
		RegisterationSystem rs = new RegisterationSystem();
		
		
		registeredEmails.add("alice@mail.com");
		registeredEmails.add("bob@mail.com");
		registeredEmails.add("carol@mail.com");
		registeredEmails.add("alice@mail.com");
		registeredEmails.add("david@mail.com");
		rs.register(registeredEmails,"bob@mail.com");
		rs.register(registeredEmails,"eve@mail.com");
		System.out.println("Size of the set "+registeredEmails.size()+ " (not 5 — duplicate ignored)");
		 System.out.println("carol@mail.com exists: " + registeredEmails.contains("carol@mail.com"));
		System.out.print("All Emails: ");
		for(String i:registeredEmails) {
			System.out.print(i+"  ");
		}
		}
		
		

	}
class RegisterationSystem{
	boolean register(HashSet<String> set, String email) {
		if(!set.add(email)) {
			System.out.println("Already registered "+email);
			return false;
			
		}else {
			System.out.println(email+" registered successfully. ");
			return true;
		}
			

}
}
//"alice@mail.com", "bob@mail.com", "carol@mail.com", "alice@mail.com" (duplicate), "david@mail.com".
