package recursion3;

import java.util.Scanner;

public class SubsetArray {
	
	public static int[] takeInput() {
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}
	
	public static int[][] subsets(int input[]) {
		return subsetHelper(input,0);
	}
	
	public static int[][] subsetHelper(int input[],int si) {
        if(si >= input.length) {
            int ans[][] = new int[1][0];
            return ans;
        }
        int[][] smallans = subsetHelper(input, si + 1);
        int[][] ans = new int[smallans.length * 2][];
        int k = 0;
        for(int i = 0; i < smallans.length; i++) {
            ans[i] = new int[smallans[i].length];
            for(int j = 0; j < smallans[i].length; j++) {
                ans[i][j] = smallans[i][j];
            }
            k++;
        }
        for(int i = 0; i < smallans.length; i++) { 
        	ans[k + i] = new int[smallans[i].length + 1];
        	ans[k + i][0] = input[si];
            for(int j = 1; j <= smallans[i].length; j++) {
                ans[i + k][j] = smallans[i][j - 1];
            }
        }
        return ans;
	}

	public static void main(String[] args) {
		int[] input = takeInput();
		int output[][] = subsets(input);
		for(int i = 0; i < output.length; i++) {
			for(int j = 0; j < output[i].length; j++) {
				System.out.print(output[i][j] + " ");
			}
			System.out.println();
		}
	}

}
