package onlineshopping;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		SortedSet<String> a1=new TreeSet<String>();
		a1.add("Tv");
		a1.add("washing mechine");
		a1.add("mobile");
		a1.add("fridge");
		a1.add("clotting");
		System.out.println(a1);
		System.out.println(a1.first());
		System.out.println(a1.last());
		System.out.println(a1.headSet("w"));
		System.out.println(a1.tailSet("e"));
		System.out.println(a1.isEmpty());
		System.out.println(a1.contains("fridge"));
	   System.out.println( a1.size());
	   System.out.println(a1.subSet("a","s"));
	  Iterator y1=a1.iterator();
	 while(y1.hasNext()) 
	 {
		 System.out.println(y1.next());
	 }
      
	}

}
