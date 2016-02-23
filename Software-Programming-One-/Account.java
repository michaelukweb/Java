
public class Account {
	
	private int number;
	private static int accountNumber = 1000;
	private int currentBalance;

	public static void main(String[] args) {
		
		Account one = new Account();

	}
	
	public Account () {
		
		accountNumber++;
		number = accountNumber;
	}
	
	//getter return account number
	public int getAccountNumber () {
		
		return accountNumber;
	}
	
	//getter return balance
	public int getBalance(){
		return currentBalance;
	}
	
	public boolean debit (double amount) {
		
		if (amount < 0 || currentBalance - amount < 0) {
			
			currentBalance -= amount;
			return false;
		} else {
		
		return true; 
		}
	}
	
	public boolean credit (double amount) {
		
		if (amount > 0) {
			
			currentBalance += amount;
			return true;
			
		} else {
			
			return false;
		}
		
		
	} 

}
