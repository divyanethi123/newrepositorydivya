package onlineshopping;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		Set<String> s1=new HashSet<String>();
		s1.add("mobile");
		s1.add("Tv");
		s1.add("fridge");
		s1.add("laptop");
		s1.add("footware");
		s1.add("clotting");
		System.out.println(s1);
		System.out.println(s1.size());
		System.out.println(s1.isEmpty());
		System.out.println(s1.contains("Tv"));
		s1.remove("footware");
		System.out.println(s1);
		//s1.clear();
		Iterator i1=s1.iterator();
		 while(i1.hasNext())
		 {
			 System.out.println(i1.next());
		 }
	

	}

}
