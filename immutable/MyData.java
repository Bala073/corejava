package com.evergent.corejava.immutable;
 final class ImmutableString{
	private final String value;
	public ImmutableString(String value) {
		this.value=value;
	}
	public String myValue() {
		return value;
	}
	public String toString() {
		return value;
	}
}
public class MyData {

	public static void main(String[] args) {
		ImmutableString str = new ImmutableString("Hello,String World!");
		System.out.println(str.myValue());
		System.out.println(str.toString());

	}

}
