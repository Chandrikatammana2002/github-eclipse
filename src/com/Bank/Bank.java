package com.Bank;
//encapsulation

public class Bank {
	
	int accNo;
	String accName;
	public Bank(int accNo, String accName) {
		super();
		this.accNo = accNo;
		this.accName = accName;
	}
	@Override
	public String toString() {
		return "Bank [accNo=" + accNo + ", accName=" + accName + "]";
	}
	
	class Locker{
		int lno;
		String lname;
		public Locker() {
			lno = 123;
			lname="locker";
			
		}
		
		public void lockerInfo() {
			System.out.println(lno + " "+ lname);
		}
	}
	
	public static void main(String args[]) {
		Bank b=new Bank(123,"MyAccount");
		System.out.println(b);
		
		Locker l=b.new Locker();
		l.lockerInfo();
	}
	

}
