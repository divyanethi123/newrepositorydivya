package onlineshopping;
import java.util.LinkedList;
import java.util.List;
public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList<Integer> a1=new LinkedList<Integer>();
		a1.add(178);
		a1.add(908);
		a1.add(567);
		a1.add(426);
		a1.add(278);
		System.out.println(a1);
		System.out.println(a1.get(4));
		System.out.println(a1.isEmpty());
		System.out.println(a1.getFirst());
		System.out.println(a1.getLast());
		System.out.println(a1.element());
		System.out.println(a1.peek());
	    System.out.println(a1.peekFirst());
	    System.out.println(a1.peekLast());
	    System.out.println(a1.isEmpty());
	    System.out.println(a1.offer(908));
	    System.out.println(a1.offerFirst(178));
	    a1.removeFirstOccurrence(a1);
	    System.out.println(a1);
		for(int abc : a1) {
		   System.out.println(abc);
	      }
	}
}
