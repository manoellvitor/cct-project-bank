
public class BankAccount {
	
	//Defining the properties
	private int accountNumber;
	private String type;
	private String owner;
	private float balance;
	private boolean status;
	
	//Method to show Details
	
	public void currentStatus() {
		System.out.println("-------------------------------------------");
		System.out.println("Account Number: " + getAccountNumber());
		System.out.println("Account Type: " + getType());
		System.out.println("Owner Name: " + getOwner());
		System.out.println("Balance: " + getBalance());
		System.out.println("Status: " + getStatus());
	}
	
	//Constructor
	public BankAccount() {
		this.balance = 0;
		this.status = false;
	}
	
	//Customized methods
	public void openAccount(String rType) {
		setType(rType);
		setStatus(true);
		if (rType == "CA") {
			setBalance(50);
		} else if(rType == "SA") {
			setBalance(150);
		}
		
		System.out.println("Congrats! Your account is opened! " + getType());
	}
	
	public void closeAccount() {
		if(getBalance() > 0) {
			System.out.println("Before close your Account, Withdraw all your money please!");
		}else if(getBalance() < 0) {
			System.out.println("Sorry! You can not close your account, your balance is lower then 0, please Verify!");
		}else {
			setStatus(false);
		}
	}
	
	public void depositMoney(float rValue) {
		if(getStatus()) {
			setBalance(getBalance() + rValue);
		}else {
			System.out.println("Sorry! We can not deposit money in one closed account!");
		}
	}
	
	public void withdrawMoney(float rValue) {
		if(getStatus()) {
			if(getBalance() >= rValue) {
				setBalance(getBalance() - rValue);				
			}else {
				System.out.println("Sorry! You do not have this ammount of money!");
			}
		}else {
			System.out.println("Sorry! We can not withdraw money from one closed account!");
		}
	}
	
	public void payTax() {
		float tax = 0;
		
		if(getType() == "CC") {
			tax = 12;
		}else if(getType() == "SA") {
			tax = 20;
		}
		if(getStatus()) {
			if(getBalance() > tax) {
				setBalance(getBalance() - tax);
			}else {
				System.out.println("Sorry! you do not have enought money to pay your montly tax!");
			}
		}else {
			System.out.println("Sorry! your account is closed!");
		}
		
	}
	
	
	//Getters and Setters
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public float getBalance() {
		return balance;
	}
	public void setBalance(float balance) {
		this.balance = balance;
	}
	public boolean getStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}	

}
