package BankDetails;

public class SBI implements bank{
static String bank_name = "SBI";
	static String branch_id;
	static String branch;
	static String location;
	private double balance;
	private double monthly_interest_rate;
	
    
	public SBI() {
		createAccount();
	}
	
	@Override
	public void createAccount() {
		branch_id = "0295675";
		branch    = "SBI - JAIPUR";
		location  = "2C StarX Tower Bani Park Jaipur 302016";
		setMonthlyInterest(3.5);
	}

	@Override
	public void deposit(double amount) {
		if(amount>=1) {
		setBalance(balance+amount);
        System.out.println("Amount Successfully deposited");
        }
		else {
			System.out.println("Something went wrong. Try again in sometime!");
		}
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