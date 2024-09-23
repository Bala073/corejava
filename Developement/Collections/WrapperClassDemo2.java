package com.evergent.corejava.collections;

public class WrapperClassDemo2 {

	public static void main(String[] args) {
		//float
		float f1=4.5f;
		Float f2 = new Float(f1);
		float f3 = f2.floatValue();
		
		//double
		double d1=789.99;
		Double d2 = new Double(d1);
		double d3 = d2.doubleValue();
		
		//byte
		byte b1=10;
		Byte b2 = new Byte(b1);
		byte b3=b2.byteValue();
		//float
		System.out.println("float value: "+f1);
		System.out.println("object value is: "+f2);
		System.out.println("convert float object value to prmitive"+f3);
		//double
		System.out.println("double value: "+d1);
		System.out.println("object value is :"+d2);
		System.out.println("convert double object value to primitive"+d3);
		//byte
		System.out.println("byte value :"+b1);
		System.out.println("object value is:"+b2);
		System.out.println("convert byte object value to primitive "+b3);
	}

}
