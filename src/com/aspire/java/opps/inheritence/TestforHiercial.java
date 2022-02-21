package com.aspire.java.opps.inheritence;

public class TestforHiercial 
{
public static void main(String[] args)
{
	System.out.println("************shoping for laptop****************");
	Child1 c1=new Child1();
	c1.browser();
	c1.flipkart();
	c1.Cretdential();
	c1.laptop();
	c1.payment();
	
	System.out.println("************shoping for mobile***************");
	Child2 c2=new Child2();
	c2.browser();
	c2.flipkart();
	c2.Cretdential();
	c2.mobile();
	c2.payment();
	
	System.out.println("***********shoping for Dslr******************");
	
	Child3 c3=new Child3();
	c3.browser();
	c3.flipkart();
	c3.Cretdential();
	c3.Dslr();
	c3.payment();
}
}
