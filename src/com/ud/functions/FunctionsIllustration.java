package com.ud.functions;

import java.util.Arrays;

public class FunctionsIllustration 
{

	private static void fun1(int num) {
		// TODO Auto-generated method stub
		num=200;
		System.out.println(num);
		
		
		
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int num=100;
		fun1(num);
		System.out.println(num);
		// when pasign array, Array passess the r
		int[] arr= {4,5,6,7,8,9,10};
		func1(arr);
		// original array getting changed 
		System.out.println(Arrays.toString(arr));
	}

	private static void func1(int[] arr) 
	{
		// TODO Auto-generated method stub
		arr[0]=201;
		System.out.println(arr[0]);
	}


}
