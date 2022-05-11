package data.structures.YuvanShankarDS;

import java.util.Arrays;

public class DemoQuick 
{
	
	public static int sort(double[] arr,int start,int end)
	{
		double piData=arr[end];
		int init=start-1,cur;
		
		for(cur=start;cur<end;cur++)
		{
			if(arr[cur]<piData)// swapping decided
			{
				init++;
				double tmp=arr[cur];
				arr[cur]=arr[init];
				arr[init]=tmp;
			}
		}
		
		double tmp=arr[init+1];
		arr[init+1]=arr[end];
		arr[end]=tmp;
		
		return init+1;
		
	}
	
	public static void split(double[] arr,int start,int end)
	{
		if(end>start)
		{
			int piPoint=sort(arr,start,end);
			split(arr, start, piPoint-1);
			split(arr, piPoint+1,end);
		}
	}
	
	public static void main(String[] args) 
	{
		double[] yet= {9.1,4.5,12.9,6.5,2.1,14.5,7.2};
		
		split(yet,0,yet.length-1);
		
		System.out.println(Arrays.toString(yet));
	}
}
