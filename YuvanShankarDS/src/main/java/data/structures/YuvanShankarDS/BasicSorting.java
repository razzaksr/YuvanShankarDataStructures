package data.structures.YuvanShankarDS;

import java.util.Arrays;

public class BasicSorting 
{
	public static void selection(int[] err)
	{
		for(int select=0;select<err.length;select++)
		{
			for(int compare=select+1;compare<err.length;compare++)
			{
				if(err[select]<err[compare])
				{
					err[select]+=err[compare];
					err[compare]=err[select]-err[compare];
					err[select]-=err[compare];
				}
			}
		}
	}
	public static void main(String[] args) 
	{
		int[] arr= {89,120,45,11,89,7,4,100};
		System.out.println(Arrays.toString(arr));
		BasicSorting.selection(arr);
		System.out.println(Arrays.toString(arr));
	}
}
