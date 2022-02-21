package com.aspire.java.opps.overriding;

public class Child extends Parent
{
	
public void addition()
{
	int p=100; int q=200; int r=p+q;
    System.out.println("with no paremetr from cc="+r);
}
public void addition(int s,int t)
{ int u=s+t;
     System.out.println("with two int cc="+u);

}
public void addition(int v,int w, int x)
{  int y= v+w+x;
      System.out.println("with three int from cc="+y);
}
public void addition(int k ,float l)
{ float h= k+l;
	System.out.println("with 1 int & 1 float="+h);
}


















}
