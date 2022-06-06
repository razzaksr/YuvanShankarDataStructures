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
		
		System.out.println(line.dequeue()+" has deleted");
		System.out.println(line.dequeue()+" has deleted");
		
		System.out.println(line.linear(17.4F));
		System.out.println(line.linear(12.3F));
		System.out.println(line.linear(32.3F));
		
		System.out.println(line.readByPosition(3));
		System.out.println(line.readByPosition(10));
		
		System.out.println(line.readFront());
		System.out.println(line.readRear());
		
		line.iterate();
		line.quick(line.getRear(), line.getFront());
		line.iterate();
	}
}

class Line
{
	private float[] arr;
	private int frontEnd=-1,rearBegin=-1;
	
	public int getRear() {
		return rearBegin;
	}
	
	public int getFront() {
		return frontEnd;
	}
	
	public int sort(int start,int end)
	{
		float piData=arr[end];
		int init=start-1,cur;
		
		for(cur=start;cur<end;cur++)
		{
			if(arr[cur]<piData)// swapping decided
			{
				init++;
				float tmp=arr[cur];
				arr[cur]=arr[init];
				arr[init]=tmp;
			}
		}
		
		float tmp=arr[init+1];
		arr[init+1]=arr[end];
		arr[end]=tmp;
		
		return init+1;
		
	}
	
	public void quick(int start,int end)
	{
		if(end>start)
		{
			int piPoint=sort(start,end);
			quick(start, piPoint-1);
			quick(piPoint+1,end);
		}
	}
	
	public float readRear(){
		return arr[rearBegin];
	}
	
	public float readFront() {
		return arr[frontEnd];
	}
	
	public float readByPosition(int pos)
	{
		if(pos>=rearBegin&&pos<=frontEnd)
			return arr[pos];
		else
			return 0.0F;
	}
	
	public int linear(float data)
	{
		int dummy=frontEnd;
		while(dummy>=rearBegin)
		{
			if(data==arr[dummy])
				return dummy;
			dummy--;
		}
		return -1;
	}
	
	public float dequeue()
	{
		if(frontEnd==-1) {
			System.out.println("Queue is underflow");
			return -1;
		}
		else {
			frontEnd--;
			return arr[frontEnd+1];
		}
	}
	
	public void iterate()
	{
		System.out.println("Iterating all the queue elements: ");
		int dummy=rearBegin;
		while(dummy<=frontEnd)
		{
			System.out.print(arr[dummy]+" ");
			dummy++;
		}
		System.out.println();
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