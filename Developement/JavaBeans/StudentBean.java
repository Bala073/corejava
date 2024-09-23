package com.evergent.corejava.javabeans;

import java.io.Serializable;

public class StudentBean implements Serializable {
	 private String sname;
	 private String address;
	 private int sno;
	 public void setSname(String sname) {
		this.sname = sname;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String toString() {
		return "Student No:"+sno+"\n Student Name:"+sname+"\n Student Address:"+address;
	}	
}
