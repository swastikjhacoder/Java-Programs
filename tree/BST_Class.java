package tree;
class BSTDeleteReturn {
	BinaryTreeNode<Integer> root;
	boolean deleted;
	
	public BSTDeleteReturn(BinaryTreeNode<Integer> root, boolean deleted)
	{
		this.root=root;
		this.deleted=deleted;
	}
}

public class BST_Class {
	private BinaryTreeNode<Integer> root;
    private int size;
    
	public void insert(int data) {
		//Implement the insert() function
		root = insertHelper(root,data);
		size++;
    }
    
    private static BinaryTreeNode<Integer> insertHelper(BinaryTreeNode<Integer> root, int x)
	{
		if (root==null)
		{
			BinaryTreeNode<Integer> newRoot = new BinaryTreeNode<Integer>(x);
			return newRoot;
		}
		
		if (x>root.data)
		{
			root.right=insertHelper(root.right,x);
		}
		else
		{
			root.left=insertHelper(root.left,x);
		}
		return root;
	}
	
	public void remove(int data) {
		//Implement the remove() function
		BSTDeleteReturn output = deleteDataHelper(root,data);
		root=output.root;
		if (output.deleted)
		{
			size--;
		}
		//return output.deleted;
    }
    
    private static BSTDeleteReturn deleteDataHelper(BinaryTreeNode<Integer> root, int x)
	{
		if (root == null)
			return new BSTDeleteReturn(null,false);
		
		if (root.data < x)
		{
			BSTDeleteReturn outputRight = deleteDataHelper(root.right,x);
			root.right = outputRight.root;
			outputRight.root=root;
			return outputRight;
		}
		
		if (root.data>x)
		{
			BSTDeleteReturn outputLeft = deleteDataHelper(root.left,x);
			root.left = outputLeft.root;
			outputLeft.root=root;
			return outputLeft;
		}
		
		//Now, we handle the three sub cases where root.data=x
		//Handling case where root has no children
		if (root.left == null && root.right == null)
			return new BSTDeleteReturn(null,true);
		
		//Handling case where only left child is present
		if (root.left!=null && root.right==null)
			return new BSTDeleteReturn(root.left,true);
		
		//Handling case where only right child is present
		if (root.right!=null && root.left==null)
			return new BSTDeleteReturn(root.right,true);
			
		//Both children are present
		//Get the smallest node's data from right subtree
		int rightSmallest=minimum(root.right);
		
		//Replace current root's data with smallest node's data
		root.data=rightSmallest;
		
		//Now, delete the node with the smallest value from the right subtree
		BSTDeleteReturn outputRight = deleteDataHelper(root.right,rightSmallest);
		
		//Update the current root's right child, after removing the node with smallest value
		root.right=outputRight.root;
		
		return new BSTDeleteReturn(root,true);
	}
	
	//Find the smallest data value in the binary tree
	private static int minimum(BinaryTreeNode<Integer> root)
	{
		if(root==null)
			return Integer.MAX_VALUE;
		
		int leftMin=minimum(root.left);
		int rightMin=minimum(root.right);
		
		return Math.min(root.data, Math.min(leftMin, rightMin));
	}
	
	public void printTree() {
		//Implement the printTree() function
        printTreeDetailed(root);
	}
    
    private static void printTreeDetailed(BinaryTreeNode<Integer> root)
	{
		if (root==null)
		{
			return;
		}
		System.out.print(root.data+":");
		if (root.left!=null)
		{
			System.out.print("L:"+root.left.data+",");
		}
		if (root.right!=null)
		{
			System.out.print("R:"+root.right.data);			
		}
		System.out.println();
		printTreeDetailed(root.left);
		printTreeDetailed(root.right);
	}
	
	public boolean search(int data) {
		//Implement the search() function
        return isPresentHelper(root,data);
	}
    
    private static boolean isPresentHelper(BinaryTreeNode<Integer> root, int x)
	{
		if (root==null)
			return false;
		
		if (root.data==x)
			return true;
		
		if (x<root.data)
		{
			return isPresentHelper(root.left,x);
		}
		else
		{
			return isPresentHelper(root.right,x);
		}
	}
}
