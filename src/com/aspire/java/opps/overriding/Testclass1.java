package com.aspire.java.opps.overriding;

public class Testclass1
{
public static void main(String[] args)
{
	Parent1 ob=new Parent1();
	ob.car();
	ob.bunglow();
	ob.farm();//unique
	ob.money();
	ob.sub();
//default
	Child1 ob1=new Child1();
	ob1.bike();//unique
	ob1.car();//common but it vill take on from child class bcz of overridding
	ob1.bunglow();//common(it vill not show in object bcz over ridding)
	ob1.money();//commom(it vill show only unique things like farm)
	ob1.farm();// dis unique no over ridding
	ob1.sub();
	
	

}
}
