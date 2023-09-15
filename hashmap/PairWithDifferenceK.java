package hashmap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class PairWithDifferenceK {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));;
	static StringTokenizer st;
	
	public static int getPairsWithDifferenceK(int arr[], int k) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int pairCount = 0;
        for(int i : arr) {
            int p1 = i + k;
            boolean flag = false;
            if(i == p1) {
                flag = true;
            }
            if(map.containsKey(p1)) {
                pairCount += map.get(p1);
            }
            int p2 = i - k;
            if(map.containsKey(p2) && !flag) {
                pairCount += map.get(p2);
            }
            if(map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            }
            else { 
                map.put(i, 1);
            }
        } 
        return pairCount;
	}
	
	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int arr[] = new int[n];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		int k = Integer.parseInt(br.readLine());
		System.out.println(getPairsWithDifferenceK(arr, k));
	}

}
