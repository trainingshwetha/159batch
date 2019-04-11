/**
 * 
 */
package com.mphasis.training.basicjavaprograms;

/**
 * @author shwet
 *
 */
public class Account {
	private long acc_num;//instance varaible
	private String acc_holder_name;
	private double balance;
	 private char accoun_type;
	 
	 //constructor overloading
	 public Account() {
		 
	 }
	 public Account(long acc_num,String acc_holder_name,
			double balance){
		 this.acc_num=acc_num;
		 this.acc_holder_name=acc_holder_name;
		 this.balance=balance;
	 }
	 
	 public Account(long acc_num,String acc_holder_name,
			double balance,char account_type){
		 this.acc_num=acc_num;
		 this.acc_holder_name=acc_holder_name;
		 this.balance=balance;
		 accoun_type=account_type;
		 
	 }
	 
	public void getAccountDetails() {
		System.out.println("account_details");
		System.out.println(acc_num+" "+acc_holder_name+" "
		+balance+" "+accoun_type);
	}
	public double getBalance() {
		return balance;
	}	
	public  double withdraw(int amount) {
		return balance=balance-amount;
	}
	public double deposit(int amount) {
		return balance=balance+amount;
	}
	
	/*public static void main(String[] args) {
		Account acc1=new Account();
		acc1.acc_num=67868l;
		acc1.acc_holder_name="Manish";
		acc1.accoun_type='C';
		acc1.balance=20000;
		
		System.out.println(acc1.getBalance());
		System.out.println(acc1.withdraw(2000));

	}*/

}
