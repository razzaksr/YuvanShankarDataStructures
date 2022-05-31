package data.structures.YuvanShankarDS.schemes;

import java.util.Arrays;
import java.util.Scanner;

public class DemoLinkedList 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		int choice=0;
		
		Warehouse ware=new Warehouse(20);
		
		// Y
		
		do {
			System.out.println("1.Traverse\n2.Add At begin\n3.Add At end\n4.Add At anywhere\n5.Read At begin\n6.Read At end\n7.Read At anywhere\n8.Search\n9.Delete At begin\n10.Delete At end\n11.Delete At anywhere\n12.Sort\n13.Clear");
			choice=scan.nextInt();
			switch(choice)
			{
				case 1:ware.traverse();break;
				case 2:ware.addAtBegin(scan.next().charAt(0));break;
				case 3:ware.addAtEnd(scan.next().charAt(0));break;
				case 4:
					System.out.println("Index and Data");
					ware.addAtAnyWhere(scan.nextInt(),scan.next().charAt(0));break;
				case 5:System.out.println(ware.readAtBegin());break;
				case 6:System.out.println(ware.readAtEnd());;break;
				case 7:System.out.println("Pos ");System.out.println(ware.readAtAnyWhere(scan.nextInt()));;break;
				case 8:ware.sort();System.out.println("Tell us search data ");
				System.out.println(ware.search(0, ware.getHead(), scan.next().charAt(0)));break;
				case 12:ware.sort();break;
				case 9:ware.removeAtBegin();break;
				case 10:ware.removeAtLast();break;
				case 11:
					System.out.println("Tell us pos to remove");
					ware.removeAtAnyWhere(scan.nextInt());break;
				case 13:ware.clear();break;
				default:scan.close();return;
			}
		}while(true);
//		ware.addAtEnd('R');ware.addAtEnd('A');ware.addAtEnd('S');ware.addAtEnd('T');
//		ware.addAtEnd('W');ware.addAtEnd('C');
//		ware.traverse();
//		ware.addAtBegin('Q');ware.addAtBegin('V');ware.addAtBegin('W');
//		ware.traverse();
//		ware.addAtAnyWhere(1, 'F');ware.addAtAnyWhere(5, 'K');
//		ware.traverse();
//		ware.removeAtBegin();ware.removeAtBegin();
//		ware.traverse();
//		ware.removeAtLast();ware.removeAtLast();ware.removeAtLast();
//		ware.traverse();
//		// remove
//		ware.removeAtAnyWhere(3);ware.removeAtAnyWhere(1);
//		// list
//		ware.traverse();
//		// reading
//		System.out.println("At beginning of the list "+ware.readAtBegin());
//		System.out.println("At end of the list "+ware.readAtEnd());
//		System.out.println("At "+2+" of the list "+ware.readAtAnyWhere(2));
//		System.out.println("At "+5+" of the list "+ware.readAtAnyWhere(5));
//		ware.sort();
//		ware.traverse();
//		System.out.println("Searching V "+ware.search(0, ware.getHead(), 'V'));
//		System.out.println("Searching R "+ware.search(0, ware.getHead(), 'R'));
//		System.out.println("Searching S "+ware.search(0, ware.getHead(), 'S'));
//		System.out.println("Searching A "+ware.search(0, ware.getHead(), 'A'));
//		System.out.println("Searching W "+ware.search(0, ware.getHead(), 'W'));
//		ware.clear();
//		ware.traverse();
//		System.out.println("At beginning "+ware.readAtBegin());
	}
}


class Warehouse
{
	private char[] list; // 10>> length, 9>> length-1
	private int head=-1;
	
	public int getHead()
	{
		return head;
	}
	
	public void clear()
	{
		Arrays.fill(list, '\0');
		head=-1;
	}
	
	public void sort()
	{
		for(int hold=0;hold<=head;hold++)
		{
			for(int com=hold+1;com<=head;com++)
			{
				if(list[hold]>list[com])
				{
					char tmp=list[hold];
					list[hold]=list[com];
					list[com]=tmp;
				}
			}
		}
	}
	
