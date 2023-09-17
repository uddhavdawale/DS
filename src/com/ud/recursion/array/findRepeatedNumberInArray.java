package com.ud.recursion.array;

import java.util.ArrayList;

public class findRepeatedNumberInArray {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println(" find reated number in given array ..");
		int[] arr= {1,22,22,56,77,77,89,89};
		ArrayList<Integer> lst=findDupNumbsInArray(arr,0, new ArrayList<Integer>());
		System.out.println(lst);
	}

	private static ArrayList<Integer> findDupNumbsInArray(int[] arr, int i, ArrayList<Integer> arrayList) 
	{
		if(arr.length-1== i)
		{
			return arrayList;
		}
		if(arr[i]==arr[i+1])
		{
			arrayList.add(arr[i]);	
		}
		return findDupNumbsInArray(arr,++i,arrayList);
	}
}
