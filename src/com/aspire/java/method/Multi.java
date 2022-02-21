package com.aspire.java.method;

public class Multi 
{int a;int b;
Multi()
{a=30;
b=20;
	
}
Multi(int c,int d)
{
 a=c;b=d;
}
Multi(int e,int f,int g)
{
	a=e;b=f+g;
}
public static void main(String[] args)
{
Multi object=new Multi();
object.method1();
Multi object2=new Multi(30,40);
object2.method1();
Multi object3=new Multi(10000,20,10);
object3.method1();
}
public void method1()
{
	System.out.println(a+b);
	System.out.println(a-b);
}
}
