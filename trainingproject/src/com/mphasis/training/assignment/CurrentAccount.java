package com.mphasis.training.assignment;

import com.mphasis.training.exceptions.InsufficientBalance;

public class CurrentAccount extends Account {

	public CurrentAccount(long acc_num, String acc_holder_name, double balance, String acc_created_date) {
		super(acc_num, acc_holder_name, balance, acc_created_date);
		// TODO Auto-generated constructor stub
	}
	
	public double withdraw(int amount)throws InsufficientBalance {
		if(this.balance >= (amount-10000))
		{
			balance=balance-amount;
			
		}else {
			throw new InsufficientBalance("insuffient balance");
		}
		return balance;
		
	}

}
