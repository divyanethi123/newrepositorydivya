package com.bank;

public class main {

	public static void main(String[] args) {
		ICICIBank p1=new ICICIBank();
		System.out.println("icici bank fixed deposite percentage   "+p1.getFixedDepositInterestRate());
		System.out.println("icici bank saving interest rate percentage  "+p1.getSavingsInterestRate());
		
		KotMBank k=new KotMBank();
		
		System.out.println("kotMBank  fixed deposite percentage "+k.getFixedDepositInterestRate());
		System.out.println("kotMBank bank saving interest rate percentage "+k.getSavingsInterestRate());
		
		GeneralBank g1=new KotMBank();
		System.out.println("kotMBank  fixed deposite percentage "+k.getFixedDepositInterestRate());
		System.out.println("kotMBank bank saving interest rate percentage "+k.getSavingsInterestRate());
		
		
	     GeneralBank g2=new ICICIBank();
	 	System.out.println( "icici bank fixed deposite percentage   "+p1.getFixedDepositInterestRate());
		System.out.println("icici bank saving interest rate percentage "+p1.getSavingsInterestRate());
		
		

	}

}
