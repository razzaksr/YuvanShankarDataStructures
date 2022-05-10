package data.structures.YuvanShankarDS;

import java.util.Arrays;

/*
 * Wrapper classes:
 * Integer, Double, Short, Long, Character, Boolean, Float, Byte
 * data types:
 * int, double,short,long,char,boolean,float,byte
 */

public class RecursionDemo 
{
	public static void perform(Double[] yet,int pos)
	{
		if(pos<yet.length)
		{
			System.out.println(yet[pos]);
			pos++;
			RecursionDemo.perform(yet, pos);
		}
		return;
	}
	public static void hello(Object[] tmp)
	{
		System.out.println("List in hello method\n"+Arrays.toString(tmp));
	}
	public static void main(String[] args) 
	{
		Double[] tmp= {3.4,9.1,34.6,1.2,4.8,5.1,3.3,17.4,5.1,3.3};
		
		System.out.println(tmp);
		System.out.println("Using typical loop");
		for(int index=0;index<tmp.length;index++)
		{
			System.out.println(tmp[index]);
		}
		System.out.println("Using for each loop");
		for(double hai:tmp)
		{
			System.out.println(hai);
		}
		
		System.out.println("List within main\n"+Arrays.toString(tmp));
		
		RecursionDemo.hello((Object[])tmp);
		RecursionDemo.perform(tmp, 0);
		
	}
}
