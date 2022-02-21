package com.aspire.java.opps.overriding;

public class Parent 
{
public void addition()
{ int a=10; int b=20; int c=a+b;
	System.out.println("with no paremetr from pc="+c);
}
public void addition(int d,int e)
{ int f= d+e;
	System.out.println("with two int pc="+f);
	
}
public void addition(int g,int h, int i)

{int j= g+h+i;
	System.out.println("with three int from pc="+j);
}
public void adiition(float m, float n)
{ double o =m+n;
	System.out.println("with two float from pc="+o);

}

}
