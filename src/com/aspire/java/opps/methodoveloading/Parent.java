package com.aspire.java.opps.methodoveloading;

public class Parent 

{
int a=10; 
public void addition()
{ int j=10; int p= a+j;
System.out.println("addition with no parameter="+ p);
}
public void addition(int b)
{ int q= a+b;
	System.out.println("addition with 1 int parameter="+q);
}
public void addition(int c,int d)
{ int r= c+d;
	System.out.println("addition with 2 int paremeters="+r);
}
public void addition(float e, float f, float y)
{ float s=e+f+y;
	System.out.println("addition with 3 float ="+s);
}
public void addition(int g,int h,int i )
{ int t=g+h+i;
	System.out.println("addition with 3 parameter="+t);
}









}
