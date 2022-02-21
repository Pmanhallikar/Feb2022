package com.aspire.java.practice;
import com.aspire.java.different.pack.Differentpackpractice;
public class staticmethodsameclass 
{
public static void main(String[] args) 
{
	System.out.println("hi m from main metheod");
	staticmethodsameclass.addtition();// we can also call by classname in same class
	differentclss.substraction();Differentpackpractice.multiplication();
}
public static void addtition()
{
	int i=10;
     int j=20;
    int sum=i+j;
    		System.out.println(sum);
	}




}



