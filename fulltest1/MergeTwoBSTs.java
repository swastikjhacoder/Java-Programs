package fulltest1;

import java.util.ArrayList;

public class MergeTwoBSTs {
	static void print(BinaryTreeNode<Integer> root) {
        if (root==null) return;
        print(root.left);
        System.out.print(root.data + " ");
        print(root.right);
    }

    static void printMergeTrees(BinaryTreeNode<Integer> root1, BinaryTreeNode<Integer> root2) {
        BinaryTreeNode<Integer> merged = mergeBST(root1, root2);
        print(merged);
    }

    public static void storeInOrder(BinaryTreeNode<Integer> root, ArrayList<Integer> arr) {
        if (root != null) {
            storeInOrder(root.left, arr);
            arr.add(root.data);
            storeInOrder(root.right, arr);
        }
    }

    static ArrayList<Integer> mergeSortedArrays(ArrayList<Integer> arr1, ArrayList<Integer> arr2) {
        int m = arr1.size();
        int n = arr2.size();
        ArrayList<Integer> arr = new ArrayList<>();
        int i = 0;
        int j = 0;
        while (i < m && j < n) {
            if (arr1.get(i) < arr2.get(j)) {
                arr.add(arr1.get(i));
                i++;
            } else {
                arr.add(arr2.get(j));
                j++;
            }
        }
        while (i < m) {
            arr.add(arr1.get(i));
            i++;
        }
        while (j < n) {
            arr.add(arr2.get(j));
            j++;
        }
        return arr;
    }

    static BinaryTreeNode<Integer> constructBSTFromSortedArray(ArrayList<Integer> arr, int start, int end) {
        if (start > end) {
            return null;
        }
        int mid = (start + end) / 2;
        BinaryTreeNode<Integer> node = new BinaryTreeNode<Integer>(arr.get(mid));
        node.left = constructBSTFromSortedArray(arr, start, mid - 1);
        node.right = constructBSTFromSortedArray(arr, mid + 1, end);
        return node;
    }

    static BinaryTreeNode<Integer> mergeBST(BinaryTreeNode<Integer> node1, BinaryTreeNode<Integer> node2) {
        ArrayList<Integer> temp1 = new ArrayList<Integer>();
        storeInOrder(node1, temp1);
        ArrayList<Integer> temp2 = new ArrayList<Integer>();
        storeInOrder(node2, temp2);
        ArrayList<Integer> temp3 = mergeSortedArrays(temp1, temp2);
        BinaryTreeNode<Integer> node = constructBSTFromSortedArray(temp3, 0, temp3.size() - 1);
        return node;
    }
}
