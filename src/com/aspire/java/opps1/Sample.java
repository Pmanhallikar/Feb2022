package com.aspire.java.opps1;
public class Sample
{ int a=10; static int x=25; int b=20;
static int y=40;
	public static void main(String[] args) 
{
	Sample object=new Sample();
	object.addition();
	System.out.println(object.a);//nonstatic variable from d same class
	System.out.println(x);//static variable from same class	
	System.out.println(Sample2.g);// static variable from differentclass
	System.out.println(Sample2.h);
	Sample2 object2=new Sample2();
	System.out.println(object2.e);//non ststiv=c variable from different class
	System.out.println(object2.f);
		
}
public  void addition()
{
	System.out.println(a+b);
	System.out.println(x+a);
}
}
