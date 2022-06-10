package onlineshopping;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
	Queue<Integer> q1=new PriorityQueue<Integer>();
	q1.add(165);
	q1.add(878);
	q1.add(286);
	q1.add(5617);
	q1.add(129);
	q1.add(289);
	System.out.println(q1);
   System.out.println(q1.peek());
   System.out.println(q1.poll());
   System.out.println(q1.size());
   System.out.println(q1.isEmpty());
   Iterator i1=q1.iterator();
    while(i1.hasNext())
    {
    	System.out.println(i1.next());
    }
	}

}
