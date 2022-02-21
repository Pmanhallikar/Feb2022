package com.aspire.java.whileloop;

public class whileloop4 
{public static void main(String[] args) 
{
	int i =1;
	while(i<=5)
	{int space =4;
		while(space>=i)
		{
			System.out.print(" ");
			space--;
		}
	int j=1;
		while(j<=i)
		{
		System.out.print("*");	
		j++;
		}
	System.out.println();
	i++;
	
	}
}

}
