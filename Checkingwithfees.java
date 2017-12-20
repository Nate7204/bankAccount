package Bank;

public class Checkingwithfees extends CheckingAccount{

	private final double FEES = 20.00;
	
	public Checkingwithfees(){
		super();
	}
	public Checkingwithfees(String owner, double initialbalance, int initialCheckcount){
		super(owner,initialbalance, initialCheckcount);
	}
	public void Deductfees(){
		this.withdraw(FEES);
	}
}
