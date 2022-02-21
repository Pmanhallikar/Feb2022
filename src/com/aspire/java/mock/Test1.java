package com.aspire.java.mock;

public class Test1 {
	static int x=10;
int y=20;

public static void main(String[] args) {

Test1 t1=new Test1();
//t1.x=30;(static )
//t1.y=40;(NS)

Test1 t2=new Test1();
System.out.println(t1.x);
System.out.println(t1.y);
}
}