package com.assignments;

public class MainDemo {

	public static void main(String[] args) {
		Kiduser user1=new Kiduser();
		user1.setAge(10);
		user1.setBookType("comedy");
		user1.registerAccount();
		user1.requestBook();
	    AdultUser user2=new AdultUser();
	    user2.setAge(20);
	    user2.setBookType("horror");
	    user2.registerAccount();
	    user2.requestBook();
		
	}

}
