package com.aspire.java.opps.overriding;

public class Testclass 
{ 
	public static void main(String[] args)
	{System.out.println("******* pc********");
	 Parent ob=new Parent();
	 ob.addition();
	 ob.addition(10,20 );
	 ob.addition(10, 20, 30);
	 ob.adiition(35.5f, 36.6f);// unique from pc
	 
	 System.out.println("************cc******");
	 Child ob1=new Child();//
	 ob1.addition();
	 ob1.addition(300,400);
	 ob1.addition(500,600 , 700);
	 ob1.addition(1000, 35000f);// unique from cc no overridding
	 ob1.adiition(3500.50f, 3600.6f);//unique from pc no over ridding
	 
	}

	

}
