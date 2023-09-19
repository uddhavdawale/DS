package com.ud.recursion;

public class StringPalindrom {
	static int start=0;
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String str="uddhav";
		end=str.length()-1;
		boolean flag=isPalindrom(str.toCharArray());
		System.out.println(" is String palindrom = "+ flag);
		
	}
	static int end;
	private static boolean isPalindrom(char[] arr) {
		// TODO Auto-generated method stub
		// for even condition
		if(start > end)
		{
			return true;
		}
		// for condition
		if((start==end) )
		{
				return true;
		}
		 
		if(arr[start++]==arr[end--])
		{ 
			return isPalindrom(arr);
		}
		
		return false;
		
		
	}

	

}
