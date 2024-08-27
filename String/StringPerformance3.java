package com.evergent.corejava.String;

public class StringPerformance3 {

	public static void main(String[] args) {
		StringBuilder builder = new StringBuilder();
		String series=" ";
		for(int i=0;i<26;i++)
		{
			char ch=(char)('a'+i);
			builder.append(ch);
			System.out.print(ch);
		}

	}

}
