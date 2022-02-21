package com.aspire.java.method;

import com.aspire.java.differentpack.Differentpacakgenonstatic;



/*same class-11,12
diffrentclass-13,12,14;
diffrentpacakge-15,16,17*/
public class Nonstaticsameclass 
{
	public static void main(String[] args) 
	{
		System.out.println("startprogram");
		Nonstaticsameclass scobject= new Nonstaticsameclass();
		scobject.method11();
		scobject.method12();
		Nonstaticmethodc dcobject=new Nonstaticmethodc();
		dcobject.method12();
		dcobject.method13();
		dcobject.method14();
		Differentpacakgenonstatic dpobject=new Differentpacakgenonstatic();
		dpobject.method15();
		dpobject.method16();
		dpobject.method17();
		
		
		
		System.out.println("end of program");
	}
public void method11()
{System.out.println("runnig nonstatic method-11 from same class ");
	}
public void method12()
{System.out.println("runnig nonstatic method-12 from same class");
	}
	
	
	
}
