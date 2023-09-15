package array;

public class CodeSnippet {
//	public static int sum(int [] arr)
//	{
//	    int arrsum=0;
//	    for(int i=0;i<5;i++)
//	    arrsum+=arr[i];
//	    return arrsum;
//	}
	
//	public static void mul(int [] arr)
//	{
//	    for(int i=0;i<5;i++)
//	    arr[i]*=i;
//
//	}
	
//	 public static void change(int input[]){
//		 input[0] = 15;
//	 }
	
//	public static void change(int input[]){
//	    input = new int[5];
//	    input[0] = 15;
//	    }
	
	public static int[] change(int input[]){
		input = new int[5];
		input[0] = 15;
		return input;
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		boolean arr[] = new boolean[5];
//		System.out.println(arr[0]);

//		int arr[] = new int[5];
//	      arr[1] = 10;
//	      arr = new int[2];
//	      System.out.println(arr[0]);   
		
//		int arr[]={1,2,3,4,5,6,7,8};
//		System.out.print(sum(arr));
		
//		 int arr[]={1,2,3,4,5};
//		    mul(arr);
//		    for(int i=0;i<5;i++)
//		    {
//		        System.out.print(arr[i]);
//		    }
		
//		 int arr[] = new int[5];
//	     change(arr);
//	     System.out.println(arr[0]);
		
		int arr[] = new int[5];
	    arr=change(arr);
	    System.out.println(arr[0]);
	}

}
