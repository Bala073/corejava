package com.evergent.corejava.javabeans;

public class EmployeeImpl {

	public static void main(String[] args) {
		//Initializing and retrieving the private attributes from beans
		Employee emp = new Employee();
		emp.setEno(123);
		emp.setEname("bala");
		emp.setSal(55555);
		System.out.println("Employee No:"+emp.getEno());
		System.out.println("Employee Name:"+emp.getEname());
		System.out.println("Employee sal:."+emp.getSal());

	}

}
