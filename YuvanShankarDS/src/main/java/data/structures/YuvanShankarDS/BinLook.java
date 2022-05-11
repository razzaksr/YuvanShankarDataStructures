package data.structures.YuvanShankarDS;

import java.util.Arrays;

public class BinLook {
	
	public static int binSearch(double[] arr,double data,int start,int end)
	{
		if(start<=end)
		{
			int mid=start+(end)/2;// index
			if(arr[mid]==data)
				return mid;
			else if(arr[mid]<data)
				return binSearch(arr, data, mid+1, end);
			else
				return binSearch(arr, data, start, mid-1);
		}
		return -1;
	}
	
	public static void main(String[] args) {
		double[] yet= {9.1,4.5,12.9,6.5,2.1,14.5,7.2};
		Arrays.sort(yet);
		System.out.println(Arrays.toString(yet));
		
		System.out.println(BinLook.binSearch(yet, 4.5, 0, yet.length-1));
		System.out.println(BinLook.binSearch(yet, 2.1, 0, yet.length-1));
		System.out.println(BinLook.binSearch(yet, 14.5, 0, yet.length-1));
		
		System.out.println(Arrays.binarySearch(yet, 7.2));
	}
}
