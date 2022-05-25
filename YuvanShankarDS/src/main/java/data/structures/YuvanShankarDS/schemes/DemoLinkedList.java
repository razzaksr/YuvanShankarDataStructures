package data.structures.YuvanShankarDS.schemes;

public class DemoLinkedList 
{
	public static void main(String[] args) 
	{
		Warehouse ware=new Warehouse(20);
		ware.addAtEnd('R');ware.addAtEnd('A');ware.addAtEnd('S');ware.addAtEnd('T');
		ware.addAtEnd('W');ware.addAtEnd('C');
		ware.traverse();
	}
}


class Warehouse
{
	private char[] list;
	private int head=-1;
	
	// newone 89 12 34 100
	public void addAtBegin(char data)
	{
		if(head==-1){
			System.out.println("List is underflow");
			list[0]=data;head++;
		}
		else {
			
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