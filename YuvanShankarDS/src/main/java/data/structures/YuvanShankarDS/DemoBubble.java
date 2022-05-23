package data.structures.YuvanShankarDS;

import java.util.Arrays;

public class DemoBubble 
{
	public static void bubble(int[] yet)
	{
		for(int outer=0;outer<yet.length-1;outer++)
		{
			for(int inner=0;inner<yet.length-outer-1;inner++)
			{
				if(yet[inner]<yet[inner+1])
				{
					yet[inner]+=yet[inner+1];
					yet[inner+1]=yet[inner]-yet[inner+1];
					yet[inner]-=yet[inner+1];
				}
			}
		}
	}
	public static void main(String[] args) 
	{
		int[] arr= {89,11,34,100,45,84,12};
		System.out.println(Arrays.toString(arr));
		DemoBubble.bubble(arr);
		System.out.println(Arrays.toString(arr));
	}
}
