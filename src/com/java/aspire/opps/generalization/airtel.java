package com.java.aspire.opps.generalization;

public class airtel implements Genera_IInterface
{

	
	public void autocall() 
	{
		
		System.out.println(" unlimited call free");
	}

	
	public void sms() 
	{
		System.out.println("100 sms free");
		
	}

	
	public void internet()
	{
		
		System.out.println( "1.5gb free");
	}
	 public void zee()// only in this class
	 {
		 System.out.println(" one month subscription");
		 
	 }

}
