package BankDetails;

public class ICICI implements bank{
	static String bank_name = "ICICI";
	static String branch_id;
	static String branch;
	static String location;
	private double balance;
	private double monthly_interest_rate;
    
	public ICICI() {
		createAccount();
	}
	
	@Override
	public void createAccount() {
		branch_id = "0457781";
		branch    = "ICICI - JAIPUR";
		location  = "2A Jagdamba Compound Shastri Nagar Jaipur-302016";
		setMonthlyInterest(4.8);
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