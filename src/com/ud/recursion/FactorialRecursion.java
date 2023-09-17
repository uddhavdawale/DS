package com.ud.recursion;

public class FactorialRecursion {

	public static void main(String[] args) 
	{
		int num=5;
		int fact=fact(num);
		System.out.println(fact);
		int sum=sumofdigit(45);
		int prod=productofdigit(45);
		System.out.println("Sum of digit "+sum);
		System.out.println("product of sum :"+prod);
	}

	private static int sumofdigit(int i) 
	{
		if(i<10)
		{
			return i;	
		}
	return	i%10 + sumofdigit(i/10);
	}
	private static int productofdigit(int i) 
	{
		if(i<10)
		{
			return i;	
		}
	return	i%10 * sumofdigit(i/10);
	}
	private static int fact(int num) {
		// TODO Auto-generated method stub
		//System.out.println(num);
		if(num==1)
		{
			return num;
		}
		return num* fact(--num);
	}

}
