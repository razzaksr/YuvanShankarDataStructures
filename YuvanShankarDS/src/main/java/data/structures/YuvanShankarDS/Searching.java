package data.structures.YuvanShankarDS;

public class Searching 
{
	public static int linearByLoop(char[] term,char data)
	{
		for(int index=0;index<term.length;index++)
		{
			if(term[index]==data)
				return index;
		}
		return -1;
	}
	public static int linearByRecursion(char[] yet,char data,int current)
	{
		if(current<yet.length)
		{
			if(yet[current]==data)
			{
				return current;
			}
			else
			{
				current++;
				return linearByRecursion(yet, data, current);
			}
		}
		return -1;
	}
	public static void main(String[] args) 
	{
		char[] store= {'E','R','Q','A','P','D'};
		System.out.println(Searching.linearByLoop(store, 'q'));
		System.out.println(Searching.linearByLoop(store, 'P'));
		
		System.out.println(Searching.linearByRecursion(store, 'D', 0));
	}
}

