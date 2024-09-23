package com.evergent.corejava.io.serialization;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
public class DeSerializableData {

	public static void main(String[] args) {
		 try {
			  Product  p1=new Product();
			  Product p2 = new Product();
			  Product p3= new Product();
			 // FileInputStream fis= new FileInputStream("product.txt");
			  FileInputStream fis= new FileInputStream("C:\\\\Users\\\\balakishan.potla\\\\Desktop\\\\eclipse-2023-03\\\\eclipse-2023-03\\\\Product\\\\product.txt");
			  ObjectInputStream ois=new ObjectInputStream(fis);
			  Object o=ois.readObject();
			  p1 =(Product)o;
			   p2=(Product)o;
			   p3=(Product)o;
				  
				  System.out.println("Product Data :"+p1.getPid()+p1.getPname()+p1.getPrice());  
				  System.out.println("Product Data :"+p2.getPid()+p2.getPname()+p2.getPrice());  
				  System.out.println("Product Data :"+p3.getPid()+p3.getPname()+p3.getPrice());  
		  }
		catch(Exception e) {
			System.out.println("End of the file");
		}

	}

}
