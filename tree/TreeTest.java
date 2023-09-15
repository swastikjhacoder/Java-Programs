package tree;
import java.util.*;
public class TreeTest {
	
	public static TreeNode<Integer> takeInputLevelWise(){
		Scanner s = new Scanner(System.in);
		QueueUsingLL<TreeNode<Integer>> pendingNodes = new QueueUsingLL<TreeNode<Integer>>();  // Queue of node that are entered themselves but their children aren't added yet
		int rootData = s.nextInt();
		TreeNode<Integer> root = new TreeNode<Integer>(rootData);
		pendingNodes.enqueue(root);
		while(!pendingNodes.isEmpty()){
			TreeNode<Integer> currentNode;
			try {
				currentNode = pendingNodes.dequeue();
				int numChild = s.nextInt();
				for(int i = 0 ; i < numChild; i++){
					int currentChild = s.nextInt();
					TreeNode<Integer> childNode = new TreeNode<Integer>(currentChild);
					pendingNodes.enqueue(childNode);
					currentNode.children.add(childNode);
				}
			} catch (QueueEmptyException e) {
			}
		}
		return root;
	}
	
	public static TreeNode<Integer> takeInput() throws QueueEmptyException{
        Scanner s = new Scanner(System.in);
        QueueUsingLL<TreeNode<Integer>> pendingNodes = new QueueUsingLL<>();
        System.out.println("Enter the root data ");
        int rootData = s.nextInt();
        if(rootData == -1)
            return null;

        TreeNode<Integer> root = new TreeNode<Integer>(rootData);
        pendingNodes.enqueue(root);

        while(!pendingNodes.isEmpty()) {
            TreeNode<Integer> front = pendingNodes.dequeue();
            System.out.println("Enter no. of children " + front.data);
            int numChild = s.nextInt();
            for(int i = 0; i < numChild; i++) {
                System.out.println("Enter the  "+ i +" th child data "+ front.data);
                int childData = s.nextInt();
                TreeNode<Integer> childNode = new TreeNode<>(childData);
                front.children.add(childNode);
                pendingNodes.enqueue(childNode);
            }
        }
        return root;
    }

	public static int sumOfAllNode(TreeNode<Integer> root) {
		int sum = 0;
        for(int i = 0; i < root.children.size(); i++) {
        	if(root.children != null)
            	sum += sumOfAllNode(root.children.get(i));
        }
        
        return sum+root.data;
	}

    public static int numberOfNodes(TreeNode<Integer> root){
        int count = 1;
        for(int i = 0; i < root.children.size(); i++){
            int childCount = numberOfNodes(root.children.get(i));
            count += childCount;
        }
        return count;
    }

    public static void printTree(TreeNode<Integer> root){
        //Special case not base case
        if(root == null){
            return ;
        }
        System.out.print(root.data+": ");
        for(int i = 0; i < root.children.size(); i++){
            System.out.print(root.children.get(i).data + " ");
        }
        System.out.println();
        for(int i = 0; i < root.children.size(); i++){
            TreeNode<Integer> child = root.children.get(i);
            printTree(child);
        }
    }
    
