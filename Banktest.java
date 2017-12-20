package Bank;


public class Banktest {

	public static void main(String[] args) {
		BankAccount ba = new BankAccount("Nathan", 25.00);
		l(ba.getOwner());
		l(ba.GetBalance());
		l("----------------------------------");
		SavingsAccount sa = new SavingsAccount("Bob", 125.00);
		sa.Deposit(20.00);
		sa.addintrest();
		l(sa.GetBalance());
		l("----------------------------------");
		CheckingAccount ca =new CheckingAccount("Billy", 250.00, 250);
		ca.withdraw(25.00);
		ca.UseCheck();
		l(ca.GetBalance());
		l("----------------------------------");
		Checkingwithfees caf = new Checkingwithfees ("Cheese", 500, 20);
		caf.withdraw(25.00);
		caf.Deductfees();
		caf.UseCheck();
		l(caf.GetBalance());
	}
	
	
public static void l(Object s){
	System.out.println(s);
}
}
