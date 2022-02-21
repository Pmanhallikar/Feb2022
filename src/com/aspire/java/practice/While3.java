package com.aspire.java.practice;

public class While3
{public static void main(String[] args) 
{
	int i=1;
while(i<=5)
{int space=4;
	while(space>=i)
{
	System.out.print(" ");
   space--;}
	int j=1;
	while(j<=i)
	{
		System.out.print("*");
	j++;}
	System.out.println();
	i++;
	}

}}
