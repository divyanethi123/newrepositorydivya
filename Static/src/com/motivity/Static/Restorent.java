package com.motivity.Static;

public class Restorent {
	void menu()
	{
		System.out.println("1.idly 2.dosa 3.vada 4.puri 5.utapam");
	}
	void selectitem(String item)
	{
		System.out.println("item is  "+item);
	}
	String Deliver()
	{
		return "idly";
		
	}
	String payment(int price)
	{
		System.out.println("the price "+price);
		return "payment done";
		
	}
	public static void main(String[] args)
	{
		Restorent serve1=new Restorent();
		serve1.menu();
		serve1.selectitem("idly");
		System.out.println(serve1.Deliver());
		serve1.payment(100);
	}

}
