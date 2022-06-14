package com.assignments;

import java.util.Scanner;

public class Kiduser implements LibraryUser {
	int age;
	String bookType;
	public void registerAccount() {
		if(age<12)
		{
			System.out.println("you have successfully registered under a kids Account");
		}else
		{
		    AdultUser user2=new AdultUser();
		    user2.bookType="comedy";
		    user2.registerAccount();
		    user2.requestBook();
		}		
	}
	public void requestBook() {
		System.out.println("book type is  "+bookType);	
	}
	public static void main(String [] args)
	{
		System.out.println("enter age");
		
		 Kiduser user1=new Kiduser();
		 Scanner sc=new Scanner(System.in);
		 user1. age=sc.nextInt();
		 user1.bookType="horror";
		 user1.registerAccount();
		 user1.requestBook();
	}

}
