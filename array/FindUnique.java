package array;

import java.util.Scanner;

public class FindUnique {

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
    
    public static int findUnique(int[] arr){
    	for(int i=0;i<arr.length;i++){
            int count=0;
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j])
                	count++;
            }
            if(count==1)
            {
                return arr[i];
            }
        }
        return 0;
    }
    
	public static void main(String[] args) {
		int[] arr=takeInput();
	     //printArray(arr);
	     int unique=findUnique(arr);
	     System.out.println(unique);
	}

}
