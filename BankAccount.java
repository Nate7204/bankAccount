package Bank;

public class BankAccount {

	private String owner;
	private double balance;
	
	
	public BankAccount(){
		owner = "Naven";
		balance = 0.00;
		
	}
	
	public BankAccount(String owner, double balance){
		this.owner = owner;
		this.balance = balance;
	}
	
	public void Deposit (double amount){
		balance += amount;
	
	}
	public void withdraw(double amount){
		balance -= amount;
	}
	public String getOwner(){
		return this.owner;
	}
	public double GetBalance(){
		return this.balance;
	}
	
}

