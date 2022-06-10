package eshopping;
 abstract class OnlineShopping
{
	String userId;
	String password;
	abstract void products();
	abstract void brands();
	abstract void price();	
	void logIn()
	{
		System.out.println("user id "+userId);
		System.out.println("password "+password);
	}
}
 class Amazon extends OnlineShopping{
	void products() {
		System.out.println("product are TV, fridge, mobile...................");
		
	}
	void brands() {
		System.out.println("sony,redmi,............................");
		
	}
	void price() {
		System.out.println("160000,890888,..................");
		
	}	 
 }
 class Flipcard extends OnlineShopping{
	void products() {
		System.out.println("product are TV, fridge, mobile...................");
		
	}
	void brands() {
		System.out.println("sony,redmi,............................");
	}
	void price() {
		System.out.println("1907,1758,9056,............................");
	}	 
 }
 class FactoryMethod{	
	OnlineShopping getSite(String sitename)
	{
		if(sitename.equals("Amazon"))
			return new Amazon();
		else if(sitename.equals("Flipcard"))
			return new Flipcard();
		else
		return null;
		
	}
 }
 class FactoryMethodDemo {
	 
public static void main(String [] args)
{
	FactoryMethod fm=new FactoryMethod();
	OnlineShopping o1=fm.getSite("Amazon");
	o1.userId="bhabk";
	o1.password="jcbkzj";
	o1.logIn();
	o1.products();
	o1.brands();
	o1.price();
}
}
