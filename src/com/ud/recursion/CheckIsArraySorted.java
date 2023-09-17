package com.ud.recursion;

public class CheckIsArraySorted 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println(" Is array sorted..");
		int[] arr=new int[] {1,2,3,4,5,6};
		boolean flag=isArraySorted(arr,1);
		System.out.println("Is Array Sorted..."+flag);
	}

	private static boolean isArraySorted(int[] arr, int i) 
	{
		// TODO Auto-generated method stub
		if(i==arr.length-1)
		{
			return true;
		}
		return arr[i]<arr[i+1] && isArraySorted(arr,++i);
	}
}
