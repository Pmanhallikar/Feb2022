package com.aspire.java.method;
import com.aspire.java.different.pack.Differentpackclass;
public class Methodclass {
public static void main(String[] args)
{
	System.out.println("start program");
	method1();method2();method1();//multiple times can runned
	Differentmethodclass.method3();// only methodname
	Differentmethodclass.method2();//duplicate,classname.methodname
	Differentmethodclass .method4();//multiple run
	Differentmethodclass .method4();//classname.methodname
	Differentpackclass.method2();
	Differentpackclass.method6();
	Differentpackclass.method7();
	
	System.out.println("end of program");
	
}
public static void method1()
{System.out.println("running  method-1 same class");
	}
public static void method2()
{System.out.println("running  method-2 same class");}
}
