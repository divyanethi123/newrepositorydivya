package onlineshopping;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		List<Integer> l1=new ArrayList<Integer>();
		l1.add(176);
		l1.add(156);
		l1.add(234);
		l1.add(174);
		l1.add(265);
		System.out.println(l1);
		System.out.println(l1.get(2));
	System.out.println(	l1.lastIndexOf(l1));
	System.out.println(l1.indexOf(l1));
	System.out.println(l1.isEmpty());
	System.out.println(l1.listIterator(2));
	 Iterator i1=l1.listIterator();
	 while(i1.hasNext())
	 {
		 System.out.println(i1.next());
	 }
	}

}
