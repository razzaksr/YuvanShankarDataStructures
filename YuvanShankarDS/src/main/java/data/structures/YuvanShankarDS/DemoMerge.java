package data.structures.YuvanShankarDS;

import java.util.Arrays;

public class DemoMerge 
{
	public static void sort(String[] arr,int start,int middle,int last)
	{
		// size of two array's not positions
		int sizeOne=middle-start+1;//6>> 0 to 5
		int sizeTwo=last-middle;//4>> 0 to 3
		
		// empty array's with sizeOne and sizeTwo
		String[] firstHalf=new String[sizeOne];
		String[] secondHalf=new String[sizeTwo];
		
		// copy elements from original arr to firstHalf and secondHalf
		for(int index=0;index<sizeOne;index++)
		{
			firstHalf[index]=arr[start+index];// 3+0,3+1,3+2
		}
		for(int index=0;index<sizeTwo;index++)
		{
			secondHalf[index]=arr[middle+1+index];// 5+1+0,5+1+1,5+1+2,5+1+3
		}
		
		// positions for both firstHalf and secondHalf array in order to traverse
		int forFirst=0,forSecond=0;
		
		int forOriginal=start;
		
		// copy elements based on comparison from firstHalf or secondHalf
		while(forFirst<sizeOne&&forSecond<sizeTwo)
		{
			if(firstHalf[forFirst].compareTo(secondHalf[forSecond])<0)
			{
				arr[forOriginal]=firstHalf[forFirst];
				forFirst++;
			}
			else
			{
				arr[forOriginal]=secondHalf[forSecond];
				forSecond++;
			}
			forOriginal++;
		}
		
		// for those which is stand individually
		while(forFirst<sizeOne)
		{
			arr[forOriginal]=firstHalf[forFirst];
			forFirst++;
			forOriginal++;
		}
		
		while(forSecond<sizeTwo)
		{
			arr[forOriginal]=secondHalf[forSecond];
			forSecond++;
			forOriginal++;
		}
		
	}
	public static void split(String[] arr, int beg, int end)
	{
		if(end>beg)
		{
			int mid=beg+(end-beg)/2;
			split(arr,beg,mid);
			split(arr,mid+1,end);
			sort(arr, beg, mid, end);
		}
	}
	
	public static void main(String[] args) 
	{
		String[] hi= {"Hiddleston","Evans","Benedict","Holland","Downey","Johanson","Ruffalo","Beggy","Hemsworth"};
		System.out.println(Arrays.toString(hi));
		DemoMerge.split(hi, 0, hi.length-1);
		System.out.println(Arrays.toString(hi));
	}
}
