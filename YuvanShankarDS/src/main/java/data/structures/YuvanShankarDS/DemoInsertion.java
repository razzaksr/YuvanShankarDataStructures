package data.structures.YuvanShankarDS;

import java.util.Arrays;

public class DemoInsertion 
{
	public static void insertion(double[] yet)
	{
		double hold=0.0;int com=0;
		for(int select=0;select<yet.length;select++)
		{
			hold=yet[select];
			com=select-1;
			while(com>=0&&yet[com]>hold)
			{
				yet[com+1]=yet[com];
				com--;
			}
			yet[com+1]=hold;
		}
	}
	public static void main(String[] args) 
	{
		double[] arr= {12.4,90.3,1.2,45.7,100.4,3.4,10.5};
		System.out.println(Arrays.toString(arr));
		DemoInsertion.insertion(arr);
		System.out.println(Arrays.toString(arr));
	}
}
