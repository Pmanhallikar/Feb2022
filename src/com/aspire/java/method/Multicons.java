package com.aspire.java.method;

public class Multicons
{
 int a;int b;
 Multicons()
 {
	 a=10; b=5;
 }
 Multicons(int i,int j)
 {
	 a=i;b=j;  
 }
 Multicons(int k,int l,int m)
 {
	a=k;
	b=l+m; 
 }
 public void addition()
 {
	System.out.println(a+b); 
 }
 public void substraction()
 {
	 System.out.println(a-b);
 }
}
