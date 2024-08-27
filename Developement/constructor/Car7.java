package com.evergent.corejava.constructor;
class Car
{
	String color;
	int maxspeed;
	 Car()
	{
		color="white";
		maxspeed=120;
	}
	 Car(String color,int maxspeed)
	 {
		 this.color=color;
		 this.maxspeed=maxspeed;
	 }
	 void display()
	 {
		 System.out.println("Color: "+color);
		 System.out.println("maxspeed: "+ maxspeed );
	 }
}

public class Car7 extends Car {

	public static void main(String[] args) {
		Car car1 = new Car();
		Car car2 = new Car("Red",150);
		car1.display();
		car2.display();
		

	}

}
