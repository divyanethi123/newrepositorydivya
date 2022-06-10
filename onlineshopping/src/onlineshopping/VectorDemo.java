package onlineshopping;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Stack;

public class VectorDemo {

	public static void main(String[] args) {
		Stack<Integer> a1=new Stack<Integer>();
		a1.add(123);
		a1.add(453);
		a1.add(768);
		a1.add(426);
		System.out.println(a1);
		System.out.println(a1.capacity());
	    System.out.println(	a1.contains(123));
	    System.out.println(a1.empty());	
	    System.out.println(a1.indexOf(453));
	    System.out.println(a1.lastIndexOf(a1));
	    System.out.println(a1.size());
	    System.out.println(a1.elementAt(3));
	    System.out.println(a1.firstElement());
	    System.out.println(a1.lastElement());
	    System.out.println(a1.pop());
	    System.out.println(a1.push(765));
	    System.out.println(a1);
	   
	    ListIterator i2=a1.listIterator();
	    while(i2.hasNext())
	    {
	
	 	System.out.println(i2.next());
	    }
	    while(i2.hasPrevious())
	    {
	    	System.out.println(i2.previous());
	    }
	    
	}


}
