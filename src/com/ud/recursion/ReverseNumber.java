package com.ud.recursion;

public class ReverseNumber 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int num=reverse(5678);
		System.out.println(num);
		String num1=1323+"";
	}

	private static int reverse(int i) 
	{
		// TODO Auto-generated method stub
		if(i<10)
		{
			return reverse(i);
		}
		System.out.println(i%10);
		return reverse(i);
	}
}
