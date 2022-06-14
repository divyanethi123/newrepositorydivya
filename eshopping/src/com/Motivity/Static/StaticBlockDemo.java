package com.Motivity.Static;

public class StaticBlockDemo {

		public static void main(String[] args) throws ClassNotFoundException {
			System.out.println("this is static main method");
			Class.forName("com.Motivity.Static.TestStatic");
	}
}

class TestStatic{
	 static
	 {
		 System.out.println("this is static block in Teststatic class");
	 }
}



