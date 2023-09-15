package recursion;
import java.util.Scanner;
public class IsNumberExist {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int arr[] = new int [n];
		for(int i=0; i<n; i++) {
			arr[i] = s.nextInt();
		}
		int x = s.nextInt();
		System.out.println(checkNumber(arr, x));
		s.close();
	}
	public static boolean checkNumber(int input[], int x) {
		return searchArray(input, x, input.length-1);
	}
	
	public static boolean searchArray(int input[], int x, int size) {
		if (size == 0){
	         return false;
	      }
	      if (input[size-1] == x){
	         return true;
	      }
	      return searchArray(input, x, size-1);
	}
}
