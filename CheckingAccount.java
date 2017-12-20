package Bank;

public class CheckingAccount extends BankAccount{

	@SuppressWarnings("unused")
	private int RemainingChecks;
	
	public CheckingAccount(){
	super();
	RemainingChecks = 100;
	}
	public CheckingAccount(String owner, double initialbalance, int remainingChecks){

	super(owner, initialbalance);
	this.RemainingChecks = remainingChecks;
	}
	public void UseCheck(){
		RemainingChecks--;
	}
	
	public void GetCheck(){
		RemainingChecks++;
	}
}
