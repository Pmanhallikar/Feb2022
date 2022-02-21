package com.aspire.java.opps2;

public class Child extends Parent
{
int a=100; int b=200; static int c=300; static int d=400;

public void addition()
{
	int a=10; int b=20;
	System.out.println(a+b);
	int e=a+this.a;
	System.out.println(e);//local and same class golbalNS
	int h=a+super.a+this.a;
	System.out.println(h);//local ,global same class,global from other claa
	                     //after extendingNS
	int j =this.b+super.c;//NS variable from same class.Static from D clss
	System.out.println(j);
}                         
public static void addition1()
{ int c=30; int d=40;
	System.out.println(c+d);

}

public static void main(String[] args) 
{
	Child object=new Child();
	System.out.println(object.a);//Nvariable call from same class
	System.out.println(object.b);//nvariable from same class
	object.addition();//method call from same class NV(loacl)
	System.out.println(c);//static variable call from same class 
	System.out.println(d);//static variable call from same class
	addition1();//method call same class static vaiable(local)
	Parent object1=new Parent();
	System.out.println(object1.a);// NS variable from different class
	System.out.println(Parent.c);//static variable
	System.out.println(Parent.d);//static variable
	Parent.addition2();
}
}
