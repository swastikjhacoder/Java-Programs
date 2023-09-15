package tree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Pair {
	int minimum;
	int maximum;
	public int max;
	public int min;
	public boolean isBST;
	public int height;

	public Pair() {
		this.minimum = minimum;
		this.maximum = maximum;
	}

}

public class PreOrderTraversal {
	
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	
//	private static Pair takeInput1() throws NumberFormatException, IOException {
//    	int n = Integer.parseInt(br.readLine().trim());
//
//    	int pre[] = new int[n];
//    	int in[] = new int[n];
//
//    	String[] preOrder = br.readLine().trim().split(" ");
//    	String[] inOrder = br.readLine().trim().split(" ");
//
//
//    	for (int i = 0; i < n; i++) {
//    		pre[i] = Integer.parseInt(preOrder[i].trim());
//    		in[i] = Integer.parseInt(inOrder[i].trim());
//    	}
//
//    	return new Pair(pre, in);
//
//    }

	public static BinaryTreeNode<Integer> takeInput() throws NumberFormatException, IOException {
		QueueUsingLL<BinaryTreeNode<Integer>>  pendingNodes = new QueueUsingLL<BinaryTreeNode<Integer>>(); 
		int start = 0;

		String[] nodeDatas = br.readLine().trim().split(" ");

		int rootData = Integer.parseInt(nodeDatas[start]);
		start += 1;

		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
		pendingNodes.enqueue(root);

		while(!pendingNodes.isEmpty()){
			BinaryTreeNode<Integer> currentNode;
			try {
				currentNode = pendingNodes.dequeue();
			} catch (QueueEmptyException e) {
				return null;
			}

			int leftChildData = Integer.parseInt(nodeDatas[start]);
			start += 1;

			if(leftChildData != -1){
				BinaryTreeNode<Integer> leftChild = new BinaryTreeNode<Integer>(leftChildData);
				currentNode.left = leftChild;
				pendingNodes.enqueue(leftChild);
			}

			int rightChildData = Integer.parseInt(nodeDatas[start]);
			start += 1;

			if(rightChildData != -1){
				BinaryTreeNode<Integer> rightChild = new BinaryTreeNode<Integer>(rightChildData);
				currentNode.right = rightChild;
				pendingNodes.enqueue(rightChild);
			}
		}

		return root;
	}
	
	public static void preOrder(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return;
		}
		System.out.print(root.data + " ");
		preOrder(root.left);
		preOrder(root.right);
	}
	
	public static void postOrder(BinaryTreeNode<Integer> root) {
		if (root == null)
            return;
		postOrder(root.left);
		postOrder(root.right);
        System.out.print(root.data + " ");
	}
	
	public static int countNodesGreaterThanX(BinaryTreeNode<Integer> root, int x) {
		if (root==null) {
			return 0;
		}
//        int result = countNodesGreaterThanX(root.left, x) + countNodesGreaterThanX(root.right, x);
        int leftGreater = countNodesGreaterThanX(root.left, x);
        int rightGreater = countNodesGreaterThanX(root.right, x);
        if (root.data > x) {
            return leftGreater + rightGreater + 1;
        }else {
            return leftGreater + rightGreater;
        }
	}
	
	public static void inOrder(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return;
		}

		inOrder(root.left);
		System.out.print(root.data + " ");
		inOrder(root.right);

	}
	
	public static int height(BinaryTreeNode<Integer> root) {
		if (root == null)
            return 0;
        else {
            int leftHeight = height(root.left);
            int rightHeight = height(root.right);
            if (leftHeight > rightHeight)
                return (leftHeight + 1);
            else
                return (rightHeight + 1);
        }
	}
	
	public static void changeToDepthTree(BinaryTreeNode<Integer> root) {
		replaceNode(root, 0);
	}
	
	public static void replaceNode(BinaryTreeNode<Integer> root, int level) {
		if (root == null)
	        return;
		root.data = level;
	 
	    replaceNode(root.left, level+1);
	    replaceNode(root.right, level+1);
	}
	
	public static boolean isNodePresent(BinaryTreeNode<Integer> root, int x) {
		if (root == null)
	        return false;
	    if (root.data == x)
	        return true;
	    boolean result1 = isNodePresent(root.left, x);
	    if(result1) return true;
	    boolean result2 = isNodePresent(root.right, x);
	    return result2;
	}
	
	public static void printNodesWithoutSibling(BinaryTreeNode<Integer> root) {
		if (root == null)
		      return;
		if (root.left != null && root.right != null) {
			printNodesWithoutSibling(root.left);
			printNodesWithoutSibling(root.right);
		}else if (root.right != null) {
			System.out.print(root.right.data + " ");
			printNodesWithoutSibling(root.right);
		}else if (root.left != null) {
			System.out.print( root.left.data + " ");
			printNodesWithoutSibling(root.left);
		}
	}
	
