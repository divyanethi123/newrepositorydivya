package com.motivity;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Cheque")
public class Cheque extends Payment{
	@Column(name="chequeType")
	private String chequeType;
	@Column(name="chequeNumber")
	private int chequeNumber;
	@Column(name="Amount")
	private int amount;
	@Column(name="Signature")
	private String signature;
	public String getChequeType() {
		return chequeType;
	}
	public void setChequeType(String chequeType) {
		this.chequeType = chequeType;
	}
	public int getChequeNumber() {
		return chequeNumber;
	}
	public void setChequeNumber(int chequeNumber) {
		this.chequeNumber = chequeNumber;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getSignature() {
		return signature;
	}
	public void setSignature(String signature) {
		this.signature = signature;
	}
	

}
