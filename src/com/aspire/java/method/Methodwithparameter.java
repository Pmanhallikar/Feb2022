package com.aspire.java.method;

public class Methodwithparameter 
{
public static void main(String[] args)
{
	regularmethod(100,200);
	regularmethod(300,400);
	Methodwithparameter object=new Methodwithparameter();
	object.regularmethod2(100, 200, 300);
	object.regularmethod2(1000,2000 , 3000);
}
public static void regularmethod( int a,int b)//static and not ststic
{
	System.out.println(a+b);
}
public void regularmethod2(int a, int b, float c)//int int int different count or orther if two different method
{
	System.out.println(a+b+c);
}
}
