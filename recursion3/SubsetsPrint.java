package recursion3;

import java.util.Scanner;

public class SubsetsPrint {

	public static int[] takeInput() {
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}
	
	public static void printSubsets(int input[]) {
		int output[]=new int[0];
        printSubsetsHelper(input,0,output);
	}
	
	public static void printSubsetsHelper(int input[],int si,int output[])
    { 
        if(si==input.length) {
            for(int i:output){
                System.out.print(i+" ");
            }
            System.out.println();
            return;
        }
        printSubsetsHelper(input,si+1,output);
        int newoutput[]=new int[output.length+1];
        int j=0;
        for( ;j<output.length;j++) {
            newoutput[j]=output[j];
        }
        newoutput[j]=input[si];
        printSubsetsHelper(input,si+1,newoutput);
    }
	
	public static void main(String[] args) {
		int[] input = takeInput();
		printSubsets(input);
	}

}
