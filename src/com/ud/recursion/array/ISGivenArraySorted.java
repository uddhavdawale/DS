package com.ud.recursion.array;

public class ISGivenArraySorted 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println(" Check whether given array sorted ..");
		int[] arr= {1,5,6,7,8,9,10,11,13};
		boolean isSorted=isSortedArray(arr,0);
		System.out.println(" IS number sorted .."+isSorted);
	}

	private static boolean isSortedArray(int[] arr, int index) 
	{
		if(index == arr.length-1)
		{
			return true;
		}
		return arr[index]<arr[index+1] && isSortedArray(arr,++index);
	}
}
