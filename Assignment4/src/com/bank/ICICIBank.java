package com.bank;

public class ICICIBank  extends GeneralBank{

	@Override
	String getSavingsInterestRate() {
		// TODO Auto-generated method stub
		return "4%";
	}

	@Override
	String getFixedDepositInterestRate() {
		// TODO Auto-generated method stub
		return "8.5%";
	}

}
