package recursion;
import java.util.Scanner;
public class elementLastIndex {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int arr[] = new int [n];
		for(int i=0; i<n; i++) {
			arr[i] = s.nextInt();
		}
		int x = s.nextInt();
		System.out.println(lastIndex(arr, x));
		s.close();
	}

	static int idx = -1;
	
	static int helper(int input[], int x ,int i){
		if(i == input.length){
			return idx;
		} else if(input[i] == x) {
			if(i > idx ){
				idx = i;
			}
		}
		return helper(input,x,i +1);
	}

	public static int lastIndex(int input[], int x) {
		return helper(input,x,0);
	}
}
