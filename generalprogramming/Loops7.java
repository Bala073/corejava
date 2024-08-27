package com.evergent.corejava.generalprogramming;

public class Loops7 {
	public static void main(String[] args) {
		for(int i=1;i<=4;i++) {
			for(int j=0;j<i;j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		for(int i=3;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print(i);
			}
			System.out.println();
		}

	}

}
