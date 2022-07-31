package com.bank;

import java.util.ArrayList;
import java.util.Collection;

public class EmployeeDB {

	public static void main(String[] args) {
	 ArrayList<String> a1=new ArrayList();
	 Employee e1=new Employee();
	 e1.empid=123;
	 e1.empName="divya";
	 e1.email="divya@123";
	 e1.gender="female";
	 e1.salary=1500.09f;
	 Employee e2=new Employee();
	 e2.empid=109;
	 e2.empName="sravya";
	 e2.email="sravya@123";
	 e2.gender="female";
	 e2.salary=1800.09f;
	 Employee e3=new Employee();
	 e3.empid=108;
	 e3.empName="ramu";
	 e3.email="ramu@123";
	 e3.gender="male";
	 e3.salary=12300.09f;
	 a1.addAll((Collection<? extends String>) e1);
	 a1.addAll((Collection<? extends String>) e2);
	 a1.addAll((Collection<? extends String>) e3);
	 System.out.println(a1);
	

	}

}
