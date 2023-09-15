package group1test;
import java.util.*;
public class Donuts {
	
    private static int[] takeInput(){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[]arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        return arr;
    }

	public static void main(String[] args) {
		int[] arr = takeInput();
		Arrays.sort(arr);
		int ans =0;
		for(int i=1; i< arr.length; i=i+4) {
			ans+=arr[i];
		}
		System.out.println(ans);
	}
}