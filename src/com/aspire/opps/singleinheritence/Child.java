package com.aspire.opps.singleinheritence;

public class Child extends Parent
{
public void iphone()
{
	System.out.println("iphonefrom childclass");
}
public void bike()
{
	System.out.println("bike from childclass");
}
public static void cash()//static
{
	System.out.println("cash from child class");
}
public static void main(String[] args) 
{
 cash();//static from sameclass
 Child D=new Child();//nonstatic fromsame class
 D.bike();
 Parent E=new Parent();
 E.bunglow();//nonstatic from differentclass not need we can call it from same class also bz parent class is exteneted inchild class
 Parent.Farm();//staic from different class not needed to call from other class asit is extended
 Farm();//static from same class because we hve extended
}
}
