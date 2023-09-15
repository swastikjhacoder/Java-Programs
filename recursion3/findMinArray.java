package recursion3;

public class findMinArray {
	
	public static int findMin(int[] input,int startIndex) {
		if(startIndex == input.length) {
			return Integer.MAX_VALUE;
		} 
		int minSmallArray = findMin(input, startIndex + 1);
		if(input[startIndex]<minSmallArray) {
			return input[startIndex];
		} else {
			return minSmallArray;
		}
	}
	
	public static void printMin1(int []a) {
		int min = findMin(a,0);
		System.out.println(min);
	}
	
	public static void printMin2(int []a, int startIndex, int minSoFar) {
		if(startIndex == a.length) {
			System.out.println(minSoFar);
			return;
		}
		int newMinimum = minSoFar;
		if(a[startIndex] < minSoFar) {
			newMinimum = a[startIndex];
		}
		printMin2(a,startIndex +1, newMinimum);
	}

	public static void main(String[] args) {
		int a[] = {3,4,2,10,7,8};
		printMin2(a,0,Integer.MAX_VALUE);
	}

}
