package com.java_Methods;

public class BankAccount {
	String accountHolderName="VinodKethavath";
	long accountNumber=410027885;
	static int balance=1000;
	
	static void deposit() {
		int amount =500;
		balance=balance+amount;
		
		
	}
	static void withdraw() {
		int amount =300;
		balance=balance-amount;
		
		
	}
	

	public static void main(String[] args) {
		BankAccount t=new BankAccount();
		System.out.println("accountHolderName:"+t.accountHolderName);
		System.out.println("accountNumber:"+t.accountNumber);
		deposit();
		withdraw();
		System.out.println("final balance:"+ balance);
		

	}

}
