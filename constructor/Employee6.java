package com.evergent.corejava.constructor;
//Super is a keyword which always points to a super class constructor
 class MyEmployee
{
	int eno;
	public MyEmployee()
	{
		
	}
	public MyEmployee(int eno)
	{
		
		System.out.println("MyEmployee no: "+ eno);
	}
}
public class Employee6 extends MyEmployee {
	int eno;
	String ename;
	double sal;
	Employee6()
	{
		System.out.println("Default Constructor");
	}
	public Employee6(int eno,String ename,double sal)
	{
		super(eno);
		this.ename=ename;
		sal=sal;
	}
	public void display()
	{
		System.out.println("Ename: "+ ename);
		System.out.println("sal: "+ sal);
	}
	public static void main(String[] args) {
		new Employee6();
		Employee6 emp6 = new Employee6(123,"Bala",55555);
		emp6.display();
	
		

	}

}
