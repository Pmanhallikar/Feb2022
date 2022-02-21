package com.aspire.java.ifcondition;

public class nestedif {
	public static void main(String[] args)
	{
		int age=29;
		String gender= "female";
				
		if(age>=18)
		{
			System.out.println("legal voter");
			if(gender=="female" && age>=18)
			{
				System.out.println("valid age for marriage");
				if(age<30)
				{System.out.println("eligible for govt job");}
				else {System.out.println("not elsigble  gobt job");}
			}
			
			else 
			{System.out.println("not valid age marriage");
			
		}
			
		}
		else
		{System.out.println("not legal voter");
			}
	


}}
