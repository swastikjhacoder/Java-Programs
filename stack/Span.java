package stack;
import java.util.Scanner;
import java.util.Stack;
import java.util.Vector;
public class Span {

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

	public static int[] stockSpan(int[] price) {
		int span[] = new int[price.length];
		span[0] = 1;
		for (int i = 1; i < price.length; i++) {
			span[i] = 1;
		    for (int j = i - 1; (j >= 0) && (price[i] > price[j]); j--)
		      span[i]++;
		  }
		return span;
	}
	public static void main(String[] args) {
		int price[] = takeInput();
        int S[] = stockSpan(price);
        for(int i=0;i<S.length;i++) {
        	System.out.print(S[i]+" ");
        }
	}

}
