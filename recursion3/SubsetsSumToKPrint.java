package recursion3;

import java.util.Scanner;

public class SubsetsSumToKPrint {
	
	static Scanner s = new Scanner(System.in);
	
	public static int[] takeInput() {
		int size = s.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}
	
	public static void printSubsetsSumTok(int input[], int k) {
		int output[]=new int[0];
		subsetsHelper(input,0,k,output);
	}
	
	public static void subsetsHelper(int input[],int si,int k,int output[]){
        if(si==input.length){
            if(k==0)
            {
                for(int i=0;i<output.length;i++){
                    System.out.print(output[i]+" ");
                }
                System.out.println();
                return;
            }
            else
                return;
        }
        subsetsHelper(input,si+1,k,output);
        int newoutput[]=new int[output.length+1];
        int i=0;
        for( ;i<output.length;i++) {
            newoutput[i]=output[i];
        }
        newoutput[i]=input[si];
        subsetsHelper(input,si+1,k-input[si],newoutput);
    }
	
	public static void main(String[] args) {
		int[] input = takeInput();
		int k = s.nextInt();
		printSubsetsSumTok(input, k);
	}

}
