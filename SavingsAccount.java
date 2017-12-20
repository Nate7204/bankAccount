package Bank;


public class SavingsAccount extends BankAccount{

	private final double INTREST_RATE = 0.05;
	
	public SavingsAccount(){
		super();
		
	}
	public SavingsAccount(String owner, double initalBalance){
		super(owner, initalBalance);
	}
	public void addintrest(){
		double increaseBy = (this.GetBalance() * INTREST_RATE);
		this.Deposit(increaseBy);
	}

}
