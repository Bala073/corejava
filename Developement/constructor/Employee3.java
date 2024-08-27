package com.evergent.corejava.constructor;

public class Employee3 {
	int eno;
	String ename;
	double sal;
	Employee3()
	{
		System.out.println("Default Constructor");
	}
	Employee3(int eno,String ename,double sal)
	{
		this.eno=eno;
		this.ename=ename;
		sal=sal;
	}
	public void display()
	{
		System.out.println("Eno: "+eno);
		System.out.println("Ename: "+ename);
		System.out.println("sal: "+sal);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee3 emp2 = new Employee3(123,"Bala",55000);
		new Employee3();
		emp2.display();

	}

}
