import java.util.Scanner;

public class TrafficLights {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the color: ");
        String enteredColor = scanner.next();
        switch(enteredColor) {
        case "Red":System.out.println("light:"+enteredColor+" STOP — Do not proceed.");
        break;
        case "Yellow":System.out.println("light:"+enteredColor+" CAUTION — Prepare to stop.");
        break;
        case "Green":System.out.println("light:"+enteredColor+" GO — Proceed safely.");
        break;
        default:System.out.println("Unknown signal , proceed with caution");
        break;
        		
        }
        boolean safeToGo = enteredColor.equals("Green") ? true : false;
        System.out.println("Safe to go: " + safeToGo);
	scanner.close();
	}
	

}
