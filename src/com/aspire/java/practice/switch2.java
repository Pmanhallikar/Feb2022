package com.aspire.java.practice;

public class switch2
{public static void main(String[] args) {
	String A ="on";
	switch (A)
	{
	case "cw":
		System.out.println("cashwithdrewal");
		break;
	case "pw":
	System.out.println("payment");
	break;
	case "on":
		System.out.println("online paymet");
		break;
		default:
			System.out.println("wrong entry");
		
	
	}
}
}