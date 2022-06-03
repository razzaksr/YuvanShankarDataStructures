package data.structures.YuvanShankarDS.schemes;

import java.util.LinkedList;
import java.util.ListIterator;

/*
 * LinkedList>> List
 * 
 * addFirst
 * addLast/add
 * add(pos,object)
 * 
 * get(pos)
 * getFirst
 * getLast
 * 
 * remove/removeFirst
 * removeLast
 * remove(pos)
 * remove(object)
 * 
 * indexOf(object)
 * 
 * clear
 */

public class ListCollectDemo 
{
	public static void main(String[] args) 
	{
		LinkedList<Double> list=new LinkedList<Double>();
		list.add(3.4);list.add(78.4);list.addFirst(2.1);list.addLast(91.4);
		list.add(1,45.8);list.addFirst(100.93);
		
		System.out.println(list);
		
		list.removeLast();
		list.remove(2);
		System.out.println(list);
		
		System.out.println(list.getLast());
		
		System.out.println(list.get(2));
		
		list.remove();
		
		System.out.println(list.getFirst());
		
		System.out.println(list.indexOf(3.4));
		
		list.set(1, 55.9);
		
		//System.out.println(list);
		
		ListIterator<Double> li=list.listIterator();
		while(li.hasNext())
		{
			System.out.println(li.next());
		}
		
		
		list.clear();
		
		System.out.println(list.size());
	}
}
