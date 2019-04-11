package com.mphasis.training.view;
import com.mphasis.training.basicjavaprograms.Account;

public class BankApp {
	public static void main(String args[]) {
		Account acc2=new Account();
	Account acc1=new Account(12332,"Manish",3537,'C');
	Account acc3=new Account(12332,"Manish",3537);
	
	acc1.getAccountDetails();
	
	//System.out.println(acc1.getBalance());
	//System.out.println(	acc1.withdraw(200));
	}
}
