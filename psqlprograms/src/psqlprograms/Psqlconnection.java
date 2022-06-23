package psqlprograms;
import java.sql.*;
import java.util.Scanner;

public class Psqlconnection {

	public static void main(String[] args) {
	      Statement stmt = null;
	  	System.out.println("enter your choice");
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
	      try {
	         Class.forName("org.postgresql.Driver");
	         Connection   con = DriverManager
	            .getConnection("jdbc:postgresql://localhost:5432/onlineshopping", "postgres", "root");
	         System.out.println("Opened database successfully");      
	 		switch(x)
			{
			case 1: 
				 PreparedStatement ps=con.prepareStatement("insert into amazon values(?,?,?,?)");
			     ps.setInt(1, 768);
			     ps.setString(2,"bats");
			     ps.setInt(3, 25000);
			     ps.setInt(4, 15);
			    int m=ps.executeUpdate();
			    if(m!=0)
			    {
			    	 System.out.println("insertion completed");
			    }
			    break;		    
			case 2:
				PreparedStatement ps2=con.prepareStatement("update amazon set ProductPrice=? where ProductId=? ");
				 ps2.setInt(1, 20000);
				 ps2.setInt(2, 123);
				 int n=ps2.executeUpdate();
				 if(n!=0)
				 {
					 System.out.println("updation completed");
				 }
				 break;			 
			case 3:
				PreparedStatement ps3=con.prepareStatement("delete table amazon ");
				int o=ps3.executeUpdate();
			    System.out.println("deletion completed");
			    break;	    
			case 4:
				PreparedStatement ps4=con.prepareStatement("select * from amazon");
				ResultSet rs=ps4.executeQuery();
				
				while(rs.next())
		        {
		        	System.out.println(rs.getInt(1)+" "+rs.getString("ProductName")+" "+rs.getInt(3)+" "+rs.getInt(4));
		        }		
			 }
	          }
	      catch ( Exception e ) {
	          System.err.println( e.getClass().getName()+": "+ e.getMessage() );
	          System.exit(0);
	       }

}
}



  