package recursion;
import java.util.Scanner;
public class elementIndex {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int arr[] = new int [n];
		for(int i=0; i<n; i++) {
			arr[i] = s.nextInt();
		}
		int x = s.nextInt();
		System.out.println(firstIndex(arr, x));
		s.close();
	}
	public static int firstIndex(int input[], int x) {
		return searchArray(input, x, 0);
	}
	
	public static int searchArray(int input[], int x, int si) {
		if (si == input.length-1){
	         return -1;
	      }
	      if (input[si] == x){
	         return si;
	      }
	      return searchArray(input, x, si+1);
	}
}
