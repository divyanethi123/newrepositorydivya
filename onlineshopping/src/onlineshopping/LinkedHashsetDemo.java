package onlineshopping;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashsetDemo {

	public static void main(String[] args) {
		LinkedHashSet<Integer> l1=new LinkedHashSet<Integer>();
		l1.add(18);
		l1.add(16);
		l1.add(29);
		l1.add(32);
		LinkedHashSet<String> l2=new LinkedHashSet<String>();
		l2.add("xyz");
		l2.add("abc");
		l2.add("fgh");
		System.out.println(l1);
		System.out.println(l2);
		System.out.println(l1.clone());
		System.out.println(l1.contains(l2));
		System.out.println(l1.isEmpty());
		l1.remove(18);
		System.out.println(l1);
		System.out.println(l2.clone());
		System.out.println(l2.size());
		System.out.println(l2.isEmpty());
		Iterator t1=l1.iterator();
		while(t1.hasNext())
		{
			System.out.println(t1.next());
		}
		Iterator t2=l2.iterator();
		while(t2.hasNext())
		{
			System.out.println(t2.next());
		}
	}

}
