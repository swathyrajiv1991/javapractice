package stringmanipulation;

public class StringManipulationmanual {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stringmethods sm= new Stringmethods();
		String s ="malayalam";
		int count= sm.countVowels(s);
		System.out.println("There are "+ count + " vowels ");
		String rev = "";
		rev = sm.reverseString(s);
		System.out.println("Reversed string is "+rev);
		boolean flag;
		flag = sm.isPalindrome(s);
		if(flag == true) {
			System.out.println(s +" is palindrome");
		}else {
				System.out.println(s+ " Not a Palindrome");
			}
		String text = "hello hello Hell";
		String word = "hello";
		int countOccur = sm.countOccurrences(text, word);
		System.out.println("Occurence is "+countOccur);
		
	}
}
class Stringmethods{
	
	
	 int countVowels(String s) {
		int count =0;
		for(int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o') {
				count++;
				
			}
			
		}
		return count;
		
	}
	 
	 String reverseString(String s) {
		 String reversedString = "";
		 
		 for(int i =s.length()-1; i >= 0;i--) {
			 reversedString = reversedString+s.charAt(i);
		 }
		 return reversedString;
	 }
	 
	 boolean isPalindrome(String s) {
		 String reversedString = "";
		 String lower = s.toLowerCase();
		 boolean flag;
		 for(int i =lower.length()-1; i >= 0;i--) {
			 reversedString = reversedString+s.charAt(i);
		 }
		 if(s.equals(reversedString)) {
			 flag= true;
			 
		 }else {
			 flag= false;
		 }
		 return flag;
		 
	 }
	 int countOccurrences(String text, String word) {
		 int count = 0;

		    for(int i = 0; i <= text.length() - word.length(); i++) {
		        if(text.substring(i, i + word.length()).equals(word)) {
		            count++;
		        }
		    }

		    return count;
	 }
}

