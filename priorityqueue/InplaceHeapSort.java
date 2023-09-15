package priorityqueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class InplaceHeapSort {
	
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));;
	static StringTokenizer st;
	
	public static void inplaceHeapSort(int arr[]) {
		for(int i=0;i<arr.length;i++) {
            insertMin(arr,i);
        }
        for(int i=0;i<arr.length;i++) {
        	arr[arr.length-1-i]=removeMin(arr,arr.length-i);
        }
	}
	
	public static void insertMin(int arr[],int i) {
        int childindex = i;
        int parentindex = (i - 1) / 2;
        while(childindex > 0) {
            if(arr[parentindex] > arr[childindex]) {
                int temp = arr[parentindex];
                arr[parentindex] = arr[childindex];
                arr[childindex] = temp;
                childindex = parentindex;
                parentindex= (childindex - 1) / 2;

            }else {
                return;
            }
        }
    }
    
    public static int removeMin(int arr[],int heapsize){
        int temp = arr[0];
        arr[0] = arr[heapsize - 1];
        heapsize--;
        int lchild = 1;    
        int rchild = 2;
        int parentindex = 0;
        int minindex = parentindex;
        while(lchild < heapsize) {
            if(arr[lchild] < arr[minindex])
                minindex = lchild;
            if(rchild < heapsize && arr[rchild] < arr[minindex])
                minindex = rchild;
            if(parentindex == minindex)
                break;
            else{
                int temp1 = arr[parentindex];
                arr[parentindex] = arr[minindex];
                arr[minindex] = temp1;
                parentindex = minindex;
                lchild = 2 * parentindex + 1;
                rchild = 2 * parentindex + 2;
                }
        }
        return temp;  
    }

	public static void main(String[] args) throws NumberFormatException, IOException {
		st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		int input[] = new int[n];
		for (int i = 0; i < n; i++) {
			input[i] = Integer.parseInt(st.nextToken());
		}
		inplaceHeapSort(input);
		for (int i : input) {
			System.out.print(i + " ");
		}
	}

}

/*
public class InplaceHeapSort{
int parentIndex=i;
int leftChildIndex= 2*parentIndex+1;
int rightChildIndex= 2*parentIndex+2;

whlie(leftChildIndex<n){
    int minIndex= parentIndex;
    if(arr[leftChildIndex] <arr[minIndex]){
        minIndex=leftChildIndex;
    }

    if(rightChild<n && arr[rightChildIndex]<arr[minIndex]){
        minIndex= rightChlidIndex;
    }
    if(minIndex==parentIndex){
        return ;
    }
    int temp= arr[parentIndex];
    arr[parentIndex] = arr[minIndex];
    arr[minIndex]= temp;
    parentIndex= minIndex;
    leftChildIndex= 2*parentIndex+1;
    rightChildIndex= 2*parentIndex+2;

}


public static void heapSort(int[] arr){
    //Build the heap
    int n= arr.length;
    for(int i=(n/2)-1; i>=0;i--){
        downHeapify(arr,i,n);
    }
    //Remove elemts from starting one by one, and put them at respective last position
    for(int i=n-1;i>=0;i--){
      int temp= arr[i];
      arr[i]= arr[0];
      arr[0]= temp;
      downHeapify(arr, 0,i);
    }
}
public static void main(String[] args){
    int[] arr= {4,7,3,2,8,9,6,1};
    heapSort(arr);
    for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]);
    }
}
}
*/