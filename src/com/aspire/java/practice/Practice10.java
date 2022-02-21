package com.aspire.java.practice;

public class Practice10 // int age should stisfy all if den only all vill be printed in console
{
public static void main(String[] args) 
{ int age=30; String gender="male";
	if(age>=10)
	{System.out.println("eligible for voting");
	if(age>=21 && gender=="male")
	{
		System.out.println("valid age for marriage");
	if(age>=25)
	{System.out.println(" applicable for govt job");
	if(age>=25)
	{System.out.println(" vaild for ride");}
	else
	{System.out.println("not valid for ride");}
	
	}
	else
	{
		System.out.println("not appicable");
		}
	
	}
	else
	{
		System.out.println("not valid age for marraige");
	}
	}
	else
	{System.out.println("not eligible for voting");}
}
}
