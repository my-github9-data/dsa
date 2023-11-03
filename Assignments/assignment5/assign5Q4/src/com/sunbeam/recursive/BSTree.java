package recursive;

public class BSTree {
	public class Node
	{
		private int data;
		private Node left;
		private Node right;
		
		public Node(int value)
		{
			data=value;
			left=null;
			right=null;
		}
	}
	
	private Node root;
	
	public BSTree()
	{
		root=null;
	}
	
	public boolean isEmpty()
	{
		return root==null;
	}
	
	public void addNode(Node trav,int value)
	{
		if(value<trav.data)
		{
			if(trav.left==null)
			{
				trav.left=new Node(value);
				return;
			}
			addNode(trav.left,value);
		}
		else
		{
			if(trav.right==null)
			{
				trav.right=new Node(value);
				return;
			}
			addNode(trav.right,value);
		}
	}
	
	public void addNode(int value)
	{
		if(root==null)
			root=new Node(value);
		else
			addNode(root,value);
	}
	void preOrder(Node trav)
	{
		if(trav==null)
			return;
		System.out.print(" "+trav.data);
		preOrder(trav.left);
		preOrder(trav.right);
	}
	
	void preOrder() {
		System.out.print("PreOrder : ");
		preOrder(root);
		System.out.print("");
	}
}
