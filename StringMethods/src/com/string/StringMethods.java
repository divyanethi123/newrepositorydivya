package com.string;

public class StringMethods {
    String str="welcome to motivity labs ";
    String str2="position of java developer";
    void test()
    {
    	char result=str.charAt(1);// character at index 1
    	System.out.println(result);
    	int result1=str.codePointAt(2);//character at index 2 2nd index unicode value
    	System.out.println(result1);
    	System.out.println(str.compareTo(str2));//compare str and str2 values
    	System.out.println(str.concat(str2));
    	System.out.println(str.contains("welcome"));
    	System.out.println(str.equals(str2));
    	System.out.println(str.indexOf("labs"));
    	System.out.println(str.isEmpty());
    	System.out.println(str2.lastIndexOf("developer"));
    	System.out.println(str.length());
    	System.out.println(str.replace('l', 'h'));
    	System.out.println(str.toUpperCase());
    	System.out.println(str.toLowerCase());
    }
    public static void main(String [] args)
    {
    	StringMethods s1=new StringMethods();
    	s1.test();
    }
}
