package tree;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeUse {
	
	public static BinaryTreeNode<Integer> takeInpurLevelWise(){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter root data");
		int rootData = s.nextInt();
		if(rootData == -1) {
			return null;
		}
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
		Queue<BinaryTreeNode<Integer>> pendingChildrern = new LinkedList<BinaryTreeNode<Integer>>();
		pendingChildrern.add(root);
		
		while(!pendingChildrern.isEmpty()) {
			BinaryTreeNode<Integer> front = pendingChildrern.poll();
			System.out.println("Enter left child of " + front.data);
			int left = s.nextInt();
			if(left != -1) {
				BinaryTreeNode<Integer> leftChild = new BinaryTreeNode<Integer>(left);
				front.left = leftChild;
				pendingChildrern.add(leftChild);
			}
			System.out.println("Enter right child of " + front.data);
			int right = s.nextInt();
			if(right != -1) {
				BinaryTreeNode<Integer> rightChild = new BinaryTreeNode<Integer>(right);
				front.right = rightChild;
				pendingChildrern.add(rightChild);
			}
		}
		return root;
	}
	
	public static BinaryTreeNode<Integer> takeTreeInputBetter(boolean isRoot, int parentData, boolean isLeft){
		if(isRoot) {
			System.out.println("Enter root data");
		}else {
			if(isLeft) {
				System.out.println("Enter left child of " + parentData);
			}else {
				System.out.println("Enter right child of " + parentData);
			}
		}
		
		Scanner s = new Scanner(System.in);
		int rootData = s.nextInt();
		if(rootData == -1) {
			return null;
		}
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
		BinaryTreeNode<Integer> leftChild = takeTreeInputBetter(false, rootData, true);
		BinaryTreeNode<Integer> rightChild = takeTreeInputBetter(false, rootData, false);
		root.left = leftChild;
		root.right = rightChild;
		return root; 
	}
	
	public static BinaryTreeNode<Integer> takeTreeInput(){
		System.out.println("Enter root data");
		Scanner s = new Scanner(System.in);
		int rootData = s.nextInt();
		if(rootData == -1) {
			return null;
		}
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
		BinaryTreeNode<Integer> leftChild = takeTreeInput();
		BinaryTreeNode<Integer> rightChild = takeTreeInput();
		root.left = leftChild;
		root.right = rightChild;
		return root; 
	}
	
	public static void printTreeDetailed(BinaryTreeNode<Integer> root){
        if(root == null){
            return;
        }
        System.out.print(root.data + ": ");
        if(root.left != null){
            System.out.print("L"+root.left.data + ", ");
        }
        if(root.right != null){
            System.out.print("R"+root.right.data + " ");
        }
        System.out.println();
        printTreeDetailed(root.left);
        printTreeDetailed(root.right);
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
		if (root == null) {
			return;
		}
		preOrder(root.right);
		preOrder(root.left);
		System.out.print(root.data + " ");
	}
	
	public static int numNodes(BinaryTreeNode<Integer> root) {
		if(root == null)
			return 0;
		int leftNodesCount = numNodes(root.left);
		int rightNodesCount = numNodes(root.right);
		return 1 + leftNodesCount + rightNodesCount;
	}
	
	public static int getSum(BinaryTreeNode<Integer> root) {
		int leftNodeSum = 0, rightNodeSum = 0;
		if(root == null)
			return 0;
		if(root.left != null) {
			leftNodeSum = getSum(root.left);
		}
		if(root.right != null) {
			rightNodeSum = getSum(root.right);
		}
		return root.data + leftNodeSum + rightNodeSum;
	}
	
	public static int largestNode(BinaryTreeNode<Integer> root) {
		if(root == null)
			return -1;
		int largestLeft = largestNode(root.left);
		int largestRight = largestNode(root.right);
		return Math.max(root.data, Math.max(largestLeft, largestRight));
	}
	
	public static int numLeaves(BinaryTreeNode<Integer> root) {
		if(root == null)
			return 0;
		if(root.left == null && root.right == null)
			return 1;
		return numLeaves(root.left) + numLeaves(root.right);
	}
	
	public static void printAtDepthK(BinaryTreeNode<Integer> root, int k) {
		if(root == null) {
			return;
		}
		if(k == 0) {
			System.out.println(root.data);
			return;
		}
		printAtDepthK(root.left, k-1);
		printAtDepthK(root.right, k-1);
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
	
	public static BinaryTreeNode<Integer> removeLeaves(BinaryTreeNode<Integer> root){
		if(root == null)
			return null;
		if(root.left == null && root.right == null)
			return null;
		root.left =	removeLeaves(root.left);
		root.right = removeLeaves(root.right);
		return root;
	}
	
	public static int height(BinaryTreeNode<Integer> root) {
        if(root==null) {
          return 0;
          }
        int leftHeight=height(root.left);
        int rightHeight=height(root.right);
        return 1+ Math.max(leftHeight, rightHeight);
      }

      //bad time complexity Worst case:- O(n2), avg case:- O(nlogn)
      public static boolean isBalanced(BinaryTreeNode<Integer> root) {
          if(root==null) {
              return true;
            }
          int leftHeight=height(root.left);
          int rightHeight=height(root.right);
          if(Math.abs(leftHeight - rightHeight) >1){
              return false;
              }
          boolean isLeftBalanced = isBalanced(root.left);
          boolean isRightBalanced = isBalanced(root.right);
          return isLeftBalanced && isRightBalanced ;
      }
            
      public static BalancedTreeReturns isBalancedBetter(BinaryTreeNode<Integer> root) {
    	  if(root == null) {
    		  int height = 0;
    		  boolean isBal = true;
    		  BalancedTreeReturns ans = new BalancedTreeReturns();
    		  ans.height = height;
    		  ans.isBalanced = isBal;
    		  return ans;
    	  }
    	  
    	  BalancedTreeReturns leftOutput = isBalancedBetter(root.left);
    	  BalancedTreeReturns rightOutput = isBalancedBetter(root.right);
    	  boolean isBal = true;
    	  int height = 1 + Math.max(leftOutput.height, rightOutput.height);
    	  
    	  if(Math.abs(leftOutput.height - rightOutput.height) > 1) {
    		  isBal = false;
    	  }
    	  
    	  if(!leftOutput.isBalanced || !rightOutput.isBalanced) {
    		  isBal = false;
    	  }
    	  
    	  BalancedTreeReturns ans = new BalancedTreeReturns();
		  ans.height = height;
		  ans.isBalanced = isBal;
		  return ans;
      }
      
      public static int minimum(BinaryTreeNode<Integer> root) {
    	  if(root == null) {
    		  return Integer.MIN_VALUE;
    	  }
    	  int leftMin = minimum(root.left);
    	  int rightMin = minimum(root.right);
    	  return Math.min(root.data, Math.min(leftMin, rightMin));
      }
      
      public static int largest(BinaryTreeNode<Integer> root) {
    	  if(root == null)
    		  return Integer.MIN_VALUE;
  		int largestLeft = largest(root.left);
  		int largestRight = largest(root.right);
  		return Math.max(root.data, Math.max(largestLeft, largestRight));
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
      
      public static boolean isBST(BinaryTreeNode<Integer> root){
          if(root==null){
              return true;
          }
          int leftMax= largest(root.left);
          if(leftMax>=root.data){
              return false;
          }
          int rightMin= minimum(root.right);
          if(rightMin<root.data){
              return false;
          }
          boolean isLeftBST= isBST(root.left);
          boolean isRightBST= isBST(root.right);
          return isLeftBST && isRightBST;

      }
      
      public static IsBSTReturn isBST2(BinaryTreeNode<Integer> root){
          if(root==null){
              IsBSTReturn ans = new IsBSTReturn(Integer.MAX_VALUE, Integer.MIN_VALUE, true);
              return ans;
          }
          IsBSTReturn leftAns= isBST2(root.left);
          IsBSTReturn rightAns= isBST2(root.right);

          int min= Math.min(root.data, Math.min(leftAns.min, rightAns.min));
          int max= Math.max(root.data, Math.min(leftAns.max, rightAns.max));
          boolean isBST= true;
          if(leftAns.max>=root.data){
              isBST= false;
          }
          if(rightAns.min<root.data){
              isBST= false;
          }
          if(!leftAns.isBST){
              isBST= false;
          }
          if(rightAns.isBST){
              isBST= false;
          }
          IsBSTReturn ans = new IsBSTReturn(min,max,isBST);
          return ans;
      }
      
      public static ArrayList<Integer> nodeToRootPath(BinaryTreeNode<Integer> root, int x){
          if(root==null){
              return null;
          }

          if(root.data==x){
              ArrayList<Integer> output= new ArrayList<Integer>();
              output.add(root.data);
              return output;
          }
          ArrayList<Integer> leftOutput= nodeToRootPath(root.left,x);
          if(leftOutput!=null){
              leftOutput.add(root.data);
              return leftOutput;
          }

          ArrayList<Integer> rightOutput= nodeToRootPath(root.right,x);
          if(rightOutput!=null){
              rightOutput.add(root.data);
              return rightOutput;
          }
          return null;
      }
      
      public static void main(String[] args){
//        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(1);
//
//        BinaryTreeNode<Integer> rootLeft = new BinaryTreeNode<Integer>(2);
//        BinaryTreeNode<Integer> rootRight = new BinaryTreeNode<Integer>(3);
//        root.left = rootLeft;
//        root.right= rootRight;
//
//
//        BinaryTreeNode<Integer> twoRight = new BinaryTreeNode<Integer>(4);
//        BinaryTreeNode<Integer> threeLeft = new BinaryTreeNode<Integer>(5);
//
//        rootLeft.right= twoRight;
//        rootRight.left= threeLeft;
    	
//    	BinaryTreeNode<Integer> root = takeTreeInputBetter(true, 0 , true);
//    	BinaryTreeNode<Integer> root = takeInpurLevelWise();
//        printTreeDetailed(root);
//        System.out.println("Pre-order print: ");
//    	preOrder(root);
//        System.out.println("Post-order print: ");
//    	postOrder(root);
//        System.out.println("Num nodes: " + numNodes(root));
//        System.out.println("Sum Nodes: " + getSum(root));
//        System.out.println("Largest: " + largestNode(root));
//        System.out.println(numLeaves(root));
//    	System.out.println("Print at depth k");
//    	printAtDepthK(root, 2);
//    	changeToDepthTree(root);
//    	BinaryTreeNode<Integer> newRoot = removeLeaves(root);
//    	printTreeDetailed(newRoot);
//    	boolean ans = isBalanced(root);
//    	System.out.println(ans);
//    	System.out.println("Is Balanced: " + isBalancedBetter(root).isBalanced);
    	int in[]= {1,2,3,4,5,6,7};
        int pre[]={4,3,1,3,6,5,7};
        BinaryTreeNode<Integer> root= buildTree(pre, in);
//        printTreeDetailed(root);
//      //  System.out.println(searchBST(root,30));
//        IsBSTReturn ans= isBST2(root);
//        System.out.println(ans.min +" "+ans.max+" "+ans.isBST);
        root= takeTreeInputBetter(true, 0, true);
        ArrayList<Integer> path= nodeToRootPath(root,5);
        for(int i:path){
            System.out.println(i);
        }
    }
}
