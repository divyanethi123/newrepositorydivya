package com.Assignments;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		

			LinkedList<Integer> list=new LinkedList<>();
			list.add(1);
			list.add(2);
			list.add(3);
			list.add(4);
			list.add(5);

			System.out.println("Adding the List of Values: ");
			System.out.println(list);
			int k=3;
			System.out.println("After rotating the list to the right by :"+ k +" values" );

			while(k!=0)
			{
			list.addFirst(list.removeLast());
			k--;
			}
			System.out.println(list);
			}


}
