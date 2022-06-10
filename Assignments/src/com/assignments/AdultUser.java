package com.assignments;

public class AdultUser implements LibraryUser {
	int age;
	String bookType;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getBookType() {
		return bookType;
	}
	public void setBookType(String bookType) {
		this.bookType = bookType;
	}
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
		System.out.println(" book type"+ this.bookType);
		
	}

}
