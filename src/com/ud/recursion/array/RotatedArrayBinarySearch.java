package com.ud.recursion.array;

public class RotatedArrayBinarySearch 
{
	public static void main(String[] args) 
	{
		System.out.println(" Rotated Array Binary search..");
		pattern(8,0);
	}
	
	static void pattern(int r,int c)
	{
		if(r==0)
		{
			return;
		}
		if(c<r)
		{
			System.out.print("*");
			pattern(r, c+1);
		
		}
		else
		{
			System.out.println();
			pattern(r-1, 0);
			
		}
	}

}
