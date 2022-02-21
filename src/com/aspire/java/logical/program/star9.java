package com.aspire.java.logical.program;
//* * * * * *
// * * * * *
//  * * * *
//   * * *
//    * *
//     *
//
public class star9 {
	public static void main(String[] args)
	{
		for(int i=1;i<=6;i++)
		{
			for(int space=1;space<=i;space++)
			{
				System.out.print(" ");
			}
		for(int j=6;j>=i;j--)
		{
		System.out.print("*"+" ");	
		}
		System.out.println();
		}
		
	}

}
