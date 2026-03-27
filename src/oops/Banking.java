package oops;

public class Banking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount bcJack = new BankAccount("123A", "Jack", 200.0, "Savings");
		BankAccount bcAnna = new BankAccount("123b", "Anna", 1000.0, "Current");
		bcJack.deposit(100);
		
		
		bcAnna.deposit(200);           // 1
        bcJack.withdraw(150);          // 2
       bcJack.transfer(bcAnna, 33.0);    // 3
        bcAnna.deposit(100);           // 4
        bcAnna.withdraw(50);
        bcJack.displayStatement();
        bcAnna.displayStatement();

	}

}

class BankAccount{
	String accountNumber;
	String holderName;
	Double balance;
	String accountType;
	int transactionCount;
	public BankAccount(String accountNumber, String holderName, Double balance, String accountType
			) {
		super();
		this.accountNumber = accountNumber;
		this.holderName = holderName;
		if
		(balance>0) {
			this.balance = balance;
		} else {
			System.out.println("Not a valid number");
		}
		
		this.accountType = accountType;
		this.transactionCount = 0;
	}
	public double deposit(double amt) {
		if(amt>0) {
			balance = balance+amt;
			transactionCount++;
			
		}
		return balance;
	}
	public void withdraw(double amt) {
		if(amt>0) {
			balance= balance-amt;
			transactionCount++;
		}
		
	}
	
	public void transfer(BankAccount target, double amt) {
		if(amt<=0) {
			System.out.println("Not a valid amount");
		}else if(amt>balance){
			System.out.println("No Sufficient Balance ");
			
			
		}else {
			this.balance-=amt;
			target.balance+=amt;
			this.transactionCount++;
			target.transactionCount++;
		}
		
	}
	public void displayStatement() {
		
		
		 System.out.println("\n--- Account Statement ---");
	        System.out.println("Account Number: " + accountNumber);
	        System.out.println("Holder Name: " + holderName);
	        System.out.println("Account Type: " + accountType);
	        System.out.println("Balance: $" + balance);
	        System.out.println("Total Transactions: " + transactionCount);
	}
}
