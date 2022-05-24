package data.structures.YuvanShankarDS;

import java.util.Arrays;

public class DemoHeap 
{
	public static void order(int[] yet)
	{
		// send array to heapify
		for(int init=yet.length/2-1;init>=0;init--)
		{
			heapify(yet, yet.length, init);
		}
		
		for(int pos=yet.length-1;pos>0;pos--)
		{
			yet[0]+=yet[pos];
			yet[pos]=yet[0]-yet[pos];
			yet[0]-=yet[pos];
			
			heapify(yet, pos, 0);
		}
	}
	public static void heapify(int[] dummy,int limit,int parent)
	{
		// creating tree
		int maximum=parent;//0 
		
		int left=2*parent+1;
		int right=2*parent+2;
		
		// finds whether left is max
		if(left<limit&&dummy[left]>dummy[maximum])
			maximum=left;
		// finds whether right is max 
		if(right<limit&&dummy[right]>dummy[maximum])
			maximum=right;
		
		if(maximum!=parent)
		{
			dummy[parent]+=dummy[maximum];
			dummy[maximum]=dummy[parent]-dummy[maximum];
			dummy[parent]-=dummy[maximum];
			DemoHeap.heapify(dummy, limit, maximum);
		}
	}
	public static void main(String[] args) 
	{
		int[] arr= {89,12,56,11,34};
		System.out.println(Arrays.toString(arr));
		DemoHeap.order(arr);
		System.out.println(Arrays.toString(arr));
	}
}