	public int search(int start,int end,char data)
	{
		if(start<=end)
		{
			int mid=start+(end-start)/2;
			if(list[mid]==data)
				return mid;
			else if(list[mid]>data)
				return search(start, mid-1, data);
			else
				return search(mid+1,end,data);
		}
		else
			return -1;
	}
	
	public char readAtAnyWhere(int pos)
	{
		if(head==-1||pos>head)
			return '\0';
		else
			return list[pos];
	}
	
	public char readAtEnd()
	{
		if(head==-1)
			return '\0';
		else
			return list[head];
	}
	
	public char readAtBegin()
	{
		if(head==-1)
			return '\0';
		else
			return list[0];
	}
	
	//  
	//       p   d  h
	// 30 10 50 45 20
	public void removeAtAnyWhere(int pos)
	{
		if(head==-1){
			System.out.println("Nothing to remove at "+pos+" since list is underflow");
		}
		if(pos<=head) {
			char old=list[pos];
			int dummy=pos+1;
			while(dummy<=head)
			{
				list[dummy-1]=list[dummy];
				dummy++;
			}
			head--;
			System.out.println(old+" has removed as it was in "+pos+" of the list");
		}
	}
	
	public void removeAtLast()
	{
		if(head==-1){
			System.out.println("Nothing to remove at last since list is underflow");
		}
		else {
			head=head-1;
			System.out.println(list[head+1]+" has removed from list as remove at last requested");
		}
	}
	
	// 30  10 8  12 35 20
	// 	   d		   d  h
	// 100 30 10 8 12 35 20
	public void removeAtBegin()
	{
		if(head==-1)
		{
			System.out.println("Nothing to remove since list is underflow");
		}
		else {
			char old=list[0];
			int dummy=1;
			while(dummy<=head)
			{
				list[dummy-1]=list[dummy];
				dummy++;
			}
			head--;
			System.out.println(old+" has removed as it was in beginning of the list");
		}
	}
	
	//             p
	// 0  1  2  3  4  5
	// 10 30 10 70 3 100
	public void addAtAnyWhere(int pos,char data)
	{
		// underflow
		if(head==-1){
			System.out.println("List is underflow");
			list[0]=data;head++;
			System.out.println(data+" has inserted @ 0 not in "+pos);
		}
		if(pos<=list.length-2){
			int dummy=head;
			
			while(dummy>=pos) {
				list[dummy+1]=list[dummy];
				dummy--;
			}
			list[pos]=data;head++;
			System.out.println(data+" has inserted in linked list @ "+pos);
		}
		else {
			System.out.println("Invalid position "+pos);
		}
	}
	
	//	list  d	  d	d	d  d+1
	// newone new 89 12 34 100
	public void addAtBegin(char data)
	{
		if(head==-1){
			System.out.println("List is underflow");
			list[0]=data;head++;
		}
		else {
			int dummy=head;
			if( dummy+1 <= list.length-1 ){
				while(dummy>=0){
					list[dummy+1]=list[dummy];
					dummy--;
				}
				list[0]=data;head++;
				System.out.println(data+" has added @ beginning of the linked list");
			}
			else {
				System.out.println("Add @ begin will faild due to overflow");
			}
		}
	}
	
	public void addAtEnd(char data)
	{
		if(head==-1){
			System.out.println("List is underflow");
			list[0]=data;
			head++;
		}
		else {
			list[head+1]=data;
			head++;
		}
		System.out.println(data+" inserted @ "+head);
	}
	
	public void traverse()
	{
		for(int pos=0;pos<=head;pos++)
		{
			System.out.print(list[pos]+" ");
		}
		System.out.println();
	}
	
	public Warehouse()
	{
		System.out.println("Default Constructor");
		list=new char[10];// size 10
	}
	public Warehouse(int limit)
	{
		System.out.println("Parameterized constructor");
		list=new char[limit];
	}
	
	
}