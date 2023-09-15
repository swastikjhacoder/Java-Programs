package test3;
import java.util.*;
public class Leaders {

	public static void printArray(int[]arr){
        int n=arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
	
    public static int[] takeInput(){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[]arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        return arr;
    }
    
	public static void printLeaders(int input[])
    {
//		for (int i = 0; i < input.length; i++)
//        {
//            int j;
//            for (j = i + 1; j < input.length; j++)
//            {
//                if (input[i] <=input[j])
//                    break;
//            }
//            if (j == input.length)
//                System.out.print(input[i] + " ");
//        }
		
		int max=Integer.MIN_VALUE;
        for(int i=input.length-1;i>=0;i--)
        {
            if(input[i]>=max)
            {
                System.out.print(input[i]+" ");
                max=input[i];
            }
        }
    }
 
	public static void main(String[] args) {
		int[] arr = takeInput();
		printLeaders(arr);
	}

}
