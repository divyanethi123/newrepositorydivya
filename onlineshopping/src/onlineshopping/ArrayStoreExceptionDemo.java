package onlineshopping;

public class ArrayStoreExceptionDemo {

	public static void main(String[] args) {
		Object[] name=new String[10];
		try
		{
			name[4]=10;
			System.out.println();
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
