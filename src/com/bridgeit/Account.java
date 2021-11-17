package com.bridgeit;

public class Account {
	
	private String name;
	private long accountNumber;
	private int balance;
	
	public Account(String name, long accountNumber, int balance) {
		this.name = name;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getAccountNum() {
		return accountNumber;
	}

	public void setAccountNum(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	
	
	public void debit(int amount, Account account) {
		int aCBalance=account.getBalance();
		if(amount>balance) {
			System.out.println("The balance is not sufficient for withdrawl in account.no: " +account.getAccountNum());
			System.out.println("Rs." + account.getBalance() + " in your account.no: " +account.getAccountNum());
		}
		else {
			aCBalance = aCBalance - amount;
			System.out.println("Rs." + amount + " debited successfully from account.no: " +account.getAccountNum());
			account.setBalance(aCBalance);
			System.out.println("Rs." + account.getBalance() + " left in account");
		}		
	}
	
	public static void main(String[] args) {
		Account myAccount =  new Account("Naincy", 99169, 100);
		myAccount.debit(50, myAccount);
		myAccount.debit(51, myAccount);
		
	}

}