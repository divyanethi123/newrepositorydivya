package com.Assignments;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Vector;

public class Largestnumber {
	 static void printLargest(Vector<Integer> arr)
	    {

	        Collections.sort(arr, new Comparator<Integer>()
	        {
				public int compare(Integer x, Integer y) {
					Integer xy= x+y;
					Integer yx=y+x;
					
					return xy.compareTo(yx)	>0?-1:1;			}
	        });
	        Iterator it = arr.iterator();
	        while (it.hasNext())
	            System.out.print(it.next());
	    }

	public static void main(String[] args) {
		   System.out.println("Largest Number is: ");
	        Vector<Integer> arr;
	        arr = new Vector<>();
	        arr.add(189);
	        arr.add(98);
	        arr.add(12);
	        arr.add(10);
	        printLargest(arr);
	
	}

}


  

    
    
