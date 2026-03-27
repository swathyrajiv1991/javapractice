package oops;

public class Abstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Payment pay = new Payment(); 
		 // Error : Cannot instantiate Payment Class as it  is abstract class
		Payment[] payment = { new CashPayment(("Susan"), 1200.00),
				new CardPayment("Mary",1300.00,"Chase","123ertyui1234"),
				new EMIPayment("Dina", 1398.00,2),
				new UPIPayment("Licy",1290.00,"1234567")
			
		};
		for(Payment p:payment) {
			
			p.paymentProcessing();
			p.displayReceipt();
			
		}
	}

}
abstract class Payment{
	String payerName;
	Double amount;
	
	public Payment(String payerName, Double amount) {
		super();
		this.payerName = payerName;
		this.amount = amount;
	}


	abstract void paymentProcessing();
		
	
	
		void displayReceipt() {
	        System.out.println("Payer name: " + payerName);
	        System.out.println("Amount: " + amount);
	        System.out.println("Status: Completed");
	        System.out.println("------------------------");
	    
	}
}
class CashPayment extends Payment{

	public CashPayment(String payerName, Double amount) {
		super(payerName, amount);
		// TODO Auto-generated constructor stub
	}

	@Override
	void paymentProcessing() {
		// TODO Auto-generated method stub
		System.out.println(" Cash payment of " + amount + " received.");
		
	}
	
}
class CardPayment extends Payment{
public CardPayment(String payerName, Double amount,String bankName,String cardNumber) {
		super(payerName, amount);
		this.bankName = bankName;
		this.cardNumber = cardNumber;
		// TODO Auto-generated constructor stub
	}
String bankName;
String cardNumber;
	@Override
	void paymentProcessing() {
		String lastFour = cardNumber.substring(cardNumber.length()-4);
		// TODO Auto-generated method stub
		System.out.println("Card payment of " + amount + " from "+ bankName + " ending card no "+lastFour+" received.");
		
		
	}
	
}
 class UPIPayment extends Payment{
	 public UPIPayment(String payerName, Double amount,String upiId) {
		super(payerName, amount);
		this.upiId = upiId;
		// TODO Auto-generated constructor stub
	}
	 String upiId;
	 @Override
		void paymentProcessing() {
		 System.out.println("Processing ......");
		 System.out.println("Success");
			// TODO Auto-generated method stub
			
		}
 }
 
 class EMIPayment extends Payment{
	 public EMIPayment(String payerName, Double amount,int month) {
		super(payerName, amount);
		this.month = month;
		// TODO Auto-generated constructor stub
	}
	 int month;
	 
	 @Override
		void paymentProcessing() {
			// TODO Auto-generated method stub
		 Double emi = amount/month;
		 System.out.println("EMI payment selected Monthly installment is "+emi);
			
		}
 }