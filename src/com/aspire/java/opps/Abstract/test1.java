package com.aspire.java.opps.Abstract;

public class test1
{
public static void main(String[] args) 
{ System.out.println("********shopping from child1******");
	Child1 c1=new Child1();
	c1.openbrowser();
	c1.enterurl();
	c1.un();
	c1.pw();
	c1.signin();
	c1.shopitem();
	c1.logout();
	System.out.println("**********shoping from Child2********");
	Child2 c2=new Child2();
	c2.openbrowser();
	c2.enterurl();
	c2.un();
	c2.pw();
	c2.signin();
	c2.shopitem();
	c2.logout();
	
}
}
