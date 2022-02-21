package com.aspire.java.method;

public class Multitext 
{
public static void main(String[] args)
{
	Multicons object1=new Multicons();
	object1.addition();
	object1.substraction();
	Multicons object2= new Multicons(50,100);
	object2.addition();
	object2.substraction();
	Multicons object3 =new Multicons(50,100,150);
			object3.addition();
	object3.substraction();
}
}
