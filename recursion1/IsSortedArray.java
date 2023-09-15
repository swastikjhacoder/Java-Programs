package recursion;
import java.util.Scanner;
public class IsSortedArray {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int arr[] = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = s.nextInt();
		}
		boolean res = isSorted(arr, 0);
		System.out.println(res);
		s.close();
	}

	public static boolean isSorted(int arr[], int si) {
		if(si == arr.length-1) {
			return true;
		}
		if(arr[si] > arr[si+1]) {
			return false;
		}
		boolean output = isSorted(arr, si+1);
		return output;
	}
}
