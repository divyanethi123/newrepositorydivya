package com.example;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class main {

	public static void main(String[] args) throws ParseException, IOException, ClassNotFoundException {
		SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");
	
		Employee e1=new Employee("divya",sd.parse("30/05/2022"),"java","developer",20000);
		Employee e2=new Employee("sravya",sd.parse("14/08/2021"),"python","developer",25000);
		System.out.println(e1.getDate());
		FileOutputStream fos=new FileOutputStream("imp.txt"); 
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(e1);
		oos.writeObject(e2);
		FileInputStream fis=new FileInputStream("imp.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Employee emp2=(Employee) ois.readObject();
		Employee emp3=(Employee) ois.readObject();
		
		System.out.println("Name: " + emp2.getName());
		System.out.println("D.O.B.: " + emp2.getDate());
		System.out.println("Department: " + emp2.getDepartment());
		System.out.println("Designation: " + emp2.getDesignation());
		System.out.println("Salary: " + emp2.getSalary());
		
		System.out.println("Name: " + emp3.getName());
		System.out.println("D.O.B.: " + emp3.getDate());
		System.out.println("Department: " + emp3.getDepartment());
		System.out.println("Designation: " + emp3.getDesignation());
		System.out.println("Salary: " + emp3.getSalary());
		
		fos.close();
		oos.close();
		fis.close();
		ois.close();
	
		
		
		
		

	}

}
