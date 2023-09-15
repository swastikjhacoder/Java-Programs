package group2test;
import java.util.HashMap;
import java.util.Map;

class Node
{
    int data;
    Node left = null, right = null;
 
    Node(int data) {
        this.data = data;
    }
}
public class BST {
	public static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static Node createTree(int[] parent) {
        Map<Integer, Node> map = new HashMap<>();
        for (int i = 0; i < parent.length; i++) {
            map.put(i, new Node(i));
        }
        Node root = null;
        for (int i = 0; i < parent.length; i++) {
            if (parent[i] == -1) {
                root = map.get(i);
            }
            else {
                Node ptr = map.get(parent[i]);
                if (ptr.left != null) {
                    ptr.right = map.get(i);
                }
                else {
                    ptr.left = map.get(i);
                }
            }
        }
        return root;
    }
 
    public static void main(String[] args) {
        int[] parent = {8, 3, 10, 1, 6, -1, 14, -1, -1, 4, 7, 13, -1, -1, -1, -1, -1, -1, -1};
        //8 3 10 1 6 -1 14 -1 -1 4 7 13 -1 -1 -1 -1 -1 -1 -1
//        14
        Node root = createTree(parent);
        inorder(root);
    }
}
