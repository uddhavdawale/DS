package com.ud.recursion;

public class BinarySearchUsingRecursion
{
	public static void main(String args[])
	{
		int[] arr=new int[] {10,20,30,40,50,60,70,80};
		System.out.println(binarysearch(arr, 90, 0,arr.length-1));
	}

	/**
	 * this use full when array is sorted.
	 * @param arr
	 * @param target
	 * @param s
	 * @param e
	 * @return
	 */
	private static int binarysearch(int[] arr, int target, int s,int e) 
	{
		System.out.println(".");
		if(s>e)
		{
			return -1;
		}
		int mid=s+(e-s)/2;
		if(arr[mid]==target)
		{
			return mid;
		}
		if(target<arr[mid])
		{
			return binarysearch(arr, target, s, mid-1);
		}
			return binarysearch(arr, target, mid+1, e);
		
	}
	
}
