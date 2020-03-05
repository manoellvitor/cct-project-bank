import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		//Creating the accounts and setting some details!
		BankAccount c1 = new BankAccount();
		BankAccount c2 = new BankAccount();
		
		//ArrayList of Accounts
		ArrayList<BankAccount> accounts = new ArrayList<BankAccount>();
		
		//Setting values to the accounts
		//Opening accounts
		c1.setAccountNumber(1111);
		c1.setOwner("Manoel");
		c1.openAccount("CA");

		
		c2.setAccountNumber(2222);
		c2.setOwner("Liss");
		c2.openAccount("SA");
		
		accounts.add(c1);
		accounts.add(c2);
		
		for (BankAccount bankAccount : accounts) {
			bankAccount.currentStatus();
		}
	}

}
