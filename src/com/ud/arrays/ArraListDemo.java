package com.ud.arrays;

import java.util.Arrays;

public class ArraListDemo 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println("Hello World . Demostarting Array list...");
		int[] arr= {3,6,1,29,20,66};
		swap(arr,1,3);
		System.out.println("Swapped Array.."+Arrays.toString(arr));
		
		System.out.println("Reverse array usin gusing two pointer Method.");
		
		reverse(arr,arr[0],arr[arr.length-1]);
		System.out.println(" Reverse Array "+Arrays.toString(arr));
		
		System.out.println(maxRange(arr,0,arr.length));
	}

	private static int maxRange(int[] arr, int start, int end)
	{
		// TODO Auto-generated method stub
		int max=arr[start];
		for(int i=start;i<end;i++)
		{
			if(max<arr[i])
			{
				max=arr[i];
			}
		}
		return max;
	}

	private static void reverse(int[] arr, int start, int end) 
	{
		// TODO Auto-generated method stub
		if(start>end)
		{
			swap(arr,start,end);
			start++;
			end--;
		}
	}

	private static void swap(int[] arr, int source, int index) 
	{
		// TODO Auto-generated method stub
		int temp=arr[source];
		arr[source]=arr[index];
		arr[index]=temp;
	}
}
