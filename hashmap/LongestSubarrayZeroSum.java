package hashmap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.HashMap;

public class LongestSubarrayZeroSum {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));;
	static StringTokenizer st;
	
	public static int lengthOfLongestSubsetWithZeroSum(int arr[]) {
		if (arr == null || arr.length == 0) {
            return 0;
        }
        int maxLength = 0;
        int[] sum = new int[arr.length];
        HashMap<Integer, Integer> map = new HashMap<>();
        sum[0] = arr[0];
        if (arr[0] == 0) {
            maxLength = 1;
        }
        map.put(arr[0], 0);
        for (int i = 1; i < arr.length; i++) {
            sum[i] = sum[i - 1] + arr[i];
            if (sum[i] == 0) {
                maxLength = i + 1;
            } else if (map.containsKey(sum[i])) {
                if (i - map.get(sum[i]) > maxLength) {
                    maxLength = i - map.get(sum[i]);
                }
            } else {
                map.put(sum[i], i);
            }
        }
        return maxLength;
	}
	
	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int arr[] = new int[n];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		System.out.println(lengthOfLongestSubsetWithZeroSum(arr));
	}

}
