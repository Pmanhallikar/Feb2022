package com.aspire.java.opps1;

public class Child1 extends Parent1
{
int c=100; int d=200; static int e=300; static int f=400;
public void add2()
{ int g=10;
int h=20;
System.out.println("from child class and nonstatic");
System.out.println(g+h+"local variable");
System.out.println(c+d+"Globalvaraible and Non staic ");
System.out.println(e+f+" both static variable");
System.out.println(c+f+"Global non static varaible and Global staticvaraible ");
System.out.println(a+g+" Global ns from parentclass+");
	

}
public static void add3()
{ System.out.println("static variable");
	System.out.println(e+f+" global staic varibale");

	

}
}
