

package com.aspire.java.oops.casting.nonprimitive;

public class test 
{
public static void main(String[] args)
{
	parent p=new parent();
	p.money();
	p.car();
	p.farm();
	child c=new child();
	c.money();
	c.car();
	c.farm();
	c.bike();
	parent pc=new child();
	pc.money();
	pc.car();
	pc.farm();

	
}
}
