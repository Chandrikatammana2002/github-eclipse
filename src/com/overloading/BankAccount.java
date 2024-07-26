package com.overloading;

public class BankAccount {
	
	public void deposit(double a) {
		System.out.println("By Cash "+ a);
	}
	public void deposit(String checkNo, double a) {
		System.out.println("Using Check "+ a);
	}
	public static void main(String args[]) {
		BankAccount b=new BankAccount();
		b.deposit(1000);
		b.deposit("CHK8124",9000);
	}

}
