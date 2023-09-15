package fulltest1;
import java.util.HashMap;
import java.util.Scanner;
public class CheckSubset {
	static Scanner s  = new Scanner(System.in);
	
	public static void main(String[] args) {
		int n = s.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++){
			arr[i] = s.nextInt();
		} 
		n = s.nextInt();
		int arr1[] = new int[n];
		for(int i=0;i<n;i++){
			arr1[i] = s.nextInt();
		} 
		System.out.println(checksubset(arr,arr.length,arr1,arr1.length));
		s.close();
	}

	public static boolean checksubset(int[] arr1, int n1, int[] arr2, int n2) {
		HashMap<Integer,Integer> hashMap = new HashMap<>();
        for (int i =0;i<n1;i++){
            if (hashMap.containsKey(arr1[i])) hashMap.put(arr1[i],hashMap.get(arr1[i])+1);
            else hashMap.put(arr1[i],1);
        }
        for (int i =0;i<n2;i++){
            if (!hashMap.containsKey(arr2[i]) || hashMap.get(arr2[i])==0) return false;
            hashMap.put(arr2[i],hashMap.get(arr2[i])-1);
        }
        return true;
	}
}
