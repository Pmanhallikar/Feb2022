package com.aspire.java.logical.program;

public class star4 {public static void main(String[] args) {
	for(int i=1;i<=10;i++)//i=1--- true,den enterin body,j=1 true enter into body print * den back
	{
		for(int j=1;j<=4;j++)// to j=2 true, den star print, till it reaches 4 bcz i<=4, den false
		{
			System.out.print("*");} //den next print statement blank. cut the program, next 
		{
			System.out.println();}// move i=2, true move to body j=1 true print *, den j=2 true 
	}// next print star, till it bcm false, den empty mens break den i=3
}
//EMPTY STSEMENT MOVES CURSOR NEXT LINE
}
