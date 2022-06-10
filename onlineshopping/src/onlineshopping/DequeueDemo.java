package onlineshopping;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class DequeueDemo {

	public static void main(String[] args) {
	Deque<Integer> q1=new ArrayDeque<Integer>();
	q1.add(1098);
	q1.add(185);
	q1.add(8460);
	q1.add(3890);
	System.out.println(q1);
	q1.addFirst(9200);
	q1.addLast(400089);
	System.out.println(q1);
	System.out.println(q1.getFirst());
	System.out.println(q1.getLast());
	System.out.println(q1.offerFirst(1907));
	System.out.println(q1.isEmpty());
	System.out.println(q1.size());
	Iterator i1=q1.descendingIterator();
	while(i1.hasNext())
	{
		System.out.println(i1.next());
		
	}
	}
}
