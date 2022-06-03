package data.structures.YuvanShankarDS.schemes;

public class DemoQueue 
{
	public static void main(String[] args) 
	{
		Line line=new Line(30);
		line.enqueue(2.3F);line.enqueue(12.3F);
		line.enqueue(32.3F);line.enqueue(8.3F);line.enqueue(2F);
		line.enqueue(8.1F);line.enqueue(17.4F);
		line.iterate();
	}
}

class Line
{
	private float[] arr;
	private int frontEnd=-1,rearBegin=-1;
	
	public void iterate()
	{
		System.out.println("Iterating all the queue elements");
		int dummy=rearBegin;
		while(dummy<=frontEnd)
		{
			System.out.println(arr[dummy]);
			dummy++;
		}
	}
	
	public void enqueue(float data)
	{
		if(rearBegin==-1) {
			System.out.println("Queue is underflow");
			rearBegin++;
			arr[rearBegin]=data;
			frontEnd=rearBegin;
			System.out.println(data+" has enqueued @ "+rearBegin+" end "+frontEnd);
		}
		else if(frontEnd==arr.length-1) {
			System.out.println("Queue is overflow, can't enqueue new "+data);
		}
		else
		{
			int dummy=frontEnd;
			while(dummy>=rearBegin)
			{
				//System.out.println(dummy);
				arr[dummy+1]=arr[dummy];
				dummy--;
				
			}
			arr[rearBegin]=data;
			frontEnd++;
			System.out.println(data+" has enqueued @ "+rearBegin+" end "+frontEnd);
		}
	}
	
	public Line() {arr=new float[10];}// default
	public Line(int size) {arr=new float[size];}// parameterized
}