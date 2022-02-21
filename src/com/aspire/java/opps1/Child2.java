package com.aspire.java.opps1;

public class Child2 extends Parent2
{
int a=10;int b=20; static int x=30; static int  y=40;
 public void addition()
 { 
	 int a=1; int b=2;
 
  int e=a+this.a+super.a;
	 System.out.println(a+this.a+super.a);
 }
public static void add()
{  

 System.out.println(x+y);
}
	


public static void main(String[] args)
{
	Child2 object= new Child2();
	object.addition();
}
}
