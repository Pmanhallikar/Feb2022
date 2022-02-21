package com.aspire.java.opps.methodoveloading;

public class Testclass 
{
public static void main(String[] args) 

{
	Parent ol=new Parent();
	ol.addition();
	ol.addition(30);
	ol.addition(20, 30);
	ol.addition(0, 0, 0);
	ol.addition(10,20, 30);
	Child col=new Child();
	col.addition(100);
}
}
