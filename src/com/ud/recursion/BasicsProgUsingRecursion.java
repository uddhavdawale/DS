package com.ud.recursion;

public class BasicsProgUsingRecursion 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println("......Printing numbers.....");
		funRev(5);
		
		
	}

	private static void funRev(int i) 
	{
		// TODO Auto-generated method stub
		if(i == 0)
		{
			return ;
		}
		
		System.out.println("i :"+i);
		funRev(i--);
	}
}
