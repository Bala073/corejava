package com.evergent.corejava.constructor;
//We can also call a constructor from other constructor through this keyword within a class
public class Employee5 {
	int eno;
	String ename;
	double sal;
	public Employee5()
	{
		System.out.println("Default Constructor");
	}
	public Employee5(int eno)
	{
		this.eno = eno;
	}
	public Employee5(int eno,String ename,double sal)
	{
		this(eno);
		this.ename=ename;
		sal=sal;
	}
	public void display()
	{
		System.out.println("Eno: "+eno);
		System.out.println("Ename: "+ename);
		System.out.println("Sal: "+sal);
	}
	
	public static void main(String[] args) {
			Employee5 emp5 = new Employee5(123,"Bala",55555);
			emp5.display();
			

	}

}
