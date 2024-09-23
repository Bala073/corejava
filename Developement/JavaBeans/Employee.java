package com.evergent.corejava.javabeans;
import java.io.Serializable;
class Employee implements Serializable {
	private int eno;
	private String ename;
	private double sal;
	public void setEno(int eno) {
		this.eno=eno;
	}
	public int getEno() {
		return eno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
}
