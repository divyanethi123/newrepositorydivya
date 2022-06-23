package com.Assignments;

import java.util.Scanner;

public class Question1 {

     
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter divided element");
		int a=sc.nextInt();
		System.out.println("enter divisor element");
		int b=sc.nextInt();
		
		Question1 q1=new Question1();
		System.out.println(q1.test(a,b));
		
	}
	/*int test(int a,int b)
	{
		 int quotient=0;
		 boolean temp=false;
		 
	     if(b<0)
	     {
	    	 b=-(-b);
	    	 temp=true;
		while(a>=b)
		{
			a=a-b;
			++quotient;		
		
		if(temp)
		{
			return -(quotient);
		}else
			return quotient;
	     }
	     
			
	}
    	 
	}
	*/
}
