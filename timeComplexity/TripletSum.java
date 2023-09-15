package timeComplexity;

import java.util.*;
public class TripletSum {

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

    public static int tripletSum(int[] arr, int num) {
    	int n=arr.length;
        int numPair=0;
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            int sum=num-arr[i];
            int pairSum = tripletSum(arr,i+1,n-1,sum);
            numPair+=pairSum;
        }
        
        return numPair;
    }
    
    public static int tripletSum(int[] arr,int startIndex,int endIndex,int num){
        int numPair=0;
        
        while(startIndex<endIndex){
        if(arr[startIndex]+arr[endIndex]<num){
            startIndex++;
        }
        else if(arr[startIndex]+arr[endIndex] >num){
            endIndex--;
        }
        else{
            int elementAtStart=arr[startIndex];
            int elementAtend = arr[endIndex];
            if(elementAtStart==elementAtend){
                int totalElement=(endIndex - startIndex) +1;
                numPair+=(totalElement*(totalElement-1))/2;
                return numPair;
            }
            int tempStartIndex=startIndex+1;
            int tempEndIndex=endIndex-1;
            while(tempStartIndex<=tempEndIndex && arr[tempStartIndex]==arr[startIndex]){
                tempStartIndex+=1;
            }
            while(tempEndIndex>=tempStartIndex && arr[tempEndIndex]==arr[endIndex]){
                tempEndIndex-=1;
            }
            int totalElementFromStart= tempStartIndex-startIndex;
            int totalElementFromEnd = endIndex-tempEndIndex;
            
            numPair+=(totalElementFromStart * totalElementFromEnd);
            
            startIndex=tempStartIndex;
            endIndex=tempEndIndex;
        }
    }
    
    return numPair ;
} 
    
	public static void main(String[] args) {
		int arr[] = takeInput();
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		int res = tripletSum(arr,x);
		System.out.println(res);
	}

}
