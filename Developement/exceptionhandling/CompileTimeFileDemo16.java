package com.evergent.corejava.exceptionhandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CompileTimeFileDemo16 {

	public static void main(String[] args) {
		try {
			File file = new File("c:/mydata/myinfo.txt");
			Scanner sc = new Scanner(file);
			while(sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		}
		catch(FileNotFoundException e) {
			System.out.println("file not found Exception "+e.getMessage());
			e.printStackTrace();
		}

	}

}
