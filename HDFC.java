package BankDetails;

public class HDFC implements bank{
	static String bank_name = "HDFC";
	static String branch_id;
	static String branch;
	static String location;
	private double balance;
	private double monthly_interest_rate;
    
	public HDFC() {
		createAccount();
	}
	
	@Override
	public void createAccount() {
		branch_id = "0578432";
		branch    = "HDFC - JAIPUR";
		location  = "3D Ganpati Building C-scheme Jaipur-302001";
		setMonthlyInterest(4.0);
	}

	@Override
	public void deposit(double amount) {
		setBalance(balance+amount);
	}

	@Override
	public void withdraw(double amount) {
		try
		{
			if( (this.getBalance() - amount)<0)
			{
				throw new Insufficientbalance("The withdraw amount exceeds current account balance :(");
			}
			else {setBalance(balance-amount);}
		}catch(Insufficientbalance e)
		{
			System.out.println(e);
		}
	}
    

	public void setBalance(double amt) {
		balance = amt;
	}
	
	@Override
	public double getBalance() {
		return balance;
	}

	@Override
	public double getAnnualInterest() {
		return monthly_interest_rate/100;
	}
	
	void setMonthlyInterest(double ir) {
		monthly_interest_rate = ir;
	}

}