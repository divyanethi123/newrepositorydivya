package designpatterns;

public class Singletone {
	private static Singletone instance=new Singletone();
	private Singletone()
	{
		
	}
	public static Singletone getInstance()
	{
		return instance;
		
	}
	public void showMessage()
	{
		System.out.println("this is singletone example");
	}
	
	

}
