package loop;

public class While {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num = 2; 
        
        while (true) {
            if (num * num > 500) {
                System.out.println("Number: " + num);
                System.out.println("Square: " + (num * num));
                break;
            }
            num++;
        }

	}
}
