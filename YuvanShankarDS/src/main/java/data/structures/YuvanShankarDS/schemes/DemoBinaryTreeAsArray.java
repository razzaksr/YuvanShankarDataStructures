package data.structures.YuvanShankarDS.schemes;

import java.util.Arrays;

public class DemoBinaryTreeAsArray{
	public static void main(String[] args) {
		BinArrayTree bin=new BinArrayTree();// 10
		
		bin.setRoot("Uvan Shankar");
		bin.setLeft("Cognizant", 0);
		bin.setRight("ZOHO", 0);
		bin.setLeft("Data structures", 1);
		bin.setRight("JavaSE", 1);
		bin.setLeft("C", 2);
		bin.setRight("Python", 2);
		
		bin.iterate();
		bin.inOrder(0);
		System.out.println();
		bin.preOrder(0);
		System.out.println();
		bin.postOrder(0);
		
		bin.callBFS();
		
		System.out.println("searching for JavaSE "+bin.linear(0, "JavaSE"));
		System.out.println("searching for Uvan Shankar "+bin.linear(0, "Uvan Shankar"));
		System.out.println("searching for Python "+bin.linear(0, "Python"));
		System.out.println("searching for CPP "+bin.linear(0, "CPP"));
	}
}


// '\0', 0, null
class BinArrayTree
{
	private String[] arr;
	
	public int linear(int root,String data)
	{
		if(root>=arr.length||arr[root]==null)
			return -1;
		if(arr[root].equals(data))
			return root;
		int left=linear(root*2+1,data);
		if(left!=-1)
			return left;
		else
			return linear(root*2+2,data);
	}
	
	public void callBFS()
	{
		System.out.println("BFS Traversal");
		int ht=seekHeight(0);
		for(int ind=1;ind<=ht;ind++)
			bfsTraverse(0, ind);
		System.out.println();
	}
	
	private void bfsTraverse(int root,int level)
	{
		if(root>=arr.length||arr[root]==null)
			return;
		else if(level==1)
			System.out.print(arr[root]+" ");
		else {
			bfsTraverse(root*2+1, level-1);// level-=1 or level-- level=level-1
			bfsTraverse(root*2+2, level-1);
		}
	}
	
	private int seekHeight(int root)
	{
		if(root>=arr.length||arr[root]==null)
			return 0;
		else {
			int left=seekHeight(root*2+1);
			int right=seekHeight(root*2+2);
			
			if(left>right)
				return left+1;
			else
				return right+1;
		}
	}
	
	public void postOrder(int root)	
	{
		if(root>=arr.length||arr[root]==null)
			return;
		else {
			postOrder(root*2+1);
			postOrder(root*2+2);
			System.out.print(arr[root]+" - ");
		}
	}
	
	public void preOrder(int root)
	{
		if(root>=arr.length||arr[root]==null)
			return;
		else {
			System.out.print(arr[root]+" - ");
			preOrder(root*2+1);
			preOrder(root*2+2);
		}
	}
	
	public void inOrder(int root)
	{
		if(root>=arr.length||arr[root]==null)
			return;
		else {
			inOrder(root*2+1);
			System.out.print(arr[root]+" - ");
			inOrder(root*2+2);
		}
	}
	
	public void iterate() // O(1)
	{
		System.out.println(Arrays.toString(arr));
	}
	
	public void setRight(String data,int root){
		if(arr[root]==null)
			return;
		else {
			int tmp=root*2+2;
			arr[tmp]=data;
		}
	}
	
	public void setLeft(String data,int root){
		if(arr[root]==null)
			return;
		else {
			int tmp=root*2+1;
			arr[tmp]=data;
		}
	}
	
	public void setRoot(String data){
		arr[0]=data;
	}
	
	public BinArrayTree() {arr=new String[10];}
	public BinArrayTree(int size) {arr=new String[size];}
}