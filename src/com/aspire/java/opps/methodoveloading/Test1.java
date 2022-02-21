package com.aspire.java.opps.methodoveloading;

public class Test1 

{
public static void main(String[] args) 
{
	Parent1 object=new Parent1();
	object.addition();
	object.addition(30);
	object.addition(40, 50);
	object.addition("priyanka");
	object.addition(25.0f, 40);
	Child1 object2=new Child1();
	object2.adiition(10);
}




}