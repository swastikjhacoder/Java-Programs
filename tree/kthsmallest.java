package tree;
import java.util.*;

  public class TNode {
      int val;
      TNode left;
      TNode right;
      TNode() {}
      TNode(int val) { this.val = val; }
      TNode(int val, TNode left, TNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
 
public class kthsmallest {
	
	static Node insert(Node root, int x) {
        if (root == null)
            return new Node(x);
 
        // If a node is inserted in left subtree, then lCount of
        // this node is increased. For simplicity, we are
        // assuming that all keys (tried to be inserted) are
        // distinct.
        if (x < root.data) {
            root.left = insert(root.left, x);
            root.lCount++;
        }
        else if (x > root.data)
            root.right = insert(root.right, x);
        return root;
    }
 
    // Preorder traversal of BST
    static void preorder(Node root, List<Integer> v) {
        if (root == null) return;
        v.add(root.data);
        preorder(root.left, v);
        preorder(root.right, v);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
