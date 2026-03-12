
public class NameConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fullName = "  alice marie johnson  ";

        
        String trimmed = fullName.trim();
        System.out.println("trimmed "+trimmed);

       
        int firstSpace = trimmed.indexOf(" ");
        int secondSpace = trimmed.indexOf(" ", firstSpace + 1);

        String first = trimmed.substring(0, firstSpace);
        String middle = trimmed.substring(firstSpace + 1, secondSpace);
        String last = trimmed.substring(secondSpace + 1);

        first = first.substring(0,1).toUpperCase() + first.substring(1);
        middle = middle.substring(0,1).toUpperCase() + middle.substring(1);
        last = last.substring(0,1).toUpperCase() + last.substring(1);

        String cleaned = first + " " + middle + " " + last;

       
        String lower = cleaned.toLowerCase();
        int vowelCount = 0;

        for (int i = 0; i < lower.length(); i++) {
            char c = lower.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vowelCount++;
            }
        }

        
        String reversed = "";
        for (int i = cleaned.length() - 1; i >= 0; i--) {
            reversed = reversed + cleaned.charAt(i);
        }

        // Output
        System.out.println("Cleaned: " + cleaned);
        System.out.println("First: " + first + "  Middle: " + middle + "  Last: " + last);
        System.out.println("Vowel count: " + vowelCount);
        System.out.println("Reversed: " + reversed);
	}

}
