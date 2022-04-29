package data.structures.YuvanShankarDS;

import java.util.Scanner;

public class DemoStack 
{
	public static void main(String[] args) 
	{
		StkPlan stk=new StkPlan();
		Scanner scan=new Scanner(System.in);
		String userOption="", userInput="";
		do
		{
			System.out.println("Available options:\npush\npop\nsearch\npeek\ntraverse");
			userOption=scan.next();
			switch(userOption)
			{
			case "push":
				System.out.println("Enter the data to push: ");
				userInput=scan.next();
				stk.push(userInput);
				break;
			case "pop":
				stk.pop();
				break;
			case "search":
				System.out.println("Enter the data to push: ");
				userInput=scan.next();
				stk.search(userInput);
				break;
			case "peek":
				stk.peek();
				break;
			case "traverse":
				stk.traverse();
				break;
			default:System.out.println("Invalid user option");
			return;
			}
		}while(true);
	}
}

class StkPlan
{
	private String[] arr=new String[10];
	private int top=-1;
	
	public void search(String data)
	{
		int dummyTop=top;
		if(dummyTop==-1)
		{
			System.out.println("Stack is underflow");
		}
		else {
			while(dummyTop>-1)
			{
				if(arr[dummyTop].equals(data))
				{
					System.out.println(dummyTop+" is the position where "+data+" located");
					return;
				}
				dummyTop-=1;
			}
			System.out.println(data+" is not available in stack");
		}
	}
	
	public void peek()
	{
		if(top==-1)
		{
			System.out.println("Stack is underflow");
		}
		else {
			System.out.println(arr[top]+" is peek element");
		}
	}
	
	public void pop()
	{
		if(top==-1)
		{
			System.out.println("Stack is underflow");
		}
		else {
			System.out.println(arr[top]+" is popped");
			top-=1;
		}
	}
	
	public void traverse()
	{
		System.out.println("Stack is about to traverse");
		int dummyTop=top;
		if(dummyTop==-1)
		{
			System.out.println("Stack is underflow");
		}
		else {
			while(dummyTop>-1)
			{
				System.out.println(arr[dummyTop]);
				dummyTop--;
			}
		}
	}
	
	public void push(String data)	// O(1)
	{
		if(arr.length-1==top)
		{
			System.out.println("Stack is overflow");
		}
		else {
			if(top==-1)
			{
				System.out.println("Stack is underflow");
				top++;// -1 to 0
				arr[top]=data;
				System.out.println(data+" has pushed @ "+top+" position");
			}
			else
			{
				arr[top+1]=data;
				top++;
				System.out.println(data+" has pushed @ "+top+" position");
			}
		}
	}
}