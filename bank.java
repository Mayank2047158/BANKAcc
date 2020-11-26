package BankDetails;

interface bank 
{
	void createAccount(); // Creating new account for particular bank
	
	void deposit(double amount); 
	
	void withdraw(double amount);
	
	double getBalance(); //Returns balance
	
	double getAnnualInterest(); //Returns annual interest
}