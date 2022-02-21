package com.aspire.java.opps1;

public class Child extends Parent
{
int a=10; int b=20; static int x=100; static int y=50;
public void addition()
{
	System.out.println(a+b);
}
public static void addition1()
{
	System.out.println(x-y);
}
public void add()
//{ int e =this.a+super.a; same variable
{
	int a=100; int b=50;
	int h= a+this.a+super.a;
	System.out.println(a+b);
	System.out.println(a+e);
System.out.println(f+x);
System.out.println(h);
//System.out.println( e);// u can do dis only if u take same variable
//use of keyword"this and "super if same variable like aa,bb
} 

	
	
}


	