//	private static void printLevelWise(BinaryTreeNode<Integer> root){
//		QueueUsingLL<BinaryTreeNode<Integer>>  primary = new QueueUsingLL<>();
//		QueueUsingLL<BinaryTreeNode<Integer>>  secondary = new QueueUsingLL<>();
//
//		primary.enqueue(root);
//
//		while(!primary.isEmpty()){
//			BinaryTreeNode<Integer> current=null;
//			try {
//				current = primary.dequeue();
//			} catch (QueueEmptyException e) {
//				System.out.println("Not possible");
//			}
//			System.out.print(current.data + " ");
//			if(current.left != null){
//				secondary.enqueue(current.left);
//			}
//			if(current.right != null){
//				secondary.enqueue(current.right);
//			}
//			if(primary.isEmpty()){
//				QueueUsingLL<BinaryTreeNode<Integer>>  temp = secondary;
//				secondary = primary;
//				primary = temp;
//				System.out.println();
//			}
//		}
//	}
	
	public static void printLevelWise(BinaryTreeNode<Integer> root) {
		int h = height(root);
        int i;
        for (i = 1; i <= h; i++) {
            printGivenLevel(root, i);
            System.out.print(System.lineSeparator());
        }
	}
	
	public static void printGivenLevel(BinaryTreeNode<Integer> root, int level)
    {
        if (root == null)
            return;
        if (level == 1) {
            System.out.print(root.data + " ");
        }
        else if (level > 1) {
            printGivenLevel(root.left, level - 1);
            printGivenLevel(root.right, level - 1);
        }
    }
	
	public static void mirrorBinaryTree(BinaryTreeNode<Integer> root){
		root = mirror(root);
	}
	
	public static BinaryTreeNode<Integer> mirror(BinaryTreeNode<Integer> root) {
        if (root == null)
            return root;
        BinaryTreeNode<Integer> left = mirror(root.left);
        BinaryTreeNode<Integer> right = mirror(root.right);
        root.left = right;
        root.right = left;
        return root;
    }
	
	public static int diameterOfBinaryTree(BinaryTreeNode<Integer> root){
		if (root == null)
            return 0;
		int lheight = height(root.left);
        int rheight = height(root.right);
        int ldiameter = diameterOfBinaryTree(root.left);
        int rdiameter = diameterOfBinaryTree(root.right);
        return Math.max(lheight + rheight + 1, Math.max(ldiameter, rdiameter));
	}
	
	public static void levelWisePrintBinaryTree(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return;
		}

		Queue<BinaryTreeNode<Integer>> pendingChildren = new LinkedList<BinaryTreeNode<Integer>>();
		pendingChildren.add(root);

		while (!pendingChildren.isEmpty()) {
			root = pendingChildren.remove();
			if (root == null) {
				if (!pendingChildren.isEmpty()) {
					pendingChildren.add(null);
				}
			} else {
				System.out.print(root.data + ":L:");
				if (root.left != null) {
					pendingChildren.add(root.left);
					System.out.print(root.left.data + ",R:");
				} else {
					System.out.print("-1" + ",R:");
				}
				if (root.right != null) {
					pendingChildren.add(root.right);
					System.out.print(root.right.data);
				} else {
					System.out.print("-1");
				}
			}
			System.out.println();
		}
    }
	
	public static BinaryTreeNode<Integer> buildTree(int[] preOrder, int[] inOrder) {
		BinaryTreeNode<Integer> root = buildTree(preOrder, inOrder, 0, preOrder.length - 1, 0, inOrder.length -1);
        return root;
	}
	
	public static BinaryTreeNode<Integer> buildTree(int[] preOrder, int[] inOrder, int Pre1,int Pre2,int In1, int In2){
        if(Pre1 > Pre2){
            return null;
        }
        BinaryTreeNode<Integer> root= new BinaryTreeNode<Integer>(preOrder[Pre1]);
        int rootIndex = -1;
        for(int i = 0; i <= In2; i++) {
            if(inOrder[i] == preOrder[Pre1]) {
                rootIndex = i;
                break;
            }
        }
        int sPreLeft = Pre1 + 1;
        int sInLeft = In1;
        int eInLeft = rootIndex-1;
        int sInRight = rootIndex+1;
        int ePreRight = Pre2;
        int eInRight = In2;
        int leftSubtreeLength = eInLeft - sInLeft + 1;
        int ePreLeft = sPreLeft + leftSubtreeLength - 1;
        int sPreRight = ePreLeft + 1;
        BinaryTreeNode<Integer> left = buildTree(preOrder, inOrder, sPreLeft, ePreLeft, sInLeft, eInLeft);
        BinaryTreeNode<Integer> right=buildTree(preOrder, inOrder, sPreRight, ePreRight, sInRight, eInRight);
        root.left = left;
        root.right = right;
        return  root;
    }
	
	public static BinaryTreeNode<Integer> buildTree1(int[] postOrder, int[] inOrder) {
		BinaryTreeNode<Integer> root= buildTree1(postOrder,inOrder,0,postOrder.length-1,0,inOrder.length-1);
        return root;
	}
	
	public static BinaryTreeNode<Integer> buildTree1(int[] postOrder, int[] inOrder, int Pre1,int Pre2,int In1, int In2){
        if(Pre1 > Pre2){
            return null;
        }
        BinaryTreeNode<Integer> root= new BinaryTreeNode<Integer>(postOrder[Pre2]);
        int rootIndex = -1;
        for(int i = 0; i <= In2; i++) {
            if(inOrder[i] == postOrder[Pre2]) {
                rootIndex = i;
                break;
            }
        }
        int sPreLeft = Pre1;
        int sInLeft = In1;
        int eInLeft = rootIndex - 1;
        int sInRight = rootIndex + 1;
        int ePreRight = Pre2 - 1;
        int eInRight = In2;
        int leftSubtreeLength = eInLeft - sInLeft + 1;
        int ePreLeft = sPreLeft + leftSubtreeLength - 1;
        int sPreRight= ePreLeft + 1;
        BinaryTreeNode<Integer> left = buildTree1(postOrder, inOrder, sPreLeft, ePreLeft, sInLeft, eInLeft);
        BinaryTreeNode<Integer> right = buildTree1(postOrder, inOrder, sPreRight, ePreRight, sInRight, eInRight);
        root.left = left;
        root.right = right;
        return  root;
    }
	
	public static void insertDuplicateNode(BinaryTreeNode<Integer> root) {
		if(root == null)
            return;
        BinaryTreeNode<Integer> newRoot= new BinaryTreeNode<Integer>(root.data);
        newRoot.left = root.left;
        root.left = newRoot;
        insertDuplicateNode(newRoot.left);
        insertDuplicateNode(root.right);
        return;
	}
	
	public static Pair getMinAndMax(BinaryTreeNode<Integer> root,Pair pair) {
        if(root == null){
            return pair;
        }
        if(root.data < pair.minimum) {
            pair.minimum = root.data;
        }
        if(root.data > pair.maximum) {
            pair.maximum = root.data;
        }
        getMinAndMax(root.left, pair);
        getMinAndMax(root.right, pair);
        return pair;
        
	}
	
    public static Pair getMinAndMax(BinaryTreeNode<Integer> root){
        Pair pair = new Pair();
        return getMinAndMax(root, pair);
    }
    
    public static void printLevelWise2(BinaryTreeNode<Integer> root){
    	QueueUsingLL<BinaryTreeNode<Integer>> queue = new QueueUsingLL<BinaryTreeNode<Integer>> (); 
        queue.enqueue(root); 
        while (!queue.isEmpty()) {
        	int levelsize=queue.size();
            for( int i=1;i<=levelsize;i++) {
               try {
                  BinaryTreeNode<Integer> tempNode = queue.dequeue();
                  System.out.print(tempNode.data + " ");
                   if (tempNode.left != null) { 
                   queue.enqueue(tempNode.left); 
                   }
                   if (tempNode.right != null) { 
                	   queue.enqueue(tempNode.right); 
                   }
               }
               catch(QueueEmptyException e) { }
            }
            System.out.println();
        }
    }
    
    public static void rootToLeafPathsSumToK(BinaryTreeNode<Integer> root, int k) {
    	helper(root, k, "");
    }
    
    private static void helper(BinaryTreeNode<Integer> root, int k, String str){
        if(root == null)
            return;
        if(root.left == null && root.right == null && root.data == k) {
            System.out.println(str + root.data);
            return;
        }
        str = str + root.data + " ";
   
        helper(root.left, k - root.data, str);
        helper(root.right, k - root.data, str);   
    }
    
    public static void nodesAtDistanceK(BinaryTreeNode<Integer> root, int node, int k) {
    	int x = print(root,k,node);
    }
    
    public static int print(BinaryTreeNode<Integer> root,int k,int elem){
        if(root == null){
            return -1;
        }
        if(root.data == elem){
            printAtDepthK(root,k);
            return 0;
        }
        int ld = print(root.left,k,elem);
        int rd;
        if(ld == -1) {
            rd = print(root.right,k,elem);
            if(rd == -1) {
                return -1;
            }else if(rd + 1 == k) {
                System.out.println(root.data + " ");
                return k;
            }else {
                printAtDepthK(root.left, k - rd - 2);
                return rd + 1;
            }
        }else if(ld + 1 == k) {
            System.out.println(root.data + " ");
            return k;
        }else {
            printAtDepthK(root.right, k - ld - 2);
            return ld + 1;
        }
    }
    
    public static void printAtDepthK(BinaryTreeNode<Integer> root, int depth) {
        if(root == null){
            return;
        }
        if(depth == 0 && root != null) {
            System.out.println(root.data + " ");
            return;
        }
        printAtDepthK(root.left, depth - 1);
        printAtDepthK(root.right, depth - 1);
    }
    
    public static boolean searchInBST(BinaryTreeNode<Integer> root, int k) {
    	if (root == null) 
    		return false;
        if (k == root.data) 
        	return true;
        if (k < root.data) 
        	return searchInBST(root.left,k);
        else 
        	return searchInBST(root.right,k);
    }
    
    public static void elementsInRangeK1K2(BinaryTreeNode<Integer> root,int k1,int k2){
    	if (root == null) 
    		return;
        if (root.data > k2) 
        	elementsInRangeK1K2(root.left, k1, k2);
        else if (root.data < k1) 
        	elementsInRangeK1K2(root.right, k1, k2);
        else {
            elementsInRangeK1K2(root.left, k1, k2);
            System.out.print(root.data + " ");
            elementsInRangeK1K2(root.right, k1, k2);
        }
    }
    
    public static BinaryTreeNode<Integer> SortedArrayToBST(int[] arr, int n){
    	if (n == 0) {
    		return null;
    	}
        if (n == 1) {
        	return new BinaryTreeNode<>(arr[0]);
        }
        int Pos;
        if (n % 2 == 0) {
        	Pos = n / 2 - 1;
        }
        else {
        	Pos = n / 2;
        }
        BinaryTreeNode<Integer> node = new BinaryTreeNode<>(arr[Pos]);
        int[] leftArray = new int[Pos];
        System.arraycopy(arr, 0, leftArray, 0, Pos);
        node.left = SortedArrayToBST(leftArray, Pos);
        int[] rightArray = new int[n - Pos - 1];
        System.arraycopy(arr, Pos + 1, rightArray, 0, n - Pos - 1);
        node.right = SortedArrayToBST(rightArray, n - Pos - 1);
        return node;
    }
    
    public static LinkedListNode<Integer> constructLinkedList(BinaryTreeNode<Integer> root) {
    	ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedListNode<Integer> node = new LinkedListNode<>(-1);
        convertTreeToList(root,arrayList);
        constructLinkedList(node,arrayList);
        return node.next;
    }
    
    public static void constructLinkedList(LinkedListNode<Integer> node, ArrayList<Integer> arrayList){
        for (Integer integer : arrayList) {
            node.next = new LinkedListNode<>(integer);
            node = node.next;
        }
    }

    public static void convertTreeToList(BinaryTreeNode<Integer> root, ArrayList<Integer> arrayList){
        if (root==null) return;
        convertTreeToList(root.left,arrayList);
        arrayList.add(root.data);
        convertTreeToList(root.right,arrayList);
    }
    
    public static int getLCA(BinaryTreeNode<Integer> root, int a, int b) {
    	if (root == null) 
    		return -1;
        if (searchInBST(root.left, a) && searchInBST(root.left, b)) {
            return getLCA(root.left, a, b);
        }else if (searchInBST(root.right, a) && searchInBST(root.right, b)) {
            return getLCA(root.right, a, b);
        }else 
        	return root.data;
    }
    
    public static void replaceWithLargerNodesSum(BinaryTreeNode<Integer> root) {
    	ArrayList<Integer> arrayList = new ArrayList<>();
        convertTreeToList(root, arrayList);
        replaceWithLargerNodesSum(root, arrayList);
    }
    
    public static int getSumGreaterThanX(ArrayList<Integer> arrayList, int x) {
        int sum = 0;
        for (Integer integer : arrayList) {
            if (integer >= x) sum += integer;
        }
        return sum;
    }

    public static void replaceWithLargerNodesSum(BinaryTreeNode<Integer> root,ArrayList<Integer> arrayList){
        if (root == null) 
        	return;
        root.data = getSumGreaterThanX(arrayList, root.data);
        replaceWithLargerNodesSum(root.left, arrayList);
        replaceWithLargerNodesSum(root.right, arrayList);
    }
    
    public static void printLevelWiseAtDiffLevel(BinaryTreeNode<Integer> root) throws QueueEmptyException {
		if (root == null)
			return;
		QueueUsingLL<BinaryTreeNode<Integer>> q = new QueueUsingLL<BinaryTreeNode<Integer>>();
		q.enqueue(root);
		q.enqueue(null);
		while (!q.isEmpty()) {
			BinaryTreeNode<Integer> first = q.front();
			q.dequeue();
			if (first == null) {
				if (q.isEmpty()) {
					break;
				}
				System.out.println();
				q.enqueue(null);
				continue;
			}
			System.out.print(first.data + " ");
			if (first.left != null) {
				q.enqueue(first.left);
			}
			if (first.right != null) {
				q.enqueue(first.right);
			}
		}
	}
    
    public static ArrayList<Integer> getPath(BinaryTreeNode<Integer> root, int data){
    	ArrayList<Integer> arrayList = new ArrayList<>();
        getPath(root, data, arrayList);
        return arrayList;
    }
    
    public static void getPath(BinaryTreeNode<Integer> root,int data,ArrayList<Integer> arrayList){
        if (root == null) 
        	return;
        if (!searchInBinaryTree(root,data)) 
        	return;
        arrayList.add(0, root.data);
        getPath(root.left, data, arrayList);
        getPath(root.right, data, arrayList);
    }
    
    public static boolean searchInBinaryTree(BinaryTreeNode<Integer> root,int x){
        if (root == null) 
        	return false;
        if (root.data==x) 
        	return true;
        return searchInBinaryTree(root.left, x) || searchInBinaryTree(root.right, x);
    }
    
    public static ArrayList<LinkedListNode<Integer>> constructLinkedListForEachLevel(BinaryTreeNode<Integer> root){
    	ArrayList<LinkedListNode<Integer>> ans = new ArrayList<>();
    	if(root == null)
    		return ans;
    	Queue<BinaryTreeNode<Integer>> q = new LinkedList<>();
    	q.offer(root);
    	while(!q.isEmpty()) {
    		int size = q.size();
    		LinkedListNode<Integer> level = new LinkedListNode<>(0);
    		LinkedListNode<Integer> head = null;
    		while(size-- > 0) {
    			BinaryTreeNode<Integer> temp = q.poll();
	    	if(temp.left != null)
	    		q.add(temp.left);
	    	if(temp.right != null)
	    		q.add(temp.right);
		    	if(head == null) {
			    	LinkedListNode<Integer> newNode = new LinkedListNode<>(temp.data);
			    	level=newNode;
			    	head = newNode;
		    	} else {
			    	LinkedListNode<Integer> newNode = new LinkedListNode<>(temp.data);
			    	level.next=newNode;
			    	level=level.next;
		    	}
    		}
    		ans.add(head);
    	}
    	return ans;
    }
    
    private static void print(LinkedListNode<Integer> temp)
	{
		while(temp != null){
			System.out.print(temp.data + " ") ;
			temp = temp.next;
		}
		System.out.println();
	}
    
    public static int largestBSTSubtree(BinaryTreeNode<Integer> root) {
		// Write your code here
		if (root == null)
			return 0;

		if (isBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE))
			return findHeight(root);
		else {
			return Math.max(largestBSTSubtree(root.left), largestBSTSubtree(root.right));
		}

	}

	private static int findHeight(BinaryTreeNode<Integer> root) {
		if (root == null)
			return 0;

		if (root.left == null && root.right == null)
			return 1;

		return Math.max(findHeight(root.left), findHeight(root.right)) + 1;
	}

	private static boolean isBST(BinaryTreeNode<Integer> root, int min, int max) {
		if (root == null)
			return true;

		if (root.data < min || root.data > max)
			return false;
		else
			return isBST(root.left, min, root.data - 1) && isBST(root.right, root.data + 1, max);
	}
	
	private static ArrayList<Integer> convertToArray(BinaryTreeNode<Integer> root){
        if(root==null){
            ArrayList<Integer> arr = new ArrayList<Integer>();
            return arr;
        }
        
        
        ArrayList<Integer> currArr = new ArrayList<Integer>();
        ArrayList<Integer> leftArr = convertToArray(root.left);
        if(!leftArr.isEmpty()){
            currArr.addAll(leftArr);
        }
        
        currArr.add(root.data);
        
        ArrayList<Integer> rightArr = convertToArray(root.right);
        if(!rightArr.isEmpty()){
            currArr.addAll(rightArr);
        }
        return currArr;
    }
    
    private static void printPairSum(ArrayList<Integer> arr, int s){
        int i=0,j=arr.size()-1;
        while(i<j){
            int val1=arr.get(i);
            int val2=arr.get(j);
            if(val1+val2>s){
                j=j-1;
            }
            else if(val1+val2<s){
                i=i+1;
            }
            else
            {
                System.out.println(val1+" "+val2);
                i=i+1;
                j=j-1;
            }
                
        }
    }
	
	public static void printNodesSumToS(BinaryTreeNode<Integer> root, int s) {
		// Write your code here
         if(root==null)
            return;
        else
        {
            ArrayList<Integer> arr = convertToArray(root);
//        	Collections.sort(arr);
        	printPairSum(arr,s);
        }
	}

	public static void main(String[] args) throws NumberFormatException, IOException, QueueEmptyException {
		BinaryTreeNode<Integer> root = takeInput();
		//preOrder(root);
//		postOrder(root);
//		int x = Integer.parseInt(br.readLine().trim());
//		int count = countNodesGreaterThanX(root, x);
//		System.out.println(count);
//		System.out.println(height(root));
//		changeToDepthTree(root);
//		inOrder(root);
//		int x = Integer.parseInt(br.readLine().trim());
//		boolean ans = isNodePresent(root, x);
//		System.out.println(ans);
//		printNodesWithoutSibling(root);
//		mirrorBinaryTree(root);
//		printLevelWise(root);
//		int d = diameterOfBinaryTree(root);
//		System.out.println(d);
//		printLevelWise(root);
//		levelWisePrintBinaryTree(root);
//		Pair input = takeInput1();
//
////    	int[] preOrder = input.preOrder;
//    	int[] postOrder = input.postOrder;
//    	int[] inOrder = input.inOrder;
//
//    	BinaryTreeNode<Integer> root = buildTree1(postOrder, inOrder);
//		insertDuplicateNode(root);
//    	printLevelWise(root);
//		Pair<Integer, Integer> pair = getMinAndMax(root);
//		System.out.println(pair.minimum + " " + pair.maximum);
//		printLevelWise2(root);
//		int k = Integer.parseInt(br.readLine().trim());
//		rootToLeafPathsSumToK(root, k);
//		String[] target_k = br.readLine().trim().split(" ");
//		int target = Integer.parseInt(target_k[0].trim());
//		int k = Integer.parseInt(target_k[1].trim());
//		nodesAtDistanceK(root, target, k);
//		int k = Integer.parseInt(br.readLine());
//		System.out.println(searchInBST(root,k));
//		st = new StringTokenizer(br.readLine());
//		int k1 = Integer.parseInt(st.nextToken());
//		int k2 = Integer.parseInt(st.nextToken());
//		elementsInRangeK1K2(root, k1, k2);
//		LinkedListNode<Integer> head = constructLinkedList(root);
//		while(head != null) {
//			System.out.print(head.data + " ");
//			head = head.next;
//		}
//		st = new StringTokenizer(br.readLine());
//		int a = Integer.parseInt(st.nextToken());
//		int b = Integer.parseInt(st.nextToken());
//		System.out.println(getLCA(root, a, b));
//		replaceWithLargerNodesSum(root);
//		printLevelWiseAtDiffLevel(root);
//		int k = Integer.parseInt(br.readLine());
//		ArrayList<Integer> output = getPath(root, k);
//		if(output != null) {
//			for(int i : output) {
//				System.out.print(i+" ");
//			}
//		}
//		ArrayList<LinkedListNode<Integer>> output = constructLinkedListForEachLevel(root);
//		if(output!=null) {
//			for(LinkedListNode<Integer> head : output){
//				print(head);
//			}
//		}
//		System.out.println(largestBSTSubtree(root));
		int s = Integer.parseInt(br.readLine());
		printNodesSumToS(root,s);
	}
}
