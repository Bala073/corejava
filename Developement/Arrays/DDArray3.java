package com.evergent.corejava.arrays;

public class DDArray3 {

	public static void main(String[] args) {
		int arr[][]= new int[5][5];
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
				if(i==j || i+j==4)
				{
					System.out.print(7);
				}
				else
				{
					System.out.print(1);
				}
			}
			System.out.println();
		}


	}

}
