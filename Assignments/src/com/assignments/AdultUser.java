package com.assignments;

public class AdultUser implements LibraryUser {
	int age;
	String bookType;

	public void registerAccount() {
		
		if(this.age>12)
		{
			System.out.println("you have successfully registered under a Adult Account");

		}
		else
		{
			System.out.println("register in  kids account");
		}
		
	}
	public void requestBook() {
		System.out.println(" book type"+ bookType);
		
	}

}
