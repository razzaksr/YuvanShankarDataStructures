package data.structures.YuvanShankarDS.schemes;

import java.util.LinkedList;
import java.util.Scanner;

public class FavoritesByLinked 
{
	public static void main(String[] args) 
	{
		LinkedList<String> items=new LinkedList<String>();
		Scanner scan=new Scanner(System.in);
		int choice=-1;
		
		do {
			System.out.println("1.AddItemLast\n2.AddItemBegin\n3.AddItemByPosition\n4.ReplaceItemByPosition\n5.RemoveItemFirst\n6.RemoveItemLast\n7.RemoveItemByPosition\n8.CheckFirst\n9.CheckLast\n10.CheckAtPosition\n11.Clear All\n12.Show List");
			choice=scan.nextInt();
			switch(choice)
			{
			case 1:items.add(scan.next());break;
			case 2:items.addFirst(scan.next());break;
			case 3:System.out.println("Enter the position following item ");
				items.add(scan.nextInt(), scan.next());break;
			case 4:System.out.println("Enter the position and replacement ");
				items.set(scan.nextInt(), scan.next());break;
			case 5:System.out.println(items.removeFirst()+" has removed from the list beginning");break;
			case 6:System.out.println(items.removeLast()+" has removed from the list end");break;
			case 7:System.out.println("Enter the position to remove ");
				System.out.println(items.remove(scan.nextInt())+" has removed by position");break;
			case 8:System.out.println(items.getFirst()+" is the beginning of the list");break;
			case 9:System.out.println(items.getLast()+" is the end of the list");break;
			case 10:System.out.println("Enter the position to find ");
				System.out.println(items.get(scan.nextInt()));break;
			case 11:items.clear();System.out.println("List is empty");break;
			case 12:System.out.println("Available items\n"+items);break;
			default:scan.close();System.out.println("Invalid choice");return;
			}
		}while(true);
	}
}
