package group2test;

import java.util.Scanner;

public class Subset {
	
	public static boolean subsetSumToKIdentical(int input[], int n,int k){
		int[][] ans = subsetsSumK(input, k);
		int sum = 0;
		for(int i = 0; i < ans.length; i++) {
			for(int j = 0; j < ans[0].length; j++) {
				sum += ans[i][j];
			}
		}
		return(sum == k);
	}
	
	public static int[][] subsetsSumK(int input[], int k) {
        return helper(input,k,0);
    }
    
	public static int[][] helper(int input[], int k,int si) {
        if(si==input.length)
        {
            if(k==0)
                return new int[1][0];
            else
                return new int[0][0];
        }
    int op1[][]=helper(input,k-input[si],si+1);
    int op2[][]=helper(input,k,si+1);
    int output[][]=new int[op1.length+op2.length][];
    int l=0;
    for(int i=0;i<op2.length;i++){
        output[i]=new int[op2[i].length];
        for(int j=0;j<op2[i].length;j++)
            output[l][j]=op2[i][j];
        l++;
    }
    for(int i=0;i<op1.length;i++){
        output[i+l]=new int[op1[i].length+1];
        output[i+l][0]=input[si];
        for(int j=1;j<=op1[i].length;j++){
            output[i+l][j]=op1[i][j-1];
        }}
        return output;
    }
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
       		int input[] = new int[n];
		for(int i = 0;i < n; i++)
			input[i] = s.nextInt();
		int k = s.nextInt();
		if(subsetSumToKIdentical(input,n,k))
			System.out.println("true");
		else
			System.out.println("false");
		
	}
}
