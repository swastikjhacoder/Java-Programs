package group1test;
import java.util.Scanner;
public class MaxSubArraySum {
	
    public static int[] takeInput(){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[]arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        return arr;
    }
    
    static int maxSubArraySum(int a[]) {
        int size = a.length;
        int output = Integer.MIN_VALUE, smallOutput= 0;
  
        for (int i = 0; i < size; i++) {
        	smallOutput = smallOutput + a[i];
            if (output < smallOutput)
            	output = smallOutput;
            if (smallOutput < 0)
            	smallOutput = 0;
        }
        return output;
    }

	public static void main(String[] args) {
		int[] arr = takeInput();
		System.out.println(maxSubArraySum(arr));
	}
}
