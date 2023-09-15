package fulltest1;

class BinaryTreeNode<T> {
	T data;
	BinaryTreeNode<T> left;
	BinaryTreeNode<T> right;

	public BinaryTreeNode(T data) {
		this.data = data;
	}
	public void setRight(BinaryTreeNode<T> root)
	{
		right=root;
		
	}
	public void setLeft(BinaryTreeNode<T> root)
	{
		left=root;
		
	}
}
