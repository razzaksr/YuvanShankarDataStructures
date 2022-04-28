package data.structures.YuvanShankarDS;

public class DemoStack 
{
	public static void main(String[] args) 
	{
		StkPlan stk=new StkPlan();
		
		stk.traverse();
		
		stk.push("Yuvan");stk.push("Zealous");stk.push("Prakash");stk.push("Victor");
		stk.push("Prem");stk.push("Vinayak");stk.push("Sabari");stk.push("Richard");
		stk.push("Ravi");stk.push("Raj");stk.push("Sinivasan");stk.push("Snehan");
		
		stk.traverse();
	}
}

class StkPlan
{
	private String[] arr=new String[10];
	private int top=-1;
	
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