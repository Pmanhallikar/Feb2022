package com.aspire.opps.singleinheritence;

public class Singlelvintest 
{
public static void main(String[] args)
{
	System.out.println(" pARENT PROPERTY");
Parent P=new Parent();
P.bunglow();
P.car();
P.money();
Parent.Farm();//static, changed only in parents class
System.out.println("CHILD PROPERTY");
Child C=new Child();
C.bike();
C.iphone();
C.bunglow();
C.car();
C.money();
Child.Farm();//static its wriiten in parent  class but not need to class from parent as
//its exteded to child class.  u can call from child class also
}
}
