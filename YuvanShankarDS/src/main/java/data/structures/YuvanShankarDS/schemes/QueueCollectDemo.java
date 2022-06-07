package data.structures.YuvanShankarDS.schemes;

import java.util.LinkedList;
import java.util.Queue;

public class QueueCollectDemo 
{
	public static void main(String[] args) 
	{
		Queue<Character> queue=new LinkedList<Character>();
		queue.add('R');queue.add('V');queue.add('S');queue.add('B');
		System.out.println(queue);
		System.out.println(queue.remove());
	}
}
