package com.Assignments;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Set;

public class question2 {

	public static void main(String[] args) {
		LinkedList<Integer> l1=new LinkedList<Integer>();
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int n3=sc.nextInt();
		int n4=sc.nextInt();
		l1.add(n1);
		l1.add(n2);
		l1.add(n3);
		l1.add(n4);
	Set<Integer> s1=new HashSet<>(l1);
		System.out.println(s1);
	

	}

}
