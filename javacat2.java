package BankDetails;

import java.util.ArrayList;
import java.util.Scanner;

public class javacat2{

	public static void main(String args[])
	{
		
		  int noOfPrsn; 
		  Scanner stdInp = new Scanner(System.in);
		  System.out.println("Enter the number of Person's to create bank account: ");
		  noOfPrsn = Integer.parseInt(stdInp.nextLine());
		  int prsn_index_max_bal = 0; double final_max_bal = 0; double crnt__max;
		  
		  String name; String email; char acnt_typ; char trns;
		  Person[] prsn = new Person[noOfPrsn]; 
		  for(int x=0; x< prsn.length;x++) 
		  {
			  System.out.println("\n------------------------"); 
			  System.out.println("|    Person ----> " + (x+1)+"    |"); 
			  System.out.println("------------------------");

			  System.out.println("Enter your Name: "); 
			  name = stdInp.nextLine();
			  
			  System.out.println("Enter your email: "); 
			  email = stdInp.nextLine();
			  
			  System.out.println("Choose from the below option for the type of account to be created (c/s):-" );
			  System.out.println(" 1. Current Account ----> 'c'");
			  System.out.println(" 2. Savings Account ----> 's'"); 
			  acnt_typ = stdInp.nextLine().charAt(0);
			  
			  prsn[x] = new Person(name,email,acnt_typ);
			  
			  System.out.println("Would you like to perform any transactions? y/n");
			  trns = stdInp.nextLine().charAt(0);
			  
			  if(trns == 'y')
			  {
				  prsn[x].transactions();
			  }
			  
			  //checking max_balance persons index
			  if(x==0)
			  {
				  prsn_index_max_bal=0;
				  final_max_bal=prsn[x].getBalance();
			  }
			  else
			  {
				  crnt_max=Math.max(final_max_bal,prsn[x].getBalance());
				  if (crnt_max == prsn[x].getBalance()) 
				  {
					  prsn_index_max_bal=x;
					  final_max_bal=prsn[x].getBalance(); 
				  }
			  }
			  
		  }
		  
		  
		if(prsn.length>=1) {
		 prsn[prsn_index_max_bal].accountDetails();}
		
		endnote();
	     
	}
	
}