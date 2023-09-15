package sortingsearching;

import java.util.Scanner;

public class Sort012 {

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
    
	public static void sort012(int[] arr) {
		int countzero=0;
	    int countone=0;
	    int counttwo=0;
	    int i=0;
	    while (i<arr.length)
	    {
	        if( arr[i]==0)
	        {
	            countzero=countzero+1;
	        }
	        if (arr[i]==1)
	        {
	            countone=countone+1;
	        }
	        if(arr[i]==2)
	        {
	            counttwo=counttwo+1;
	        }
	        i=i+1;
	    }
	    i=0;
	    while(i<countzero)
	    {
	        arr[i]=0;
	        i=i+1;
	    }  
	    while(i<countone+countzero)  
	    {
	        arr[i]=1;  
	        i=i+1;
	    }
	    while(i<counttwo+countone+countzero)  
	    {
	        arr[i]=2;  
	        i=i+1;  
	    }
	}
	
	public static void main(String[] args) {
		int[] arr=takeInput();
		sort012(arr);
		printArray(arr);
	}

}
