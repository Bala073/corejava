package com.evergent.corejava.String;

public class StringPerformance2 {

	public static void main(String[] args) {
		String series=" ";
		for(int i=0;i<26;i++)
		{
			char ch=(char)('a'+i);
			series=series+ch;
		}
		System.out.println(series);

	}

}
