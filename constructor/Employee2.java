package com.evergent.corejava.constructor;
public class Employee2 {
	int eno;
	String ename;
	double sal;
	Employee2(){
		System.out.println("Default Constructor");
	}
	Employee2(int eno1,String ename1,double sal1){
		eno=eno1;
		ename=ename1;
		sal=sal1;
	}
	public void display(){
		System.out.println("Eno: "+eno);
		System.out.println("Ename: "+ename);
		System.out.println("sal: "+sal);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee2 emp2 = new Employee2(123,"Bala",55000);
		new Employee2();
		emp2.display();
	}
}
