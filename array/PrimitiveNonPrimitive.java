package array;
import java.util.Scanner;
public class PrimitiveNonPrimitive {
	public static void increment(int i){
        i++;
    }
    public static void printArray(int[]arr){
        int n=arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }

   public static void incrementArray(int[] arr){
       for(int i=0;i<arr.length;i++){
           arr[i]=arr[i]+1;
       }
   }
    
//    public static void incrementArray(int[] input){
//        // System.out.println(input);
//         input=new int[7];
//         for(int i=0;i<input.length;i++){
//             input[i]=input[i]+1;
//         }
//     }
    
	public static void main(String[] args) {
		//int i=10;
	     //increment(i);
	     //System.out.println(i);
	     int[] arr={1,2,3,4,5};
	     incrementArray(arr);
	     printArray(arr);
	}

}
