package com.Assignments;

import java.util.Scanner;

public class Palindrom {

	public static void main(String[] args) {
	       Scanner scan=new Scanner(System.in);
	        System.out.println("Enter a number");

	         int n=scan.nextInt();
	        int temp=n;
	        int rev;
	        int sum=0;
	        while(n>0)
	        {
	            rev=n%10;
	            sum=(sum*10)+rev;
	            n=n/10;
	        }
	        if(temp==sum) {
	            System.out.println(" palindrome");
	        }
	        else {
	            //char[] charArray = s1.toCharArray();
	            //int str=n;
	            //char[]ch=n.toCharArray();

	        String str=parseString(n);

	        char[] charArray = str.toCharArray();

	        System.out.println(str.substring(0, 1));

	}

}

	private static String parseString(int n) {
		return null;
	}
}

	



  

 


        

        //String num=scan.next();