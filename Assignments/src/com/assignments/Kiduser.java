package com.assignments;

public class Kiduser implements LibraryUser {
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
		if(age<12)
		{
			System.out.println("you have successfully registered under a kids Account");
		}else
		{
			System.out.println("youn are not aligible for registration");
		}		
	}

	public void requestBook() {
		System.out.println("book type is"+bookType);	
	}

}