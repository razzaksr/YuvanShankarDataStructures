package data.structures.YuvanShankarDS.schemes;

public class DemoLinkedList 
{
	public static void main(String[] args) 
	{
		Warehouse ware=new Warehouse(20);
		ware.addAtEnd('R');ware.addAtEnd('A');ware.addAtEnd('S');ware.addAtEnd('T');
		ware.addAtEnd('W');ware.addAtEnd('C');
		ware.traverse();
		ware.addAtBegin('Q');ware.addAtBegin('V');ware.addAtBegin('W');
		ware.traverse();
		ware.addAtAnyWhere(1, 'F');ware.addAtAnyWhere(5, 'K');
		ware.traverse();
		ware.removeAtBegin();ware.removeAtBegin();
		ware.traverse();
		ware.removeAtLast();ware.removeAtLast();ware.removeAtLast();
		ware.traverse();
		ware.removeAtAnyWhere(3);ware.removeAtAnyWhere(1);
		ware.traverse();
	}
}


class Warehouse
{
	private char[] list; // 10>> length, 9>> length-1
	private int head=-1;
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