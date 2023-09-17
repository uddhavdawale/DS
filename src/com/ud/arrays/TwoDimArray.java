package com.ud.arrays;

import java.util.Arrays;
import java.util.Iterator;

public class TwoDimArray {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//------ Array Declaration-------
		int[][] arr= {
				{1,2,3},
				{4,5,6,16},
				{7,8,9,10,11}
		};
		System.out.println("Size of array "+arr.length);
		
		// number od way to interate array:
		
		for (int[] is : arr) 
		{
			System.out.println(Arrays.toString(is));
		}
		
		// 
		System.out.println("Second way to interate ....");
		for(int i=0;i<arr.length;i++)
		{
			for(int num:arr[i])
			{
				System.out.print(num+" ");
			}
			System.out.println();
		}
		System.out.println(".....");
		//third way to print an array..
		for(int row=0;row<arr.length;row++)
		{
			for(int col=0;arr[row].length>col;col++)
			{
				System.out.print(arr[row][col]+" ");
			}
			System.out.println();
		}
	}
}