    public static void printLevelWise(TreeNode<Integer> root) {
    	if (root == null)
            return;
        Queue<TreeNode<Integer>> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            int n = q.size();
            while (n > 0) {
            	TreeNode<Integer> p = q.peek();
                q.remove();
                System.out.print(p.data + " ");
                for (int i = 0; i < p.children.size(); i++)
                    q.add(p.children.get(i));
                n--;
            }
            System.out.println();
        }
    }
    
    public static int numNodeGreater(TreeNode<Integer> root,int x) {
    	if (root == null)
            return 0;
        int count = 0;
        if (root.data > x)
            count++;
        for(TreeNode<Integer> child : root.children) {
            count += numNodeGreater(child, x);
        }
        return count;
    }
    
    public static int getHeight(TreeNode<Integer> root) {
    	int max = 0;
        for (int i = 0; i < root.children.size(); i++) {
            int height = getHeight(root.children.get(i));
            if (height > max)
                max = height;
        }
        return max + 1;
    }
    
    public static int countLeafNodes(TreeNode<Integer> root) {
    	int count = 0;
	    if(root == null) {
	        return 0;
	    }
	    if(root.children.size()==0) {
	        return 1;
	    }
	    for(TreeNode<Integer> child: root.children) {
	        count = count + countLeafNodes(child);
	    }
	    return count;
    }
    
    
    public static int countSpecialNodes(BinaryTreeNode<Integer> root) {
    	if (root == null)
            return 0;
        HashMap<Integer,Integer> hash = new HashMap<Integer,Integer>();
        return largestUniquePathUtil(root, hash);
    }
    
    static int largestUniquePathUtil(BinaryTreeNode node, HashMap<Integer, Integer> m) {
    	if (node == null)
    		return m.size();
    	if(m.containsKey(node.data)) {
    		m.put((Integer) node.data, m.get(node.data) + 1);
    	}else {
    		m.put((Integer) node.data, 1);
    	}
    	int max_path = Math.max(largestUniquePathUtil(node.left, m), largestUniquePathUtil(node.right, m));
    	if(m.containsKey(node.data)) {
    		m.put((Integer) node.data, m.get(node.data) - 1);
    	}
    	if (m.get(node.data) == 0)
    		m.remove(node.data);
    	return max_path;
    }
    
    public static void printPostOrder(TreeNode<Integer> root) {
    	if(root == null)
    	    return;
    	for(int i=0; i < root.children.size(); i++) {
    		printPostOrder(root.children.get(i));
    	}
    	System.out.print(root.data + " ");
    }
    
    public static boolean checkIfContainsX(TreeNode<Integer> root, int x){
    	if (root.data == x)
			return true;
		for (TreeNode<Integer> child : root.children) {
			boolean findInChild = checkIfContainsX(child, x);
			if (findInChild)
				return true;
		}
		return false;
    }
    
    static int maxsum;
    static TreeNode<Integer> resNode;
    
    public static TreeNode<Integer> maxSumNode(TreeNode<Integer> root){
    	if (root == null)
            return null;
    	int currsum = root.data;
    	int count = root.children.size();
    	for (int i = 0; i < count; i++) {
            currsum += root.children.get(i).data;
            maxSumNode(root.children.get(i));
        }
    	if (currsum > maxsum) {
    		resNode = root;
            maxsum = currsum;
        }
        return resNode;
    }
    
    public static boolean checkIdentical(TreeNode<Integer> root1, TreeNode<Integer> root2){
    	if(root1 == null && root2 == null){
            return true;
        }
        if((root1 == null && root2 != null) || (root1 != null && root2 == null)){
            return false;
        }
        if((root1.data != root2.data) || (root1.children.size() != root2.children.size())){
             return false;
        }
        for(int  i = 0; i < root1.children.size(); ++i) {
            TreeNode<Integer> child1 = root1.children.get(i);
            TreeNode<Integer> child2 = root2.children.get(i);
            if(!checkIdentical(child1,child2)){
                return false;
            }
        }
        return true;
    }
    
    public static TreeNode<Integer> res;
    
    public static TreeNode<Integer> findNextLargerNode(TreeNode<Integer> root, int n){
    	res = null;
    	nextLargerNode(root, n);
        return res;
    }
    
    public static void nextLargerNode(TreeNode<Integer> root, int x) {
    	if (root == null)
            return;
    	if (root.data > x)
            if ((res == null || (res).data > root.data))
                res = root;
        int numChildren = root.children.size();
        for (int i = 0; i < numChildren; i++)
        	nextLargerNode(root.children.get(i), x);
        return;
    }
    
    public static TreeNode<Integer> largest;
    public static TreeNode<Integer> secondLargest;
  
    public static void findSecondLargestHelper(TreeNode<Integer> root) {
       if (root == null) {
       		return;
       }
       if (root.data > largest.data) {
            secondLargest = largest;
            largest = root;
       } else if (root.data > secondLargest.data && root.data != largest.data)
            secondLargest = root;
         
       for (TreeNode<Integer> child: root.children)
    	   findSecondLargestHelper(child);
    }
     
    public static TreeNode<Integer> findSecondLargest(TreeNode<Integer> root) {
       largest = new TreeNode<Integer>(Integer.MIN_VALUE);
       secondLargest = largest;
       findSecondLargestHelper(root);
       return secondLargest;
    }
    
    public static void replaceDepth(TreeNode<Integer> root,int depth) {
    	if(root == null)
    		return;
    	root.data = depth;
    	for(int i=0; i < root.children.size(); i++) {
    		replaceDepth(root.children.get(i), depth+1);
    	}
    }
    
    public static void replaceWithDepthValue(TreeNode<Integer> root){
    	if(root == null)
            return ;
        replaceDepth(root, 0);
    }
    
	public static void main(String[] args) throws QueueEmptyException {
//		TreeNode<Integer> root= new TreeNode<> (4);
//        TreeNode<Integer> node1= new TreeNode<> (2);
//        TreeNode<Integer> node2= new TreeNode<> (3);
//        TreeNode<Integer> node3= new TreeNode<> (1);
//        TreeNode<Integer> node4= new TreeNode<> (5);
//        TreeNode<Integer> node5= new TreeNode<> (6);
//        
//        root.children.add(node1);
//        root.children.add(node2);
//        root.children.add(node3);
//
//        node2.children.add(node4);
//        node2.children.add(node5);
		TreeNode<Integer> root = takeInputLevelWise();
//		TreeNode<Integer> root1 = takeInputLevelWise();
//		TreeNode<Integer> root2 = takeInputLevelWise();
//		Scanner s = new Scanner(System.in);
//        TreeNode<Integer> root = takeInput();
        
//        System.out.println("Pre-order traversal:");
//        printTree(root);
//        
//        System.out.println("Number of nodes: " + numberOfNodes(root));
//        System.out.println("Sum of all nodes: " + sumOfAllNode(root));
        
//        System.out.println("Level wise traversal:");
//        printLevelWise(root);
        
//        System.out.println("Enter the value of X:");
//        int x = s.nextInt();
//        System.out.println("Total number of nodes greater than " + x + " is: " + numNodeGreater(root, x));
//        System.out.println("Height of the tree is " + getHeight(root));
//        System.out.println("Total leaves " + countLeafNodes(root));
//        System.out.println("Postorder traversal:");
//        printPostOrder(root);
//        System.out.println("Enter the value of X: ");
//        int x = s.nextInt();
//        System.out.println(checkIfContainsX(root, x));
//        System.out.println("Maximum node sum: ");
//        TreeNode<Integer> ans = maxSumNode(root);
//		if(ans == null){
//			System.out.println(Integer.MIN_VALUE);
//		}else{
//			System.out.println(ans.data);
//		}
//        System.out.println(checkIdentical(root1, root2));
//		int n = s.nextInt();
//		TreeNode<Integer> ans = findNextLargerNode(root, n);
//		if(ans == null){
//			System.out.println(Integer.MIN_VALUE);
//		}else{
//			System.out.println(ans.data);
//		}
//		TreeNode<Integer> ans = findSecondLargest(root);
//		if(ans == null){
//			System.out.println(Integer.MIN_VALUE);
//		}else{
//			System.out.println(ans.data);
//		} 
		replaceWithDepthValue(root);
		printLevelWise(root);
	}
}
