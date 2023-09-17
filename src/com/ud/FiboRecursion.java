package com.ud;

public class FiboRecursion {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println("Find nth number fibonacci..");
		int derivedfibnum=fibbo(6);
		System.out.println(derivedfibnum);
	}

	private static int fibbo(int i) 
	{
		// TODO Auto-generated method stub
		if(i<2)
		{
			return i;
		}
		System.out.println(i);
		return fibbo(i-1)+fibbo(i-2);
	}

}
