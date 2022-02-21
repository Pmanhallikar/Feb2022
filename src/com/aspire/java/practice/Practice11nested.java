package com.aspire.java.practice;

public class Practice11nested {
public static void main(String[] args) 
{
	int age=18;String gender="female";
	if(age>=18)
	{System.out.println("eligible for voting");
	if(age>=18&& gender=="female")
	{System.out.println("eligible for marriage");
	if(age>=30)
	{System.out.println("not valid age for govt job");
	if(age>=45)
	{System.out.println("valid for wheel ride");}
	else
	{System.out.println("not valid for ride");}
	}
	else
	{System.out.println("valid for govt job");}
	}
	else
	{System.out.println("not eligible for marraige");}
	}
	else
	{System.out.println("not eligible to vote");}
}

}
