package com.inheritence;

public class Manager extends Employe{
	
	
	public void salary() {
		System.out.println("manager salary");
	}
    public static void main(String args[]) {
    	Employe e=new Manager();
    	e.salary();
    }
}
