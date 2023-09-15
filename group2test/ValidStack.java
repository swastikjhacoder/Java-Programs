package group2test;
import java.util.*;
import java.io.*;
import java.nio.*;

public class ValidStack {
//	
//	private static int t;
//	static ArrayList<Integer> allN;
//
//	static ArrayList<ArrayList<Integer>> allArr1, allArr2;
//
//	private static void takeInput() throws IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		t = Integer.parseInt(br.readLine().split(" ")[0]);
//
//		allN = new ArrayList<Integer>(t);
//
//		allArr1 = new ArrayList<ArrayList<Integer>>(t);
//		allArr2 = new ArrayList<ArrayList<Integer>>(t);
//		for (int i = 0; i < t; i++) {
//			String nums[] = br.readLine().split(" ");
//
//			allN.add(Integer.parseInt(nums[0]));
//
//			ArrayList<Integer> temp = new ArrayList<Integer>(allN.get(i));
//
//			nums = br.readLine().split(" ");
//
//			for (int j = 0; j < allN.get(i); j++) {
//				temp.add(Integer.parseInt(nums[j]));
//			}
//
//			allArr1.add(temp);
//
//			nums = br.readLine().split(" ");
//			ArrayList<Integer> temp1 = new ArrayList<Integer>(allN.get(i));
//			for (int j = 0; j < allN.get(i); j++) {
//				temp1.add(Integer.parseInt(nums[j]));
//			}
//
//			allArr2.add(temp1);
//
//		}
//	}
//
//	private static void execute() {
//		ArrayList<ArrayList<Integer>> allArrCopy1 = allArr1;
//		ArrayList<ArrayList<Integer>> allArrCopy2 = allArr2;
//
//		for (int i = 0; i < t; i++) {
//			validStackPermutation(allArrCopy1.get(i), allArrCopy2.get(i));
//		}
//	}
//
//	private static void executeAndPrintOutput() {
//		ArrayList<ArrayList<Integer>> allArrCopy1 = allArr1;
//		ArrayList<ArrayList<Integer>> allArrCopy2 = allArr2;
//
//		for (int i = 0; i < t; i++) {
//			boolean ans = validStackPermutation(allArrCopy1.get(i), allArrCopy2.get(i));
//
//			if (ans) {
//				System.out.println("YES");
//			} else {
//				System.out.println("NO");
//			}
//		}
//	}

//	private static boolean validStackPermutation(ArrayList<Integer> first, ArrayList<Integer> other) {
//		Queue<Integer> input = new LinkedList<>();
//		for (int i = 0; i < first.size(); i++) {
//			input.add(first.get(i));
//		}
//		Queue<Integer> output = new LinkedList<>();
//		for (int i = 0; i < other.size(); i++) {
//			output.add(other.get(i));
//		}
//		Stack<Integer> tempStack = new Stack<>();
//		while (!input.isEmpty()) {
//			int ele = input.poll();
//			if (ele == output.peek()) {
//				output.poll();
//				while (!tempStack.isEmpty()) {
//					if (tempStack.peek() == output.peek()) {
//						tempStack.pop();
//						output.poll();
//					}else
//						break;
//				}
//			}
//			else {
//				tempStack.push(ele);
//			}
//		}
//		return (input.isEmpty() && tempStack.isEmpty());
//	}
//
//	public static void main(String[] args) throws IOException {
//		takeInput();
//		executeAndPrintOutput();
//	}
}
